package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A simple class that uses ArrayLists and Loops
 * 
 * @author Stella Kazamia
 * 
 */

public class Example3 {
	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Create a List of names. The object is an ArrayList which can only contain "<"
		// String ">" objects. Note that we have not said
		// how many names we want to store.
		List<String> names = new ArrayList<String>(20);

		// Now read in names from the command line to put into the array list.
		boolean finished = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter names to add to the array list, one per line");

		// Continue reading until "exit" is entered.
		while (!finished) {
			String line = scanner.nextLine();

			// Check for exit.
			if (line.startsWith("exit")) {
				finished = true;
			} else {
				// Not exit, so add the name to the array list. Note that no index is needed, we
				// simply "add" a String to the list.
				names.add(line); // Toggle breakpoint here.
				finished = !scanner.hasNextLine();
			}
		}

		scanner.close();

		// Loop through the array and print out all of its values.
		// Add code here
		for (int i=0; i<names.size();i++) {
			System.out.println("Name is "+names.get(i));
		}
	}

}
