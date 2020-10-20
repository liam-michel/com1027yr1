package lab4;
/**
 * @author Stella Kazamia
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Example4JTest {

	@Test
	public void lab4_testConstruction() {

		Example4 object = new Example4();
		object.addNames();
		assertEquals("HelenStella", object.displayNames());
	}
}
