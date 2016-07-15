package de.fzi.sensidl.language.extensions.todo

import org.eclipse.ui.preferences.ScopedPreferenceStore
import org.eclipse.core.runtime.preferences.InstanceScope
import java.io.IOException
import org.apache.log4j.Logger

class SensIDLTodoTaskCustomizer {
	private static val SENSIDL_TODO_TAG = "SENSIDL_TODO";
	private static val JDT_PROPERTIES_QUALIFIER = "org.eclipse.jdt.core";
	private static val TODO_TASK_TAG_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskTags";
	private static val TODO_TASK_PRIORITY_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskPriorities";
	private static val SENSIDL_TODO_TAG_PRIORITY = "NORMAL";
	
	private static val Logger logger = Logger.getLogger(SensIDLTodoTaskCustomizer);
	
	public static def getSensIDLTodoTag() {
		registerSensIDLTodoTagIfNecessary();
		
		return SENSIDL_TODO_TAG;
	}
	
	private static def registerSensIDLTodoTagIfNecessary() {
		val jdt = new ScopedPreferenceStore(InstanceScope.INSTANCE, JDT_PROPERTIES_QUALIFIER);
		
		addSensIDLTodoTag(jdt);
        
        try {
            jdt.save();
        } catch (IOException e) {
            logger.error("Error occurred, preferences could not be saved.", e);
        }
	}
	
	private static def addSensIDLTodoTag(ScopedPreferenceStore jdt) {
		var taskTags = jdt.getString(TODO_TASK_TAG_PROPERTY_QUALIFIER);
        if (taskTags.contains(SENSIDL_TODO_TAG)) {
            return;
        }
        
        taskTags = taskTags + "," + SENSIDL_TODO_TAG;
        jdt.putValue(TODO_TASK_TAG_PROPERTY_QUALIFIER, taskTags);
        
        addSensIDLTodoTagPriority(jdt);
	}
	
	private static def addSensIDLTodoTagPriority(ScopedPreferenceStore jdt) {
		var taskPriorities = jdt.getString(TODO_TASK_PRIORITY_PROPERTY_QUALIFIER);
        taskPriorities = taskPriorities + "," + SENSIDL_TODO_TAG_PRIORITY;
        jdt.putValue(TODO_TASK_PRIORITY_PROPERTY_QUALIFIER, taskPriorities);
	}
}