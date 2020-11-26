package lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Example6.java
 */

/**
 * A simple class used to explore reading a text file
 * 
 * @author Stella Kazamia
 */
public class Example6 {

  /**
   * Main entry point: this is the first method that is run.
   * 
   * @param args
   *          The command line arguments.
   */
  public static void main(String[] args) {
    // Declare a variable to hold a reference to the text file. This needs to be done here so that we can use the variable in the
    // 'try' and 'finally' blocks of code below. Note that we only need to keep track of the BufferedReader read as we can close the
    // file using this instead of the FileReader.
    BufferedReader buffer = null;

    // In Java, when something can go wrong (an exception) that we need to recover from we place the code in a "try/catch" block.
    try {
      // Open the text file for reading.
      FileReader in = new FileReader("words.txt");

      // Wrap the FileReader inside a BufferedReader so that we can read lines from the file instead of characters.
      buffer = new BufferedReader(in);

      // Read a line from the file. Note that we are now dealing with a String. This method will return null if there are no more
      // lines to read.
      String line = buffer.readLine();

      // While we have not reached the end of the file (null signifies the end of the file).
      while (line != null) {
        // Do something with data...
        System.out.println(line);

        // Read in the next line.
        line = buffer.readLine();
      }

      // We still need to close the file - this will be done in the finally block below.
    }
    catch (FileNotFoundException e) {
      // This 'catch' code block will be executed if the words.txt file does not exist.
      System.out.println("Cannot find the file");
      e.printStackTrace(); // Shows the call stack so we can trace the problem.
    }
    catch (IOException e) {
      // This 'catch' code block will be executed if something goes wrong while reading the file.
      System.out.println("Cannot read the file");
      e.printStackTrace(); // Shows the call stack so we can trace the problem.
    }
    finally {
      // We have finished reading the file either without problem (exception) or because a problem (exception) occurred.
      // If the variable 'buffer' is null, this means we never managed to open the file or the buffer.
      if (buffer != null) {  // if the buffer is not null, then we managed to open the file, and now need to close it
        // The file was opened, so close it. The close may also cause an exception, so it needs to be place in a 'try' block.
        try {
          buffer.close();
        }
        catch (IOException e) {
          System.out.println("Could not close the file");
          e.printStackTrace(); // Shows the call stack so we can trace the problem.
        }
      }
    }
  }

}
