package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A simple class that uses String literals and their built-in methods
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {
	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		String s1 = "good";
		System.out.println(s1);

		String s2 = "morning";
		String s3 = s1 + " " + s2;
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s2.length() + s3.length());

		// Get the character at a particular position
		// Add your code here
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		

		boolean start = false;
		// Creating a string literal
		String exercise = "COM1027";

		// Creating a string using parameterised String constructor.
		String exercise2 = new String("COM1027");

		// Add your code here
		System.out.println(exercise.substring(0,3));
		System.out.println(exercise2.substring(0,3));
		
		// Does exercise equal exercise2? (.equals)
		System.out.println(exercise.equals(exercise2)); //checks content of object, will return true


		// Does exercise equal exercise2? (==)
		// Add your code here
		System.out.println((exercise==exercise2) ? true :false);  //checks object reference (address in memory), which they are not as they are unique objects. Returns False.

		String exercise3="COM1027";
		System.out.println((exercise==exercise3) ? true:false);
		//here we are comparing two string literals, by comparing their object references.
		//They are indeed the same immutable object.
		//Java figures out that it only needs to store one copy of the string literal "COM1027" as it is defined at compile time.
		//there is only one copy of this string literal in memory, exercise and exercise3 point at the same location in memory, so it returns true.
		
	}
}