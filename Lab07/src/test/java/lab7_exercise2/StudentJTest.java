package lab7_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentJTest {

	Student student = null;

	@Test
	public void lab7_testStudentConstruction() {
		student = new Student("Stella Kazamia", 12345);
		assertEquals("Stella Kazamia", student.getName());
		assertEquals(12345, student.getUrn());
	}

	@Test
	public void lab7_testStudentConstruction2() {
		student = new Student("Joe Bloggs", 34567);
		assertEquals("Joe Bloggs", student.getName());
		assertEquals(34567, student.getUrn());
	}

	@Test
	public void lab7_testInvalidStudentConstruction() {
		student = new Student("Stella Kazamia", 12345);
		assertEquals("Stella Kazamia", student.getName());
		assertEquals(12345, student.getUrn());
	}

	@Test
	public void lab7_testInvalidStudentConstruction2() {
		student = new Student("Joe Bloggs", 34567);
		assertEquals("Joe Bloggs", student.getName());
		assertEquals(34567, student.getUrn());
	}
	@Test
	public void lab7_testAddModuleList() {
		student = new Student("Alice Wonderland", 23456);

		Module module = new Module("COM1027");
		student.addModuleList(module);

	}

	@Test
	public void lab7_testPrintModules() {
		student = new Student("Alice Wonderland", 23456);

		Module module = new Module("COM1027");
		student.addModuleList(module);
		
		assertEquals("COM1027 ",student.printModules());
	}
	
	@Test
	public void lab7_testPrintMultipleModules() {
		student = new Student("Joe Bloggs", 34567);

		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		student.addModuleList(module1);
		student.addModuleList(module2);
		student.addModuleList(module3);

		
		assertEquals("COM1027, COM1025, COM1026 ",student.printModules());
	}

}
