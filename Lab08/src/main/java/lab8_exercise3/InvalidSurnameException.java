package lab8_exercise3;

public class InvalidSurnameException extends Exception {
	
	public InvalidSurnameException() {
		super("Invalid surname");
	}
	
	public InvalidSurnameException(String message) {
		super(message);
	}

}
