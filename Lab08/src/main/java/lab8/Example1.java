package lab8;

/**
 * A simple class used to test out ArithmeticExceptions.
 * 
 * @author Stella Kazamia
 */
public class Example1 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Note: this code will compile without a try/catch block, but it is still
		// wrong. This is the type of problem that should be
		// fixed by the developer before the software is released.

		int dontDivideMeByZero = 5;
		int x = 0;
			if (x!=0) {
				int result = dontDivideMeByZero / x;
				System.out.println("Result = " + result);
			}
		

		
	}
}
