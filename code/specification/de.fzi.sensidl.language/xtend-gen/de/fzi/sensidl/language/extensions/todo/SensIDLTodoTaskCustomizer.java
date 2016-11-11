package de.fzi.sensidl.language.extensions.todo;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SensIDLTodoTaskCustomizer {
  private final static String SENSIDL_TODO_TAG = "SENSIDL_TODO";
  
  private final static String JDT_PROPERTIES_QUALIFIER = "org.eclipse.jdt.core";
  
  private final static String TODO_TASK_TAG_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskTags";
  
  private final static String TODO_TASK_PRIORITY_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskPriorities";
  
  private final static String SENSIDL_TODO_TAG_PRIORITY = "NORMAL";
  
  private final static Logger logger = Logger.getLogger(SensIDLTodoTaskCustomizer.class);
  
  public static String getSensIDLTodoTag() {
    SensIDLTodoTaskCustomizer.registerSensIDLTodoTagIfNecessary();
    return SensIDLTodoTaskCustomizer.SENSIDL_TODO_TAG;
  }
  
  private static void registerSensIDLTodoTagIfNecessary() {
    final ScopedPreferenceStore jdt = new ScopedPreferenceStore(InstanceScope.INSTANCE, SensIDLTodoTaskCustomizer.JDT_PROPERTIES_QUALIFIER);
    SensIDLTodoTaskCustomizer.addSensIDLTodoTag(jdt);
    try {
      jdt.save();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        SensIDLTodoTaskCustomizer.logger.error("Error occurred, preferences could not be saved.", e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private static void addSensIDLTodoTag(final ScopedPreferenceStore jdt) {
    try {
      String taskTags = jdt.getString(SensIDLTodoTaskCustomizer.TODO_TASK_TAG_PROPERTY_QUALIFIER);
      boolean _contains = taskTags.contains(SensIDLTodoTaskCustomizer.SENSIDL_TODO_TAG);
      if (_contains) {
        return;
      }
      taskTags = ((taskTags + ",") + SensIDLTodoTaskCustomizer.SENSIDL_TODO_TAG);
      jdt.putValue(SensIDLTodoTaskCustomizer.TODO_TASK_TAG_PROPERTY_QUALIFIER, taskTags);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        SensIDLTodoTaskCustomizer.logger.error("Error occurred, registering SensIDL todo tag failed.", e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    SensIDLTodoTaskCustomizer.addSensIDLTodoTagPriority(jdt);
  }
  
  private static void addSensIDLTodoTagPriority(final ScopedPreferenceStore jdt) {
    try {
      String taskPriorities = jdt.getString(SensIDLTodoTaskCustomizer.TODO_TASK_PRIORITY_PROPERTY_QUALIFIER);
      taskPriorities = ((taskPriorities + ",") + SensIDLTodoTaskCustomizer.SENSIDL_TODO_TAG_PRIORITY);
      jdt.putValue(SensIDLTodoTaskCustomizer.TODO_TASK_PRIORITY_PROPERTY_QUALIFIER, taskPriorities);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        SensIDLTodoTaskCustomizer.logger.error("Error occurred, SensIDL todo tag priority couldn\'t be set.");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
