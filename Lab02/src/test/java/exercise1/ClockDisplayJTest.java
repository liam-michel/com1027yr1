/**
 * ClockDisplayTest.java
 */
package exercise1;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A simple JUnit class used to test the "ClockDisplay" class.
 * 
 * @author Stella Kazamia
 */

public class ClockDisplayJTest {
	ClockDisplay clock12 = new ClockDisplay(true);
	ClockDisplay clock24 = new ClockDisplay(false);

	@Test
	public void testAM() {
		// Advance the clocks to go past 12:00 noon.
		for (int i = 0; i < 200; i++) {
			clock12.timeTick();
		}

		assertEquals("3:20am", clock12.toString());
	}

	@Test
	public void testPM() {
		// Advance the clocks to go past 12:00 noon.
		for (int i = 0; i < 821; i++) {
			clock12.timeTick();
		}

		assertEquals("1:41pm", clock12.toString());
	}

	@Test
	public void testMorning() {
		for (int i = 0; i < 540; i++) {
			clock24.timeTick();
		}

		assertEquals("09:00", clock24.toString());
	}

	@Test
	public void testAfternoon() {
		// Advance the clocks to go past 12:00 noon.
		for (int i = 0; i < 1080; i++) {
			clock24.timeTick();
		}

		assertEquals("18:00", clock24.toString());
	}

	
	@Test
	public void testNoon() {
		for (int i = 0; i < 720; i++) {
			clock24.timeTick();
		}

		assertEquals("12:00", clock24.toString());
	}
	
	
	@Test
	public void testNoonPM() {
		for (int i = 0; i < 720; i++) {
			clock12.timeTick();
		}

		assertEquals("12:00pm", clock12.toString());
	}

	@Test
	public void testMidnight() {
		for (int i = 0; i < 1440; i++) {
			clock24.timeTick();
		}

		assertEquals("00:00", clock24.toString());
	}

	@Test
	public void testMidnightAM() {
		for (int i = 0; i < 1440; i++) {
			clock12.timeTick();
		}

		assertEquals("0:00am", clock12.toString());
	}
	
}
