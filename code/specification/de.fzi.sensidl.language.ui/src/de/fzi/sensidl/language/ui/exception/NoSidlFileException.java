package de.fzi.sensidl.language.ui.exception;

/**
 * Exception class for the case that the given file is not a sidl file
 * 
 * @author Sven Eckhardt
 *
 */
public class NoSidlFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor
	 */
	public NoSidlFileException() {
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            the error message
	 */
	public NoSidlFileException(String message) {
		super(message);
	}

}
