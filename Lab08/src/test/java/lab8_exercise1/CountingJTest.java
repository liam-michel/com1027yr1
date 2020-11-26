package lab8_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountingJTest {

	Counting c = null;

	@Test
	public void lab8_testCountConstruction() {
		c = new Counting();
		assertEquals(
				"the cat sat on the mat : 1\n" + "the sat mat on the cat : 2\n" + "the mat cat on the sat : 3\n" + "",
				c.readTextFile());

	}

}
