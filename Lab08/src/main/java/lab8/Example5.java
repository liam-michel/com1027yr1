package lab8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A simple class used to explore reading a text file 
 * 
 * @author Stella Kazamia
 */
public class Example5 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Declare a variable to hold a reference to the text file. This needs to be
		// done here so that we can use the variable in the
		// 'try' and 'finally' blocks of code below.
		FileReader in = null;

		// In Java, when something can go wrong (an exception) that we need to recover
		// from we place the code in a "try/catch" block.
		try {
			// Open the text file for reading.
			in = new FileReader("words.txt");

			// Read a single character from the file.
			// Why is the type 'int'? Look up the 'read()' method in the FileReader. The
			// 'read()' method returns an 'int' which contains
			// the 'char' value of the character read or -1 if the end of file is reached.
			// (ASCII character values can be translated here
			// http://www.asciitable.com/)
			int data = in.read();

			// While we have not reached the end of the file (-1 signifies the end of the
			// file).
			while (data != -1) {
				// Do something with data...
				System.out.println((char)data);

				// Read in the next character.
				data = in.read();
			}

			// We still need to close the file - this will be done in the finally block
			// below.
		} catch (FileNotFoundException e) {
			// This 'catch' code block will be executed if the words.txt file does not
			// exist.
			System.out.println("Cannot find the file");
			e.printStackTrace(); // Shows the call stack so we can trace the problem.
		} catch (IOException e) {
			// This 'catch' code block will be executed if something goes wrong while
			// reading the file.
			System.out.println("Cannot read the file");
			e.printStackTrace(); // Shows the call stack so we can trace the problem.
		} finally {
			// We have finished reading the file either without problem (exception) or
			// because a problem (exception) occurred.
			// If the variable 'in' is null, this means we never managed to open the file.
			if (in != null) {
				// The file was opened, so close it. The close may also cause an exception, so
				// it needs to be place in a 'try' block.
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Could not close the file");
					e.printStackTrace(); // Shows the call stack so we can trace the problem.
				}
			}
		}
	}

}
