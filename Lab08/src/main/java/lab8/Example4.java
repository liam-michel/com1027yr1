package lab8;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A simple class to test out IOExceptions.
 * 
 * @author Stella Kazamia
 */
public class Example4 {

  /**
   * Calculates the number of lines in a file.
   * 
   * @param filename
   *          The name of the file to count the lines in.
   * 
   * @return the number of lines.
   */
  public static int calculateNumberOfLinesCatch(String filename) {
    int count = 0;
    BufferedReader reader = null;

    try {
      // Attempt to open the file.
      reader = new BufferedReader(new FileReader(filename));

      while ((reader.readLine()) != null) {
        count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      // Always close the reader, if it has been opened.
      try {
        if (reader != null) {
          reader.close();
        }
      }
      catch (IOException e) {
        e.printStackTrace();
      }
    }

    return count;
  }

  /**
   * Calculates the number of lines in a file.
   * 
   * @param filename
   *          The name of the file to count the lines in.
   * 
   * @return the number of lines.
   * 
   * @throws IOException
   */
  public static int calculateNumberOfLinesThrow(String filename) throws IOException {
    int count = 0;
    BufferedReader reader = null;

    // Attempt to open the file.
    reader = new BufferedReader(new FileReader(filename));

    while ((reader.readLine()) != null) {
      count++;
    }

    reader.close();

    return count;
  }

  /**
   * Main entry point: this is the first method that is run.
   * 
   * @param args
   *          The command line arguments.
   */
  public static void main(String[] args) {
    int count = calculateNumberOfLinesCatch("test1.txt");
    System.out.println("Number of lines = " + count);
    try {
		count = calculateNumberOfLinesThrow("test1.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Number of Lines = "+ count);
  
  }
}
