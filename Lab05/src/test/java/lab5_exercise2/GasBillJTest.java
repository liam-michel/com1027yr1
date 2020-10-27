package lab5_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GasBillJTest {

	Customer customer = new Customer("Alice", "Wonderland");
	GasBill bill = new GasBill("1234-5678-1234", 100, customer);

	@Test
	public void lab5_testGasBillConstruction() {
		assertEquals("1234-5678-1234", bill.getAccountNumber());
		assertEquals("A. Wonderland", bill.getCustomer());
	}

	@Test
	public void lab5_testAccountDetails() {
		assertEquals(
				"Gas Bill\n" + " Account Number:1234-5678-1234\n" + " Customer:A. Wonderland\n" + " Amount due:100.00",
				bill.displayAccountDetails());
		assertEquals(true, bill.checkAccountAccuracy());
	}

	@Test
	public void lab5_testInvalidAccount() {
		bill = new GasBill("123456781234", 200, customer);
		assertEquals(
				"Gas Bill\n" + " Account Number:Invalid Account\n" + " Customer:A. Wonderland\n" + " Amount due:200.00",
				bill.displayAccountDetails());
		assertEquals(false, bill.checkAccountAccuracy());
	}

}
