/**
 * MealTest.java
 */

package exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A simple class used to test the "Meal" class.
 * 
 * @author Stella Kazamia
 */
public class ModuleJTest {

	/**
	 * Main entry point for the "Module" exercise.
	 * 
	 */
	@Test
	public void displayAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 80.0), new Assessment("Coursework", 65.5));
		assertEquals("COM1027 Average = 68.4% [Labs(20%) = 80.0% ,Coursework(80%) = 65.5% ]", COM1027.toString());
	}

	@Test
	public void displayLowAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 50.0), new Assessment("Coursework", 30.0));
		assertEquals("COM1027 Average = 34.0% [Labs(20%) = 50.0% ,Coursework(80%) = 30.0% ]", COM1027.toString());
	}

	@Test
	public void displayHighAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 90.0), new Assessment("Coursework", 72));
		assertEquals("COM1027 Average = 75.6% [Labs(20%) = 90.0% ,Coursework(80%) = 72.0% ]", COM1027.toString());
		System.out.println(COM1027.toString());
	}

	@Test
	public void testValues() {
		Assessment labs = new Assessment("Labs", 92.5);
		assertEquals(92.5, labs.getMark(), 0);
		assertEquals("Labs", labs.getName());
	}

	@Test
	public void testConstantValue() {
		Assessment labs = new Assessment("Coursework", 63.0);
		assertEquals(100, labs.getMaximum(), 0);

	}

	@Test
	public void testAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 80.0), new Assessment("Coursework", 65.5));
		assertEquals(68.4, COM1027.calculateAverage(), 0);
	}

	@Test
	public void testLowAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 50.0), new Assessment("Coursework", 30.0));
		assertEquals(34.0, COM1027.calculateAverage(), 0);
	}

	@Test
	public void testHighAverage() {
		Module COM1027 = new Module(new Assessment("Labs", 90.0), new Assessment("Coursework", 72));
		assertEquals(75.6, COM1027.calculateAverage(), 0);
	}

}
