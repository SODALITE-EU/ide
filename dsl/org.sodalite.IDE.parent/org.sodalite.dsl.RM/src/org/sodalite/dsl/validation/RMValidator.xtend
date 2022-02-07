/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.validation

import org.sodalite.dsl.rM.EPrimary
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.Files
import org.sodalite.dsl.rM.RMPackage
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.IssueCodes

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RMValidator extends AbstractRMValidator {
	
	public static val INVALID_PATH = "Invalid Path"
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					RMPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkImplementationPrimaryPath(EPrimary primary){
		var String implementationPath = primary.file
		if(implementationPath.startsWith(".")){
			var String relativePath = primary.relative_path
			if(relativePath !== null){
				var Path path = Paths.get(relativePath+implementationPath.substring(1))
				if(!Files.exists(path)){
					error("This file does not exist taking into account the path in 'relative_path'.",RMPackage.Literals.EPRIMARY__FILE)
				}
			}
			else{
				var String workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replaceAll("%20", " ")
				var URI project_uri =  primary.eResource.URI
				var String intermediatePath = project_uri.toString.replaceAll("%20", " ").replace("platform:/resource", "")
				var String RMName = project_uri.segment(project_uri.segmentCount-1).replaceAll("%20", " ")
				intermediatePath = intermediatePath.replace(RMName,"")
				var Path path = Paths.get(workspaceDir+intermediatePath+implementationPath.replace("./",""))
				if(!Files.exists(path)){
					error("The implementation file does not exist in the local path",RMPackage.Literals.EPRIMARY__FILE)
				}
			}
		}
		else{
			var Path path = Paths.get(implementationPath)
			if(!Files.exists(path)){
				error("The implementation file does not exist in the specified path",RMPackage.Literals.EPRIMARY__FILE)
			}
		}
	}
	
	@Check
	def checkRelativePath(EPrimary primary){
		var String implementationPath = primary.file
		if(implementationPath.startsWith(".")){
			var String relativePath = primary.relative_path
			if(relativePath !== null){
				var Path path = Paths.get(relativePath)
				if(!Files.exists(path)){
					warning("This path does not exist.",RMPackage.Literals.EPRIMARY__RELATIVE_PATH,INVALID_PATH)
				}
			}
		}
	}
	
}
