package de.fzi.sensidl.language.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Handles Error Dialogs to show stacktrace
 * 
 * @author Sven Eckhardt
 *
 */
public class ErrorDialogHandler {
	/**
	 * emty Constructor
	 */
	public ErrorDialogHandler() {

	}

	/**
	 * create the stacktrace and open up the dialog
	 * 
	 * @param shell
	 *            the shell to use
	 * @param ex
	 *            the exception which was thrown
	 */
	public void execute(Shell shell, Exception ex) {
		MultiStatus status = createMutliStatus(ex.getLocalizedMessage(), ex);
		ErrorDialog.openError(shell, "Error", "An error occured during the generation process.", status);
	}

	/*
	 * create stacktrace as list of multiple statuses
	 */
	private MultiStatus createMutliStatus(String localizedMessage, Throwable ex) {

		List<Status> childStatuses = new ArrayList<>();

		StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();

		for (StackTraceElement stackTrace : stackTraces) {
			Status status = new Status(IStatus.ERROR, "de.fzi.sensidl.language.ui", stackTrace.toString());
			childStatuses.add(status);
		}

		MultiStatus ms = new MultiStatus("de.fzi.sensidl.language.ui", IStatus.ERROR,
				childStatuses.toArray(new Status[] {}), ex.toString(), ex);
		return ms;

	}
}
