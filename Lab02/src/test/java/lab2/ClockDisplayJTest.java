/**
 * ClockDisplayTest.java
 */

package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.ClockDisplay;

/**
 * A simple class used to test the "ClockDisplay" class.
 * 
 * @author Stella Kazamia
 */
public class ClockDisplayJTest {

	/**
	 * Main entry point for the "ClockDisplay" example. This is the first method
	 * that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		ClockDisplay clock = new ClockDisplay();

		for (int i = 0; i < 100; i++) {
			// The next two lines of code will be executed 100 times.
			clock.timeTick();
			System.out.println(clock.toString());
		}
	}

	@Test
	public void testClockDisplay() {
		ClockDisplay clock = new ClockDisplay();
		String testOutput = "";

		for (int i = 0; i < 100; i++) {
			// The next two lines of code will be executed 100 times.
			clock.timeTick();
			testOutput += clock.toString();
			testOutput += "\n";
		}
		String output = "00:01\n" + "00:02\n" + "00:03\n" + "00:04\n" + "00:05\n" + "00:06\n" + "00:07\n" + "00:08\n"
				+ "00:09\n" + "00:10\n" + "00:11\n" + "00:12\n" + "00:13\n" + "00:14\n" + "00:15\n" + "00:16\n"
				+ "00:17\n" + "00:18\n" + "00:19\n" + "00:20\n" + "00:21\n" + "00:22\n" + "00:23\n" + "00:24\n"
				+ "00:25\n" + "00:26\n" + "00:27\n" + "00:28\n" + "00:29\n" + "00:30\n" + "00:31\n" + "00:32\n"
				+ "00:33\n" + "00:34\n" + "00:35\n" + "00:36\n" + "00:37\n" + "00:38\n" + "00:39\n" + "00:40\n"
				+ "00:41\n" + "00:42\n" + "00:43\n" + "00:44\n" + "00:45\n" + "00:46\n" + "00:47\n" + "00:48\n"
				+ "00:49\n" + "00:50\n" + "00:51\n" + "00:52\n" + "00:53\n" + "00:54\n" + "00:55\n" + "00:56\n"
				+ "00:57\n" + "00:58\n" + "00:59\n" + "01:00\n" + "01:01\n" + "01:02\n" + "01:03\n" + "01:04\n"
				+ "01:05\n" + "01:06\n" + "01:07\n" + "01:08\n" + "01:09\n" + "01:10\n" + "01:11\n" + "01:12\n"
				+ "01:13\n" + "01:14\n" + "01:15\n" + "01:16\n" + "01:17\n" + "01:18\n" + "01:19\n" + "01:20\n"
				+ "01:21\n" + "01:22\n" + "01:23\n" + "01:24\n" + "01:25\n" + "01:26\n" + "01:27\n" + "01:28\n"
				+ "01:29\n" + "01:30\n" + "01:31\n" + "01:32\n" + "01:33\n" + "01:34\n" + "01:35\n" + "01:36\n"
				+ "01:37\n" + "01:38\n" + "01:39\n" + "01:40\n" + "";

		assertEquals(output, testOutput);
	}

}
