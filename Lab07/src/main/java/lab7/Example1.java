package lab7;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A simple class used to demonstrate how ArrayLists are dynamic.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example1 {
	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Create an arraylist of strings. Arraylists do not have a fixed size at
		// declaration.
		List<String> names = new ArrayList<String>();

		// Now read in names from the command line to put into the arraylist.
		boolean finished = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter names to add to the arraylist, one per line");

		// Continue reading until "exit" is entered.
		while (!finished) {
			String line = scanner.nextLine();

			// Check for exit.
			if (line.startsWith("exit")) {
				finished = true;
			} else {
				// Not exit, so add the name to the arraylist
				names.add(line);
				finished = !scanner.hasNextLine();
			}
		}

		scanner.close();
		Collections.sort(names);

		// Loop through the array and print out all of its values.
		for (String name : names) {
			if (name != null) {
				System.out.println("Name is: " + name);
			}
		}
	}

}
