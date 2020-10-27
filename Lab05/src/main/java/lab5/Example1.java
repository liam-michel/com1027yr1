package lab5;
/**
 * Example1.java
 */

/**
 * A simple class used to explore arrays and loops.
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
		// declaration of new array with 3 elements of type String
		String[] names = new String[3];
		names[0] = "Stella";
		names[1] = "Junaid";
		names[2] = "Mariyah";

		// declaration of new array with 3 elements of type double
		double[] grades = new double[3];
		grades[0] = 50;
		grades[1] = 60;
		grades[2] = 75;

		// print all elements within the names array
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		// Start a new line for the next set of elements
		System.out.println();

		// print all elements within the grades array
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);

		// empty line
		System.out.println();

		// print combination of two arrays
		System.out.println(names[0] + " achieved " + grades[0] + "%");
		System.out.println(names[1] + " achieved " + grades[1] + "%");
		System.out.println(names[2] + " achieved " + grades[2] + "%");

	}
}