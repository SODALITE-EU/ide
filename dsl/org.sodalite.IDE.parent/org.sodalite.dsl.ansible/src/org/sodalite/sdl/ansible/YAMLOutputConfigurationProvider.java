package org.sodalite.sdl.ansible;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class YAMLOutputConfigurationProvider extends OutputConfigurationProvider {

	public static final String YAML_OUTPUT = "yaml_output";
	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
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
		
		
		OutputConfiguration YAMLOutput = new OutputConfiguration(YAML_OUTPUT);
		YAMLOutput.setDescription("YAML Output Folder");
		YAMLOutput.setOutputDirectory("./");
		YAMLOutput.setOverrideExistingResources(true);
		YAMLOutput.setCreateOutputDirectory(true);
		YAMLOutput.setCleanUpDerivedResources(false);
		YAMLOutput.setSetDerivedProperty(false);
		YAMLOutput.setKeepLocalHistory(true);
		return newHashSet(defaultOutput,YAMLOutput);
	}
	
	
}
