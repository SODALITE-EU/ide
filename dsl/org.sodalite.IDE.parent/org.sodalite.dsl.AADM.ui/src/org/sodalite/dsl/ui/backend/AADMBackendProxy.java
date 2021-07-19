package org.sodalite.dsl.ui.backend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.sodalite.dsl.AADM.ui.internal.AADMActivator;
import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPolicyDefinition;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageReport;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatus;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization.KBIssue;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSuggestion;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.kb_reasoner_client.types.PDSUpdateReport;
import org.sodalite.dsl.optimization.optimization.EAITraining;
import org.sodalite.dsl.optimization.optimization.EAITrainingCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;
import org.sodalite.dsl.optimization.optimization.Optimization_Model;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.RMPackage;
import org.sodalite.dsl.ui.helper.AADMHelper;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.dsl.ui.validation.ValidationIssue;
import org.sodalite.ide.ui.logger.SodaliteLogger;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.inject.Injector;

public class AADMBackendProxy extends RMBackendProxy {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	private void generateAADMModel(IFile aadmFile, IProgressMonitor monitor) {
		try {
			URI aadmURI = URI.createURI(aadmFile.getFullPath().toPortableString());
			Injector injector = AADMActivator.getInstance().getInjector(AADMActivator.ORG_SODALITE_DSL_AADM);
			ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			Resource r = resourceSet.getResource(aadmURI, true);
			r.load(null);
			IGenerator2 generator = injector.getInstance(IGenerator2.class);
			EclipseResourceFileSystemAccess2 fsa = injector.getInstance(EclipseResourceFileSystemAccess2.class);
			SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
			subMonitor.setTaskName("Converting AADM into Turtle");
			fsa.setMonitor(subMonitor);
			IProject project = aadmFile.getProject();
			IFile output = project.getFile("src-gen");
			fsa.setOutputPath(output.getLocation().toOSString());
			generator.doGenerate(r, fsa, new GeneratorContext() {
				@Override
				public CancelIndicator getCancelIndicator() {
					return CancelIndicator.NullImpl;
				}
			});
		} catch (IOException e) {
			SodaliteLogger.log("Error generating the AADM model", e);
		}
	}

	public void processSaveAADM(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile aadmFile = AADMHelper.getSelectedFile();
		if (aadmFile == null)
			throw new Exception("Selected AADM could not be found");

		IProject project = aadmFile.getProject();
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile, project);
		String aadmURI = getModelURI(aadmFile, project);

