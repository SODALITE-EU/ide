/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.validation;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
import org.sodalite.dsl.rM.EPrimary;
import org.sodalite.dsl.rM.RMPackage;
import org.sodalite.dsl.validation.AbstractRMValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class RMValidator extends AbstractRMValidator {
  public static final String INVALID_PATH = "Invalid Path";
  
  @Check
  public void checkImplementationPrimaryPath(final EPrimary primary) {
    String implementationPath = primary.getFile();
    boolean _startsWith = implementationPath.startsWith(".");
    if (_startsWith) {
      String relativePath = primary.getRelative_path();
      if ((relativePath != null)) {
        String _substring = implementationPath.substring(1);
        String _plus = (relativePath + _substring);
        Path path = Paths.get(_plus);
        boolean _exists = Files.exists(path);
        boolean _not = (!_exists);
        if (_not) {
          this.error("This file does not exist taking into the path in \'relative_path\'.", RMPackage.Literals.EPRIMARY__FILE);
        }
      } else {
        String workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replaceAll("%20", " ");
        URI project_uri = primary.eResource().getURI();
        String intermediatePath = project_uri.toString().replaceAll("%20", " ").replace("platform:/resource", "");
        int _segmentCount = project_uri.segmentCount();
        int _minus = (_segmentCount - 1);
        String RMName = project_uri.segment(_minus).replaceAll("%20", " ");
        intermediatePath = intermediatePath.replace(RMName, "");
        String _replace = implementationPath.replace("./", "");
        String _plus_1 = ((workspaceDir + intermediatePath) + _replace);
        Path path_1 = Paths.get(_plus_1);
        boolean _exists_1 = Files.exists(path_1);
        boolean _not_1 = (!_exists_1);
        if (_not_1) {
          this.error("The implementation file does not exist in the local path", RMPackage.Literals.EPRIMARY__FILE);
        }
      }
    }
  }
  
  @Check
  public void checkRelativePath(final EPrimary primary) {
    String implementationPath = primary.getFile();
    boolean _startsWith = implementationPath.startsWith(".");
    if (_startsWith) {
      String relativePath = primary.getRelative_path();
      if ((relativePath != null)) {
        Path path = Paths.get(relativePath);
        boolean _exists = Files.exists(path);
        boolean _not = (!_exists);
        if (_not) {
          this.warning("This path does not exist.", RMPackage.Literals.EPRIMARY__RELATIVE_PATH, RMValidator.INVALID_PATH);
        }
      }
    }
  }
}
