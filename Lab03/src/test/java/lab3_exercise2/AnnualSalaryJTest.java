package lab3_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the Annual Salary
 * 
 * @author Stella Kazamia
 *
 */
public class AnnualSalaryJTest {

	/**
	 * Test accessors and mutators for a salary.
	 */
	@Test
	public void lab3_testAccessorsMutators() {
		// Create a salary object.
		AnnualSalary salary = new AnnualSalary();

		// Test setting and getting the salary.
		assertEquals(0, salary.getSalary(), 0);
		salary.setSalary(10000);
		assertEquals(10000, salary.getSalary(), 0);
	}

	/**
	 * Test that the basic rate of tax is applied when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxBasic() {
		// Create a salary object which should be above the personal allowance, but
		// below the higher threshold.
		AnnualSalary salary = new AnnualSalary();

		// Tax should be paid at 20% on taxable salary
		salary.setSalary(16475);
		assertEquals(793.2, salary.calculateTax(), 0);

	}

	/**
	 * Test that the higher rate of tax is applied when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxHigher() {
		// Create a salary object which should be above the higher threshold.
		AnnualSalary salary = new AnnualSalary();

		salary.setSalary(53875);
		assertEquals(9046.4, salary.calculateTax(), 0);
	}

	/**
	 * Test that the basic allowance is taken into account when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxNone() {
		// Create a salary object which should be below the personal allowance.
		AnnualSalary salary = new AnnualSalary();

		// No tax should be paid.
		salary.setSalary(1000);
		assertEquals(0, salary.calculateTax(), 0);
	}

	/**
	 * Test that the basic rate of tax is applied when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxBasicNew() {
		// Create a salary object which should be above the personal allowance, but
		// below the higher threshold.
		AnnualSalary salary = new AnnualSalary();

		// Tax should be paid at 20% on £7035.
		salary.setSalary(10000);
		assertEquals(0, salary.calculateTax(), 0);

	}

	/**
	 * Test that the higher rate of tax is applied when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxHigherNew() {
		// Create a salary object which should be above the higher threshold.
		AnnualSalary salary = new AnnualSalary();

		// Tax should be paid at 20%, plus 40% on the taxable salary.
		salary.setSalary(100000);
		assertEquals(27496.4, salary.calculateTax(), 0);
	}

	/**
	 * Test that the basic allowance is taken into account when calculating tax.
	 */
	@Test
	public void lab3_testCalculateTaxNoneNew() {
		// Create a salary object which should be below the personal allowance.
		AnnualSalary salary = new AnnualSalary();

		// No tax should be paid.
		salary.setSalary(0);
		assertEquals(0, salary.calculateTax(), 0);
	}
}