		// Send model to the KB
		saveAADM(aadmTTL, aadmFile, aadmURI, project, event);
	}

	public void processOptimizeAADM(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile aadmFile = AADMHelper.getSelectedFile();
		if (aadmFile == null)
			throw new Exception("Selected AADM could not be found");

		IProject project = aadmFile.getProject();
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile, project);

		// Send model to the KB
		String aadmURI = getModelURI(aadmFile, project);
		optimizeAADM(aadmTTL, aadmFile, aadmURI, project, event);
	}

	public void processDeployAADM(ExecutionEvent event, IFile aadmFile, Path inputs_yaml_path, Path imageBuildConfPath,
			String version_tag, int workers, String deployment_name, String monitoring_id, String username,
			boolean completeModel) throws Exception {
		// Return selected resource
		// IFile aadmFile = AADMHelper.getSelectedFile(); // FIX Bug
		if (aadmFile == null)
			throw new Exception("Selected AADM could not be found");
		IProject project = aadmFile.getProject();
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile, project);

		// Deploy AADM model
		String aadmURI = getModelURI(aadmFile, project);
		deployAADM(aadmTTL, aadmFile, aadmURI, inputs_yaml_path, imageBuildConfPath, version_tag, workers,
				completeModel, deployment_name, monitoring_id, username, project, event);
	}

	public void processBuildImages(Path imageBuildConfPath) throws Exception {
		buildImages(imageBuildConfPath);
	}

	public void processPDSUpdate(Path inputsFilePath, String namespace, String platformType) {
		pdsUpdate(inputsFilePath, namespace, platformType);
	}

	private void saveAADM(String aadmTTL, IFile aadmFile, String aadmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Save AADM", (ICoreRunnable) monitor -> {
			try {
				// Generate Model
				generateAADMModel(aadmFile, monitor);

				// Read RM DSL as plain text
				String aadmDSL = AADMHelper.readFile(aadmFile);

				// Get module (namespace) from RM
				String namespace = AADMHelper.getModule(aadmFile, event);

				// TODO Ask user on save model whether to complete the model by KB
				boolean complete = false;
				String name = aadmFile.getName();
				KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, name, namespace, aadmDSL,
						complete);
				processValidationIssues(aadmFile, saveReport, event);
				if (saveReport.getURI() == null && saveReport.getErrors() == null) {
					throw new Exception(
							"The AADM model could not be saved into the KB. Please, contact your Sodalite administrator");
				}
				saveURI(saveReport.getURI(), aadmFile, project);

				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						String message = "The selected AADM model has been successfully store in the KB with URI:\n"
								+ saveReport.getURI();
						showInfoDialog(saveReport.getURI(), "Save AADM", message);
						SodaliteLogger.log(message);
					}
				});
			} catch (NotRolePermissionException ex) {
				showErrorDialog(null, "Save AADM", "You have not permissions to save the model in the declared module. "
						+ "\nPlease, contact the AAI SODALITE administrator");
			} catch (Exception e) {
				showErrorDialog(null, "Save AADM",
						"There were problems to store the AADM into the KB: " + e.getMessage());
				SodaliteLogger.log("There were problems to store the AADM into the KB", e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void optimizeAADM(String aadmTTL, IFile aadmFile, String aadmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Get AADM optimization recommendations", (ICoreRunnable) monitor -> {
			try {
				// Generate Model
				generateAADMModel(aadmFile, monitor);

				KBOptimizationReportData optimizationReport = getKBReasoner().optimizeAADM(aadmTTL, aadmURI);
				processOptimizationIssues(aadmFile, optimizationReport, event);
				if (optimizationReport.getURI() == null && optimizationReport.getErrors() == null) {
					throw new Exception(
							"AADM optimization recommendations could not be retrieved from the KB. Please, contact your Sodalite administrator");
				}
				saveURI(optimizationReport.getURI(), aadmFile, project);
				showInfoDialog(null, "Get AADM optimization recommendations",
						"Optimization recommendations for AADM model has been successfully retrieved from the KB\n. "
								+ "AADM model have been saved with URI:\n" + optimizationReport.getURI());
			} catch (Exception e) {
				showErrorDialog(null, "Get AADM optimization recommendations",
						"There were problems during the processing of AADM optimization recommendations from the KB: "
								+ e.getMessage());
				SodaliteLogger.log(
						"There were problems during the processing of AADM optimization recommendations from the KB",
						e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void deployAADM(String aadmTTL, IFile aadmfile, String aadmURI, Path inputs_yaml_path,
			Path imageBuildConfPath, String version_tag, int workers, boolean completeModel, String deployment_name,
			String monitoring_id, String username, IProject project, ExecutionEvent event) {
		Job job = new Job("Deploy AADM") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				int steps = 1;
				int number_steps = 8;
				if (imageBuildConfPath != null)
					number_steps = 9;

				SubMonitor subMonitor = SubMonitor.convert(monitor, number_steps);
				String[] admin_report = new String[2];

				try {
					// Generate Model
					generateAADMModel(aadmfile, monitor);

					// Save the AADM model into the KB
					subMonitor.setTaskName("Saving AADM");

					// Read RM DSL as plain text
					String aadmDSL = AADMHelper.readFile(aadmfile);

					// Read inputs and convert to JSON
					String inputs_yaml = AADMHelper.readFile(inputs_yaml_path);

					// Get module (namespace) from RM
					String namespace = AADMHelper.getModule(aadmfile, event);

					String aadmName = aadmfile.getName();
					KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, aadmName, namespace,
							aadmDSL, completeModel);
					if (saveReport == null)
						throw new Exception(
								"There was a problem to save the AADM into the KB, please contact Sodalite administrator");

					processValidationIssues(aadmfile, saveReport, event);

					if (saveReport != null && saveReport.hasErrors())
						throw new Exception("There are detected validation issues in the AADM, please fix them");

					saveURI(saveReport.getURI(), aadmfile, project);
					String aadm_id = saveReport.getURI();
					subMonitor.worked(steps++);

					// Ask the AADM JSON serialization to the KB Reasoner
					subMonitor.setTaskName("Getting AADM serialization from the KB");
					String aadmJson = getKBReasoner().getAADM(saveReport.getURI());
					if (aadmJson == null)
						throw new Exception("Processed ADDM could not be obtained from the KB");
					// Save json for debugging
//					Files.write(Paths.get(System.getProperty("user.dir") + "/" + aadmName + ".json"),
//							aadmJson.getBytes());

					subMonitor.worked(steps++);

					// Ask ImageBuilder to build the images
					if (imageBuildConfPath != null) {
						String imageBuildConf = RMHelper.readFile(imageBuildConfPath);
						// Ask ImageBuilder to build the images
						subMonitor.setTaskName("Requesting the creation of images");

						BuildImageReport biReport = getKBReasoner().buildImage(imageBuildConf);

						// Ask ImageBuilder status
						subMonitor.setTaskName("Checking image creation status");

						BuildImageStatusReport statusReport = getKBReasoner()
								.checkBuildImageStatus(biReport.getInvocation_id());
						while (!(statusReport.getStatus() == BuildImageStatus.DONE)) {
							if (statusReport.getStatus() == BuildImageStatus.FAILED)
								throw new Exception("Build image failed as reported by Image Builder");
							TimeUnit.SECONDS.sleep(5);
							statusReport = getKBReasoner().checkBuildImageStatus(biReport.getInvocation_id());
						}
						subMonitor.worked(steps++);
					}

					// Ask IaC Blueprint Builder to build the AADM blueprint
					subMonitor.setTaskName("Generating AADM blueprint");
					IaCBuilderAADMRegistrationReport iacReport = getKBReasoner()
							.askIaCBuilderToRegisterAADM(aadmfile.getName(), aadmfile.getName(), username, aadmJson);
					if (iacReport == null || iacReport.getBlueprint_id().isEmpty())
						throw new Exception("AADM could not be parsed by IaC Builder");
					admin_report[0] = iacReport.getBlueprint_id();
					String message = "IaC Builder blueprint id: " + iacReport.getBlueprint_id();
					SodaliteLogger.log(message);
					subMonitor.worked(steps++);

					// Ask xOpera to deploy the AADM blueprint
					subMonitor.setTaskName("Deploying AADM");
					DeploymentReport depl_report = getKBReasoner().deployAADM(inputs_yaml_path,
							iacReport.getBlueprint_id(), version_tag, workers, deployment_name);
					admin_report[1] = depl_report.getDeployment_id();
					message = "xOpera deployment_id: " + depl_report.getDeployment_id();
					SodaliteLogger.log(message);
					// Remove temporary inputs file
					Files.delete(inputs_yaml_path);

					// Ask xOpera deployment status: info/status (session-token): status JSON
					subMonitor.setTaskName("Checking deployment status");
					DeploymentStatusReport dsr = getKBReasoner()
							.getAADMDeploymentStatus(depl_report.getDeployment_id());
					while (!dsr.getState().equals("success")) {
						if (dsr.getState().equals("failed"))
							throw new Exception("Deployment failed as reported by xOpera");
						TimeUnit.SECONDS.sleep(5);
						dsr = getKBReasoner().getAADMDeploymentStatus(depl_report.getDeployment_id());
					}
					subMonitor.worked(steps++);

					// Report deployment_label, deployment_id to Grafana Registry with IAM -
					subMonitor.setTaskName("Reporting deployment to Monitoring Dashboard (Grafana)");
					getKBReasoner().createMonitoringDashboard(monitoring_id, deployment_name);
					subMonitor.worked(steps++);

					// Report deployment to Refactorer
					subMonitor.setTaskName("Reporting deployment to Refactorer");
					String appName = namespace != null && !namespace.isEmpty() ? namespace
							: aadmName.substring(0, aadmName.indexOf(".aadm"));
					getKBReasoner().notifyDeploymentToRefactoring(appName, aadm_id, depl_report.getBlueprint_id(),
							depl_report.getDeployment_id(), inputs_yaml);
					subMonitor.worked(steps++);

					// Upon completion, show dialog
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "The selected AADM model has been successfully deployed into the Sodalite backend with: \nblueprint id: "
									+ admin_report[0] + "\ndeployment id:" + admin_report[1] + "\nmonitoring id:"
									+ monitoring_id;
							String infoToPaste = "blueprint id: " + admin_report[0] + ", deployment_id: "
									+ admin_report[1] + ", monitoring_id: " + monitoring_id;
							showInfoDialog(infoToPaste, "Deploy AADM", message);
							SodaliteLogger.log(message);
						}
					});
					subMonitor.worked(-1);
					subMonitor.done();
				} catch (NotRolePermissionException ex) {
					showErrorDialog(null, "Save AADM", "You have not permissions to save this model. "
							+ "\nPlease, check your permission in the SODALITE AAI");
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "There were problems to deploy the AADM into the infrastructure: "
									+ e.getMessage()
									+ "\nPlease contact Sodalite administrator and provide her/him this information: "
									+ "blueprint id: " + admin_report[0] + ", deployment id: " + admin_report[1];
							String infoToPaste = "blueprint id: " + admin_report[0] + ", deployment id: "
									+ admin_report[1];
							showErrorDialog(infoToPaste, "Deploy AADM", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error deploying model", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}

		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void buildImages(Path imageBuildConfPath) {
		Job job = new Job("Build images") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				SubMonitor subMonitor = SubMonitor.convert(monitor, 2);
				String[] report = new String[1];
				;
				try {
					// Ask ImageBuilder to build the images
					subMonitor.setTaskName("Requesting the creation of images");

					String imageBuildConf = RMHelper.readFile(imageBuildConfPath);
					BuildImageReport biReport = getKBReasoner().buildImage(imageBuildConf);

					subMonitor.worked(1);

					// Ask ImageBuilder status
					subMonitor.setTaskName("Checking image creation status");

					BuildImageStatusReport bisReport = getKBReasoner()
							.checkBuildImageStatus(biReport.getInvocation_id());
					report[0] = biReport.getInvocation_id();
					while (!(bisReport.getStatus() == BuildImageStatus.DONE)) {
						if (bisReport.getStatus() == BuildImageStatus.FAILED)
							throw new Exception("\nImage Builde failed with response: " + bisReport.getResponse());
						TimeUnit.SECONDS.sleep(5);
						bisReport = getKBReasoner().checkBuildImageStatus(biReport.getInvocation_id());
					}

					// Upon completion, show dialog
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "Images have been successfully created";
							showInfoDialog("", "Save images", message);
						}
					});
					subMonitor.worked(-1);
					subMonitor.done();
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "Build images did not success"
									+ "\nPlease contact Sodalite administrator and provide the reference below"
									+ "\nInvocation_id: " + report[0];
							String infoToPaste = "Invocation_id: " + report[0];
							showErrorDialog(infoToPaste, "Save images", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error building images", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;

			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void pdsUpdate(Path inputsFilePath, String namespace, String platformType) {
		Job job = new Job("PDS update") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				SubMonitor subMonitor = SubMonitor.convert(monitor, 1);

				try {
					// Ask PDS to update
					subMonitor.setTaskName("Requesting update to PDS");

					String inputs = RMHelper.readFile(inputsFilePath);
					PDSUpdateReport report = getKBReasoner().pdsUpdate(inputs, namespace, platformType);
					subMonitor.worked(1);

					// Upon completion, show dialog
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "PDS update have been successfully created with \naadm_uri: "
									+ report.getAadmuri() + "\nrm_uri: " + report.getRmuri();
							showInfoDialog("", "Save images", message);
						}
					});
					subMonitor.worked(-1);
					subMonitor.done();
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "There were problems in PDS to update: " + e.getMessage()
									+ "\nPlease contact Sodalite administrator and report her/him above error message";
							showErrorDialog("", "Save images", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error building images", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;

			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void processOptimizationIssues(IFile aadmFile, KBOptimizationReportData optimizationReport,
			ExecutionEvent event) throws Exception {
		// Check there are not warnings (they do not prevent storage in KB)
		if (optimizationReport != null && (optimizationReport.hasErrors() || optimizationReport.hasWarnings())) {
			// Open AADM file if not opened to show the errors and warnings
			AADMHelper.openFileInEditor(aadmFile);

			List<ValidationIssue> issues = readIssuesFromKB(optimizationReport);
			manageIssues(event, issues);
			if (optimizationReport.hasErrors()) {
				throw new Exception(
						"There are detected validation issues in the associated optimization models, please fix them");
			}
		}

		if (optimizationReport != null
				&& (optimizationReport.hasOptimizationErrors() || optimizationReport.hasOptimizations())) {
			AADM_Model aadmModel = AADMHelper.readAADMModel(aadmFile, event);
			// For each optimization model in the list of issues, open the model and process
			// its issues
			for (String node : getOptimizationNodes(optimizationReport)) {
				String nodeName = node.substring(node.lastIndexOf('/') + 1);
				openOptimizationModel(nodeName, aadmModel);
				List<ValidationIssue> issues = readOptimizationIssuesFromKB(
						getIssuesForModel(optimizationReport, node));
				manageIssues(event, issues);
			}

			if (optimizationReport.hasOptimizationErrors()) {
				throw new Exception(
						"There are detected validation issues in the associated optimization models, please fix them");
			}
		}
	}

	private KBOptimizationReportData getIssuesForModel(KBOptimizationReportData optimizationReport, String node) {
		KBOptimizationReportData result = new KBOptimizationReportData();
		List<KBError> errors = new ArrayList<>();
		for (KBError error : optimizationReport.getOptimizationErrors()) {
			if (error instanceof KBOptimizationError) {
				if (getNodeFromContext(error.getContext()).equals(node)) {
					errors.add(error);
				}
			}
		}
		result.setErrors(errors);
		List<KBOptimization> optimizations = new ArrayList<>();
		for (KBOptimization opt : optimizationReport.getOptimizations()) {
			if (opt.getNodeTemplate().contains(node)) {
				optimizations.add(opt);
			}
		}
		result.setOptimizations(optimizations);
		return result;
	}

	private String getNodeFromContext(String context) {
		return context.substring(context.lastIndexOf('/') + 1);
	}

	private void openOptimizationModel(String node, AADM_Model aadmModel) throws Exception {
		// Find the associated node in the model and read the bound optimization model.
		ENodeTemplate nodeTemplate = null;
		for (ENodeTemplate template : aadmModel.getNodeTemplates().getNodeTemplates()) {
			if (template.getName().equals(node)) {
				nodeTemplate = template;
				break;
			}
		}
		if (nodeTemplate == null)
			throw new Exception("Associated optimization model could not be opened for node: " + node);

		// Find the optimization model location
		Optimization_Model optimizationModel = nodeTemplate.getNode().getOptimization();
		// Open the optimization model
		IFile file = getFileFromModel(optimizationModel);
		AADMHelper.openFileInEditor(file);
	}

	private IFile getFileFromModel(Optimization_Model optimizationModel) {
		URI eUri = optimizationModel.eResource().getURI();
		if (eUri.isPlatformResource()) {
			String platformString = eUri.toPlatformString(true);
			return (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		}
		return null;
	}

	private Set<String> getOptimizationNodes(KBOptimizationReportData optimizationReport) {
		Set<String> nodes = new HashSet<>();
		for (KBError error : optimizationReport.getOptimizationErrors()) {
			KBOptimizationError optError = (KBOptimizationError) error;
			nodes.add(optError.getContext().substring(optError.getContext().lastIndexOf('/') + 1));
		}
		for (KBOptimization opt : optimizationReport.getOptimizations()) {
			nodes.add(opt.getNodeTemplate().substring(opt.getNodeTemplate().lastIndexOf('/') + 1));
		}
		return nodes;
	}

	// TODO Reuse readIssuesFromKB from RMBackendProxy
	private List<ValidationIssue> readIssuesFromKB(KBOptimizationReportData optimizationReport) {
		List<ValidationIssue> issues = new ArrayList<>();

		if (optimizationReport.hasErrors()) {
			for (KBError error : optimizationReport.getErrors()) {
				issues.add(new ValidationIssue(error.getType() + "." + error.getDescription(), error.getContext(), null,
						Severity.ERROR, error.getType(), error.getDescription()));
			}
		}

		if (optimizationReport.hasWarnings()) {
			for (KBWarning warning : optimizationReport.getWarnings()) {
				issues.add(new ValidationIssue(warning.getType() + "." + warning.getDescription(),
						warning.getContext() + "/" + warning.getEntity_name(), warning.getElementType(),
						Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}
		return issues;
	}

	private List<ValidationIssue> readOptimizationIssuesFromKB(KBOptimizationReportData optimizationReport) {
		List<ValidationIssue> issues = new ArrayList<>();

		if (optimizationReport.hasOptimizationErrors()) {
			for (KBError error : optimizationReport.getOptimizationErrors()) {
				KBOptimizationError optError = (KBOptimizationError) error;
				String message = "Optimization error: " + optError.getDescription();
				String path = optError.getPath();
				String path_type = "Optimization";
				String data = optError.toString();
				issues.add(new ValidationIssue(message, path, path_type, Severity.ERROR,
						ValidationIssue.OPTIMIZATION_MISMATCH, data));
			}
		}

		if (optimizationReport.hasOptimizations()) {
			for (KBOptimization optimization : optimizationReport.getOptimizations()) {
				for (KBIssue issue : optimization.getIssues()) {
					String message = "Suggested optimization recommendation: " + beautifySuggestion(issue.getValue());
					String path = issue.getPath();
					String path_type = "Optimization";
					String data = issue.toString();
					issues.add(new ValidationIssue(message, path, path_type, Severity.WARNING,
							ValidationIssue.OPTIMIZATION, data));
				}
			}
		}
		return issues;
	}

	private String beautifySuggestion(String suggestion) {
		return suggestion.replace(":{", ": ").replace("}", "").replace(",", ", ").replace("{", "").replace("\"", "");
	}

	@Override
	protected List<ValidationIssue> readIssuesFromKB(KBSaveReportData saveReport) {
		// Read issues from KB recommendations
		List<ValidationIssue> issues = new ArrayList<>();

		if (saveReport.hasErrors()) {
			for (KBError error : saveReport.getErrors()) {
				String message = error.getDescription() + ": " + error.getEntity_name();
				List<String> hierarchyPath = Arrays.asList(error.getContext(), error.getEntity_name());
				String path = createPath(hierarchyPath);
				String pathType = getPathType(error.getType());
				List<String> type = Arrays.asList(error.getType());
				String code = getCode(type); // Code is used for quick fixes
				List<String> data = Arrays.asList(error.getEntity_name(), error.getContext());
				issues.add(new ValidationIssue(message, path, pathType, Severity.ERROR, code, data));
			}
		}

		if (saveReport.hasWarnings()) {
			for (KBWarning warning : saveReport.getWarnings()) {
				String message = warning.getType() + " ." + warning.getDescription() + " Warning located at: "
						+ warning.getEntity_name();
				List<String> hierarchyPath = Arrays.asList(warning.getContext(), warning.getEntity_name());
				String path = createPath(hierarchyPath);
				String pathType = getPathType(warning.getType());
				List<String> type = Arrays.asList(warning.getType());
				String code = getCode(type); // Code is used for quick fixes
				List<String> data = Arrays.asList(warning.getEntity_name(), warning.getContext());
				issues.add(new ValidationIssue(message, path, pathType, Severity.WARNING, code, data));
			}
		}

		if (saveReport.hasSuggestions()) {
			for (KBSuggestion suggestion : saveReport.getSuggestions()) {
				String message = MessageFormat.format("The following nodes can satisfy the requirement {0}: {1}",
						getDependency(suggestion.getHierarchyPath()), getSuggestedNodes(suggestion.getSuggestions()));
				String path = createPath(suggestion.getHierarchyPath());
				String pathType = getPathType(suggestion.getHierarchyPath());
				String code = getCode(suggestion.getHierarchyPath()); // Code is used for quick fixes
				Map<String, SortedSet<String>> data = new HashMap<>();
				data.put(path, suggestion.getSuggestions());
				issues.add(new ValidationIssue(message, path, pathType, Severity.WARNING, code, data));
			}
		}

		return issues;
	}

	private String getCode(List<String> hierarchyPath) {
		// Assigns a suggestion code based in the issue hierarchy path
		String code = "Suggestion";
		if (hierarchyPath.contains("requirements")) {
			code = ValidationIssue.REQUIREMENT;
		} else if (hierarchyPath.contains("RequiredProperty")) {
			code = ValidationIssue.PROPERTY;
		}

		return code;
	}

	private String getDependency(List<String> entityHierarchy) {
		String dependency = null;
		String result = "";
		for (String entry : entityHierarchy) {
			if (entry.contains("requirements")) {
				int index = entityHierarchy.indexOf(entry) + 1;
				dependency = entityHierarchy.get(index);
				break;
			}
		}
		if (dependency != null)
			result = dependency.substring(dependency.lastIndexOf('/') + 1);
		return result;
	}

	private SortedSet<String> getSuggestedNodes(SortedSet<String> suggestions) {
		return suggestions.stream().map(s -> s.substring(s.lastIndexOf('/') + 1))
				.collect(Collectors.toCollection(TreeSet::new));
	}

	private String getPathType(List<String> entityHierarchy) {
		if (entityHierarchy.contains("requirements")) {
			return "requirements";
		} else {
			return "";
		}
	}

	private String getPathType(String type) {
		if (type.contains("Property") || type.contains("InvalidPortRange") || type.contains("AdminByDefault")
				|| type.contains("HardcodedSecret") || type.contains("InvalidIPAddressBinding"))
			return "Property";
		else if (type.contains("Capability"))
			return "Capability";
		else if (type.contains("Node"))
			return "Node_Template";
		else
			return null;
	}

	private String createPath(List<String> entityHierarchy) {
		StringBuilder sb = new StringBuilder("");
		for (String entry : entityHierarchy) {
			if (entry.contains("https"))
				entry = entry.substring(entry.lastIndexOf('/') + 1);
			sb.append('/' + entry);
		}

		return sb.toString();
	}

	@Override
	protected ValidationSourceFeature getIssueFeature(XtextResource resource, String path, String path_type) {
		// Extract object path to find nodes

		ValidationSourceFeature result = null;
		if (resource.getAllContents().hasNext()) {
			EObject eobject = resource.getAllContents().next();
			if (eobject instanceof AADM_Model) {
				AADM_Model model = (AADM_Model) eobject;
				StringTokenizer st = new StringTokenizer(path, "/");
				result = getAADMIssueFeature(model, path, path_type, st);
			} else if (eobject instanceof Optimization_Model) {
				Optimization_Model model = (Optimization_Model) eobject;
				result = getOptimizationIssueFeature(model, path, path_type);
			}
		}
		return result;
	}

	private ValidationSourceFeature getAADMIssueFeature(AADM_Model model, String path, String path_type,
			StringTokenizer st) {
		ValidationSourceFeature result = null;
		if (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("node_templates".equals(token)) {
				result = getAADMIssueFeatureInNodeTemplate(model, path, path_type, st, result);
			} else if ("policies".equals(token)) {
				result = getAADMIssueFeatureInPolicy(model, path, path_type, st, result);
			}
		}
		return result;
	}

	private ValidationSourceFeature getAADMIssueFeatureInPolicy(AADM_Model model, String path, String path_type,
			StringTokenizer st, ValidationSourceFeature result) {
		if (st.hasMoreTokens()) { // Policy
			String policy_name = st.nextToken();
			for (EPolicyDefinition policy : model.getPolicies().getPolicies()) {
				if (policy.getName().contentEquals(policy_name)) {
					result = new ValidationSourceFeature(policy, AADMPackage.Literals.EPOLICY_DEFINITION__NAME);
					if (st.hasMoreElements()) { // Node_Template children
						String entity_name = st.nextToken();
						if ("Property".equals(path_type)) {
							for (EPropertyAssignment property : policy.getPolicy().getProperties().getProperties()) {
								if (property.getName().contentEquals(entity_name)) {
									result = new ValidationSourceFeature(property,
											RMPackage.Literals.EPROPERTY_ASSIGNMENT__NAME);
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	private ValidationSourceFeature getAADMIssueFeatureInNodeTemplate(AADM_Model model, String path, String path_type,
			StringTokenizer st, ValidationSourceFeature result) {
		if (st.hasMoreTokens()) { // Node_template
			String node_name = st.nextToken();
			for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
				if (node.getName().contentEquals(node_name)) {
					result = new ValidationSourceFeature(node, AADMPackage.Literals.ENODE_TEMPLATE__NAME);
					if (st.hasMoreElements()) { // Node_Template children
						String entity_name = st.nextToken();
						if (path.contains("properties")) {
							if (entity_name.equals("properties"))
								entity_name = st.nextToken();
							if (node.getNode().getProperties() != null) {
								for (EPropertyAssignment property : node.getNode().getProperties().getProperties()) {
									if (property.getName().contentEquals(entity_name)) {
										result = new ValidationSourceFeature(property,
												RMPackage.Literals.EPROPERTY_ASSIGNMENT__NAME);
									}
								}
							}
						} else if (path.contains("requirements")) {
							if (entity_name.equals("requirements"))
								entity_name = st.nextToken();
							boolean req_found = false;
							if (node.getNode().getRequirements() != null) {
								for (ERequirementAssignment req : node.getNode().getRequirements().getRequirements()) {
									// Target requirement found
									if (req.getName().contentEquals(getRequirement(path))) {
										req_found = true;
										result = new ValidationSourceFeature(req,
												AADMPackage.Literals.EREQUIREMENT_ASSIGNMENT__NAME);
									}
								}
							}
							if (!req_found)
								result = new ValidationSourceFeature(node, AADMPackage.Literals.ENODE_TEMPLATE__NAME);

						}
					}
				}
			}
		}
		return result;
	}

	private ValidationSourceFeature getOptimizationIssueFeature(Optimization_Model model, String path,
			String path_type) {
		ValidationSourceFeature result = null;
		JsonObject pathObject = new Gson().fromJson(path, JsonObject.class);
		if (pathObject.has("app_type-ai_training")) {
			EAITrainingCase aiTrainingCase = (EAITrainingCase) model.getOptimization().getApp_optimization();
			result = new ValidationSourceFeature(aiTrainingCase,
					OptimizationPackage.Literals.EAI_TRAINING_CASE__AI_TRAINING);
			JsonObject aiTrainingObject = pathObject.get("app_type-ai_training").getAsJsonObject();
			if (aiTrainingObject.has("data")) {
				EAITraining aiTraining = aiTrainingCase.getAi_training();
				result = new ValidationSourceFeature(aiTraining, OptimizationPackage.Literals.EAI_TRAINING__DATA);
			} else if (aiTrainingObject.has("ai_framework-tensorflow")) {
				EAITraining aiTraining = aiTrainingCase.getAi_training();
				result = new ValidationSourceFeature(aiTraining,
						OptimizationPackage.Literals.EAI_TRAINING__AITRAININGCASE);
			}
		}
		return result;
	}

	private String getRequirement(String path) {
		String req = null;
		Pattern pattern = Pattern.compile("requirements/(.*?)/");
		Matcher matcher = pattern.matcher(path);
		if (matcher.find())
			req = matcher.group(1);
		return req;
	}

}
