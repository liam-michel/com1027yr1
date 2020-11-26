package lab8_exercise2;


/**
 * An exception class used to indicate an invalid age.
 * 
 * @author Stella Kazamia
 */
public class InvalidAgeException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = -5126816848483176702L;

	/**
	 * Default constructor: fill in the message automatically.
	 */
	public InvalidAgeException() {
		super("Invalid age");
	}

	/**
	 * Allow a specific message to be included.
	 * 
	 * @param message The specific message.
	 */
	public InvalidAgeException(String message) {
		super(message);
	}
}
