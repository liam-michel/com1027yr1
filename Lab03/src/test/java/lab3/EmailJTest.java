package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Stella Kazamia
 */

public class EmailJTest {
	Email email = new Email("email@surrey.ac.uk");

	@Test
	public void lab3_testGetEmailAddress() {
		assertEquals("email@surrey.ac.uk", email.getEmailAddress());
	}

	@Test
	public void testSetEmailAddress() {
		email.setEmailAddress("test@surrey.ac.uk");
		assertEquals("test@surrey.ac.uk", email.getEmailAddress());
	}

}
