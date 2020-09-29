package exercise1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void helloWorldNormal() {
		String result = HelloWorld.helloWorld();
		assertEquals("Hello World!", result);
	}

}