package lab5;

/**
 * A simple class used to explore nested loops for example 2 of lab 6.
 * 
 * @author Stella Kazamia
 */
public class NestedLoop {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args
	 *            The command line arguments.
	 */
	public static void main(String[] args) {
		// Loop through the first 5 times tables.
		for (int i = 1; i <= 5; i++) {
			// Keep a running total of the values in the times table. Make sure this is
			// initially zero.
			int total = 0;

			// Print the ith times table for multipliers 1 to 12.
			for (int j = 1; j <= 12; j++) {
				// We can make use of both index i and j inside this code block.
				System.out.println(i + " * " + j + " = " + (i * j));

				// Add the value to the running total.
				total = total + (i * j);
			}

			// Print out the total value of the multiples of this table.
			System.out.println("Total of table is " + total);
		}
	}
}
