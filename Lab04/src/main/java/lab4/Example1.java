package lab4;

/**
 * Example1.java
 */

/**
 * A simple class used to test the "House" class for example 1 of lab 4.
 * 
 * @author Stella Kazamia
 */
public class Example1 {

	/**
	 * Main entry point for the "House" example 1. This is the first method that is
	 * run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// The following lines of code are defined so that we can see the value of the
		// variables in the debugger.
		int testValue = 10;
		System.out.println("my value is " + testValue);

		// Write a line of code that increments the testValue.
		testValue++;
		

		// Define a house object and inspect its values.
		House myHouse = new House(4, 1);
		System.out.println("my house is " + myHouse.getNumberOfHouse());

		// Write a line of code that assigns the number of milk bottles to the testValue
		// using the setter instance method.
		myHouse.setNumberBottles(testValue);
		
		

	}
}
