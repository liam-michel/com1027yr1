package lab7_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModuleJTest {

	Module module = null;

	@Test
	public void lab7_testModuleConstruction() {
		this.module = new Module("COM1027");
		assertEquals("COM1027", this.module.getName());
	}

	@Test
	public void lab7_testInvalidName() {
		this.module = new Module("co1027");
		assertEquals("Error", this.module.getName());
	}

	@Test
	public void lab7_testModuleConstruction2() {
		this.module = new Module("COM1025");
		assertEquals("COM1025", this.module.getName());
	}

	@Test
	public void lab7_testInvalidName2() {
		this.module = new Module("test");
		assertEquals("Error", this.module.getName());
	}

}
