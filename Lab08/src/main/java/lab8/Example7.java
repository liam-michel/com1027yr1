package lab8;

import java.util.StringTokenizer;

/**
 * A simple class used to explore splitting Strings.
 * 
 * @author Stella Kazamia
 */
public class Example7 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Define a line of text to work with.
		String line = "What on earth is going on here?";

		// Use a Java library routine to split the line up into words. This class
		// automatically splits the line up using white space to
		// delimit between chunks.
		StringTokenizer tokens = new StringTokenizer(line);
		System.out.println("Extracted " + tokens.countTokens() + " tokens from the line");

		// Now display each token using a while loop.
		while (tokens.hasMoreTokens()) {
			String word = tokens.nextToken();
			System.out.println(word);
		}
	}
}
