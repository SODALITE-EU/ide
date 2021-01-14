/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.sodalite.dsl.aADM.ENodeTemplateBody
import org.sodalite.dsl.aADM.AADMPackage
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.Set
import java.util.TreeSet
import org.sodalite.dsl.rM.EPropertyDefinitionBody
import org.sodalite.dsl.rM.RMPackage
import org.sodalite.dsl.rM.EParameterDefinitionBody

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AADMScopeProvider extends AbstractAADMScopeProvider {
	static var Set<String> optimization_models = new TreeSet()
	static var Set<String> data_types = new TreeSet()
	
    override public IScope getScope(EObject context, EReference reference) {
        // We want to define the Scope for the Element's superElement cross-reference
        var scope = super.getScope(context, reference)
        if (context instanceof ENodeTemplateBody
                && reference == AADMPackage.Literals.ENODE_TEMPLATE_BODY__OPTIMIZATION) {
            // Collect a list of optimization candidates by going through the model
            // EcoreUtil2 provides useful functionality to do that
            // For example searching for all elements within the root Object's tree
            var optimizations = scope.allElements
            for (opt: optimizations){
            	var desc = opt as IEObjectDescription
            	optimization_models.add(desc.name.toString)
            }
        }else if (context instanceof EParameterDefinitionBody 
        	&& reference == RMPackage.Literals.EPARAMETER_DEFINITION_BODY__TYPE
        	
        ){
        	var types = scope.allElements
            for (type: types){
            	var desc = type as IEObjectDescription
            	data_types.add(desc.name.toString)
            }
        }
        return scope
    }
    
    def static Set<String> getOptimizationModels(){
    	return optimization_models
    }
    
    def static Set<String> getDataTypes(){
    	return data_types
    }
}