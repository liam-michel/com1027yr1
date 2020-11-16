package lab7_exercise3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StudentTrackerJTest {
	StudentTracker st = new StudentTracker();

	@Test
	public void lab7_testStudentTrackerConstruction() {
		st = new StudentTracker();
	}

	@Test
	public void lab7_testAddStudent() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", 12345);
		
		st.addStudent(student1, moduleList);
	}
	
	@Test
	public void lab7_testPrintStudent() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", 12345);

		st.addStudent(student1, moduleList);
		
		assertEquals("Stella Kazamia(12345)\n" + 
				"", st.printStudents());
	}
	@Test
	public void lab7_testPrintManyStudents() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", 12345);
		Student student2 = new Student("Alice Wonderland", 23456);
		Student student3 = new Student("Joe Bloggs", 34567);

		st.addStudent(student1, moduleList);
		st.addStudent(student2, moduleList);
		st.addStudent(student3, moduleList);

		assertEquals("Stella Kazamia(12345)\n" + 
				"Alice Wonderland(23456)\n" + 
				"Joe Bloggs(34567)\n", st.printStudents());
	}

	@Test
	public void lab7_testPrintModules() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", 12345);
		Student student2 = new Student("Alice Wonderland", 23456);
		Student student3 = new Student("Joe Bloggs", 34567);

		st.addStudent(student1, moduleList);
		
		moduleList.remove(1);
		st.addStudent(student2, moduleList);	
		st.addStudent(student3, moduleList);
		
		assertEquals("URN 23456 is enrolled in:\n" + 
				"COM1027, COM1026", st.printModules(23456));
	}

}
