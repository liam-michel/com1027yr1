package lab8_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonJTest {

	Person person = null;

	@Test
	public void lab8_testPerson() {
		person = new Person("Adam", "Hills", 16);
	}

	@Test
	public void lab8_testGetAge() {
		person = new Person("Adam", "House", 20);
		assertEquals(20, person.getAge());
	}

	@Test
	public void lab8_testGetForename() {
		person = new Person("Alice", "Wonderland", 41);
		assertEquals("Alice", person.getForename());
	}

	@Test
	public void lab8_testGetSurname() {
		person = new Person("Bart", "Simpson", 25);
		assertEquals("Simpson", person.getSurname());
	}

	@Test
	public void lab8_testToString() {
		person = new Person("Hassan", "Khan", 20);
		assertEquals("Hassan Khan (20)", person.toString());
	}

}
