package lab4;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example3 {

	public static void main(String[] args) {

		// Create an array of strings. Arrays always have a fixed size.
		String[] names = new String[20];

		// Assign values to the first two elements of the array.
		names[0] = "Helen";
		names[1] = "Stella"; // Toggle breakpoint here.
		

		// Loop through the array and print out all of its values.
		for (String name : names) {
			if (name != null) {
				System.out.println("Name is: " + name);
			}
		}

	}
}
