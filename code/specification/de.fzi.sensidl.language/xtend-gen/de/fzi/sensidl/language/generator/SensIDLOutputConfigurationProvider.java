package de.fzi.sensidl.language.generator;

import java.util.Set;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * By now this class implements the same behaviour like the default
 * implementation of the OutputConfigurationProvider. It defines the
 * an entry to specify a different generation location.
 */
@SuppressWarnings("all")
public class SensIDLOutputConfigurationProvider extends OutputConfigurationProvider {
  public final static String SENSIDL_GEN = "./src-gen";
  
  public Set<OutputConfiguration> getOutputConfigurations() {
    Set<OutputConfiguration> _outputConfigurations = super.getOutputConfigurations();
    final Procedure1<Set<OutputConfiguration>> _function = new Procedure1<Set<OutputConfiguration>>() {
      public void apply(final Set<OutputConfiguration> it) {
        OutputConfiguration _head = IterableExtensions.<OutputConfiguration>head(it);
        _head.setOutputDirectory(SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      }
    };
    return ObjectExtensions.<Set<OutputConfiguration>>operator_doubleArrow(_outputConfigurations, _function);
  }
}
