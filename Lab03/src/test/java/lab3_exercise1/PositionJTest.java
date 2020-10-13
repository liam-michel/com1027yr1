package lab3_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The test class CompanyPositionTest.
 * 
 * @author Stella Kazamia
 * 
 */

public class PositionJTest {

	/**
	 * Test accessors and mutators for a job role.
	 */
	@Test
	public void lab3_testAccessorsMutators() {
		// Create a job companyPosition object.
		Position companyPosition = new Position();

		// Test setting and getting the company position.
		companyPosition.setRoleName("Senior Lecturer");
		assertEquals("Senior Lecturer", companyPosition.getRoleName());

	}

	@Test
	public void lab3_testAccessorsMutatorsNew() {
		// Create a job companyPosition object.
		Position companyPosition = new Position();

		// Test setting and getting the company position.
		companyPosition.setRoleName("Teaching Fellow");
		assertEquals("Teaching Fellow", companyPosition.getRoleName());

	}

}
