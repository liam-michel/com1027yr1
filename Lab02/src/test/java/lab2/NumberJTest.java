/**
 * NumberTest.java
 */

package lab2;

/**
 * A simple class used to test the "Number" class.
 * 
 * @author Stella Kazamia
 */
public class NumberJTest {

	/**
	 * Main entry point for the "Number" example. This is the first method that is
	 * run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {

		NumberInfo number = new NumberInfo(3);
		// ** Remove the setter definition **
		// number.setValue(4);

		// number.increment();
		// System.out.println(number.getValue());

		// ** Examples using % operator **
		// System.out.println("25 % 4 is " +(25%4));
		// System.out.println("25 divide by 4 is " +(25/4));
		// System.out.println("17 % 3 is " +(17%3));
		// System.out.println("16+1 % 3 is " +((16+1)%3));
		// System.out.println("17 divide by 3 is " +(17/3));
		// System.out.println("16+1 divide by 3 is " +((16+1)/3));

		number.increment();
		System.out.println(number.getValue());

		number.increment();
		System.out.println(number.getValue());

		number.increment();
		System.out.println(number.getValue());
	}
}
