package org.sodalite.dsl.AADM.design;

import static org.sodalite.dsl.aADM.AADMPackage.Literals.AADM_MODEL__INPUTS;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.AADM_MODEL__NODE_TEMPLATES;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.AADM_MODEL__OUTPUTS;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.AADM_MODEL__POLICIES;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.ENODE_TEMPLATE_BODY__ATTRIBUTES;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.ENODE_TEMPLATE_BODY__CAPABILITIES;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.ENODE_TEMPLATE_BODY__PROPERTIES;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.ENODE_TEMPLATE_BODY__REQUIREMENTS;
import static org.sodalite.dsl.aADM.AADMPackage.Literals.EPOLICY_DEFINITION_BODY__TRIGGERS;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.sodalite.dsl.aADM.EAttributeAssignments;
import org.sodalite.dsl.aADM.ECapabilityAssignments;
import org.sodalite.dsl.aADM.ENodeTemplates;
import org.sodalite.dsl.aADM.EPolicies;
import org.sodalite.dsl.aADM.ERequirementAssignments;
import org.sodalite.dsl.aADM.ETriggerDefinitions;
import org.sodalite.dsl.rM.EInputs;
import org.sodalite.dsl.rM.EOutputs;
import org.sodalite.dsl.rM.EPropertyAssignments;

/**
 * This trigger captures model delete notifications on AADM collections, so that
 * the collection can be removed in case it is empty.
 * 
 * @author yosu
 *
 */
public class AADMModelChangeTrigger implements ModelChangeTrigger {

	private TransactionalEditingDomain domain;

	public AADMModelChangeTrigger(TransactionalEditingDomain domain) {
		super();
		this.domain = domain;
	}

	@Override
	public int priority() {
		return 0;
	}

	public static final NotificationFilter PROPERTY_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof EPropertyAssignments && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter INPUT_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof EInputs && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter OUPUT_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification output) {
			return output.getNotifier() instanceof EOutputs && output.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter ATTRIBUTE_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof EAttributeAssignments && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter REQUIREMENT_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof ERequirementAssignments
					&& input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter CAPABILITY_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof ECapabilityAssignments && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter TRIGGER_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof ETriggerDefinitions && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter NODE_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof ENodeTemplates && input.getEventType() == Notification.REMOVE;
		}
	};

	public static final NotificationFilter POLICY_REMOVED_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof EPolicies && input.getEventType() == Notification.REMOVE;
		}
	};

	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		for (Notification notif : notifications) {
			if (notif.getEventType() == Notification.REMOVE) {
				Command result = new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						if (notif.getNotifier() instanceof EPropertyAssignments) {
							EPropertyAssignments pa = (EPropertyAssignments) notif.getNotifier();
							if (pa.getProperties().isEmpty()) {
								pa.eContainer().eSet(ENODE_TEMPLATE_BODY__PROPERTIES, null);
							}
						} else if (notif.getNotifier() instanceof EInputs) {
							EInputs parDefs = (EInputs) notif.getNotifier();
							if (parDefs.getParameters().isEmpty()) {
								parDefs.eContainer().eSet(AADM_MODEL__INPUTS, null);
							}
						} else if (notif.getNotifier() instanceof EOutputs) {
							EOutputs parDefs = (EOutputs) notif.getNotifier();
							if (parDefs.getParameters().isEmpty()) {
								parDefs.eContainer().eSet(AADM_MODEL__OUTPUTS, null);
							}
						} else if (notif.getNotifier() instanceof EAttributeAssignments) {
							EAttributeAssignments aas = (EAttributeAssignments) notif.getNotifier();
							if (aas.getAttributes().isEmpty()) {
								aas.eContainer().eSet(ENODE_TEMPLATE_BODY__ATTRIBUTES, null);
							}
						} else if (notif.getNotifier() instanceof ERequirementAssignments) {
							ERequirementAssignments ras = (ERequirementAssignments) notif.getNotifier();
							if (ras.getRequirements().isEmpty()) {
								ras.eContainer().eSet(ENODE_TEMPLATE_BODY__REQUIREMENTS, null);
							}
						} else if (notif.getNotifier() instanceof ECapabilityAssignments) {
							ECapabilityAssignments cas = (ECapabilityAssignments) notif.getNotifier();
							if (cas.getCapabilities().isEmpty()) {
								cas.eContainer().eSet(ENODE_TEMPLATE_BODY__CAPABILITIES, null);
							}
						} else if (notif.getNotifier() instanceof ETriggerDefinitions) {
							ETriggerDefinitions tds = (ETriggerDefinitions) notif.getNotifier();
							if (tds.getTriggers().isEmpty()) {
								tds.eContainer().eSet(EPOLICY_DEFINITION_BODY__TRIGGERS, null);
							}
						} else if (notif.getNotifier() instanceof ENodeTemplates) {
							ENodeTemplates tts = (ENodeTemplates) notif.getNotifier();
							if (tts.getNodeTemplates().isEmpty()) {
								tts.eContainer().eSet(AADM_MODEL__NODE_TEMPLATES, null);
							}
						} else if (notif.getNotifier() instanceof EPolicies) {
							EPolicies tds = (EPolicies) notif.getNotifier();
							if (tds.getPolicies().isEmpty()) {
								tds.eContainer().eSet(AADM_MODEL__POLICIES, null);
							}
						}
					}
				};
				return Options.newSome(result);
			}
		}
		return Options.newNone();
	}
}
