package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Stella Kazamia
 */
public class UserJTest {

	Email email = new Email("email@surrey.ac.uk");
	User user = new User("Bugs Bunny", email);

	@Test
	public void lab3_testUser() {
		email.setEmailAddress("bugs.bunny@surrey.ac.uk");
		assertEquals("Bugs Bunny <bugs.bunny@surrey.ac.uk>", user.toString());

	}

	@Test
	public void testToString() {
		assertEquals("Bugs Bunny <email@surrey.ac.uk>", user.toString());
	}

}
