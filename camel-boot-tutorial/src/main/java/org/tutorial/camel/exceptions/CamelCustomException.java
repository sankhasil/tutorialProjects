/**
 * 
 */
package org.tutorial.camel.exceptions;

/**
 * @author ILS5KOR
 *
 */
public class CamelCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6439656244169099999L;

	/**
	 * 
	 */
	public CamelCustomException() {
	}

	/**
	 * @param message
	 */
	public CamelCustomException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public CamelCustomException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CamelCustomException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public CamelCustomException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
