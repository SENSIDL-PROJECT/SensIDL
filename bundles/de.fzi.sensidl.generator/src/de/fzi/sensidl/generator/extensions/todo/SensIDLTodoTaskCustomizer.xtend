package de.fzi.sensidl.generator.extensions.todo

import org.eclipse.ui.preferences.ScopedPreferenceStore
import org.eclipse.core.runtime.preferences.InstanceScope
import java.io.IOException
import org.apache.log4j.Logger

class SensIDLTodoTaskCustomizer {
	static val SENSIDL_TODO_TAG = "SENSIDL_TODO";
	static val JDT_PROPERTIES_QUALIFIER = "org.eclipse.jdt.core";
	static val TODO_TASK_TAG_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskTags";
	static val TODO_TASK_PRIORITY_PROPERTY_QUALIFIER = "org.eclipse.jdt.core.compiler.taskPriorities";
	static val SENSIDL_TODO_TAG_PRIORITY = "NORMAL";
	
	static val Logger logger = Logger.getLogger(SensIDLTodoTaskCustomizer);
	
	static def getSensIDLTodoTag() {
		if(isEclipseWorkspace)
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
		try {
			var taskTags = jdt.getString(TODO_TASK_TAG_PROPERTY_QUALIFIER);		
		
	        if (taskTags.contains(SENSIDL_TODO_TAG)) {
	            return;
	        }
	        
	        taskTags = taskTags + "," + SENSIDL_TODO_TAG;	        
	        jdt.putValue(TODO_TASK_TAG_PROPERTY_QUALIFIER, taskTags);
	        
	    } catch (Exception e) {
            logger.error("Error occurred, registering SensIDL todo tag failed.",e);            
        }
        
        addSensIDLTodoTagPriority(jdt);
	}
	
	private static def addSensIDLTodoTagPriority(ScopedPreferenceStore jdt) {
		try {
			var taskPriorities = jdt.getString(TODO_TASK_PRIORITY_PROPERTY_QUALIFIER);			
		
        	taskPriorities = taskPriorities + "," + SENSIDL_TODO_TAG_PRIORITY;
        	jdt.putValue(TODO_TASK_PRIORITY_PROPERTY_QUALIFIER, taskPriorities);
        	
       	} catch (Exception e) {
       		logger.error("Error occurred, SensIDL todo tag priority couldn't be set.");
       	}
	}
	
	private static def isEclipseWorkspace() {
		try {
    		Class.forName("org.eclipse.ui.preferences.ScopedPreferenceStore");
    		return true;
		} catch(Exception e) {
    		return false;
		}
	} 
}
