package lab8_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonJTest {

	Person person = null;

	@Test
	public void lab8_testPerson() {
		try {
			person = new Person("Adam", "Hills", 16);
		} catch (InvalidAgeException | InvalidSurnameException e) {
			System.out.println("Invalid Parameters");
		}
	}

	@Test(expected = InvalidAgeException.class)
	public void lab8_testInvalidAge() throws InvalidAgeException, InvalidSurnameException {
		person = new Person("Adam", "House", -1);
	}

	@Test(expected = InvalidSurnameException.class)
	public void lab8_testInvalidSurname() throws InvalidAgeException, InvalidSurnameException {
		person = new Person("Adam", "house", 31);
	}

	@Test(expected = InvalidAgeException.class)
	public void lab8_testInvalidAge2() throws InvalidAgeException, InvalidSurnameException {
		person = new Person("Adam", "House", 0);
	}

	@Test(expected = InvalidSurnameException.class)
	public void lab8_testInvalidSurname2() throws InvalidAgeException, InvalidSurnameException {
		person = new Person("Adam", "1234", 31);
	}
	
	
	@Test
	public void lab8_testToString() {
		try {
			person = new Person("Hassan", "Khan", 20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		} catch (InvalidSurnameException e) {
			e.printStackTrace();
		}
		assertEquals("Hassan Khan (20)", person.toString());
	}

}
