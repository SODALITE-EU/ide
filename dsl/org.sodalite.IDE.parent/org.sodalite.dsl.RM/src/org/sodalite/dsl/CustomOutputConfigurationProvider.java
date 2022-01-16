package org.sodalite.dsl;

import java.util.Set;
import static com.google.common.collect.Sets.*;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class CustomOutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static final String ANSIBLE_OUTPUT = "ansible_output";
	public static final String TURTLE_OUTPUT = "ttl_output";
	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	//Output configuration provider for the generation of ansible scripts from RM
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		defaultOutput.setKeepLocalHistory(true);
		
		OutputConfiguration ansibleOutput = new OutputConfiguration(ANSIBLE_OUTPUT);
		ansibleOutput.setDescription("Ansible Output Folder");
		ansibleOutput.setOutputDirectory("./");
		ansibleOutput.setOverrideExistingResources(true);
		ansibleOutput.setCreateOutputDirectory(true);
		ansibleOutput.setCleanUpDerivedResources(false);
		ansibleOutput.setSetDerivedProperty(false);
		ansibleOutput.setKeepLocalHistory(true);
		
		OutputConfiguration turtleOutput = new OutputConfiguration(TURTLE_OUTPUT);
		turtleOutput.setDescription("Turtle Output Folder");
		turtleOutput.setOutputDirectory("./");
		turtleOutput.setOverrideExistingResources(true);
		turtleOutput.setCreateOutputDirectory(true);
		turtleOutput.setCleanUpDerivedResources(false);
		turtleOutput.setSetDerivedProperty(false);
		turtleOutput.setKeepLocalHistory(true);
		
		return newHashSet(defaultOutput,ansibleOutput,turtleOutput);
	}

}
