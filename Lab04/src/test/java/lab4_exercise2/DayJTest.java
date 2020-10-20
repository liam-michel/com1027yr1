package lab4_exercise2;
/**
 * @author Stella Kazamia
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayJTest {

	@Test
	public void lab4_testObjectExample() {
		Day d = new Day("Monday");
		assertEquals("Monday", d.getName());
	}

	@Test
	public void lab4_testObject() {
		Day d2 = new Day("Tuesday");
		assertEquals("Tuesday", d2.getName());

	}

	@Test
	public void lab4_testSetSessionExample() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);

		assertEquals("COM1027: 9 - 10\n", d.toString());

	}

	@Test
	public void lab4_testSetSessionPicture() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);
		d.setSession(1, "COM1025", 15, 17);

		assertEquals("COM1027: 9 - 10\n" + "COM1025: 15 - 17\n", d.toString());

		Day d2 = new Day("Tuesday");
		d2.setSession(0, "COM1026", 13, 15);

		assertEquals("COM1026: 13 - 15\n", d2.toString());

	}

}
