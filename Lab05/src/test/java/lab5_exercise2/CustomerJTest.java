package lab5_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerJTest {

	Customer customer = new Customer("Bob", "Ross");
	@Test
	public void lab5_testCustomerConstruction() {
		assertEquals('B', customer.getName());
		assertEquals("Ross", customer.getSurname());
	}
	@Test
	public void lab5_testCustomer2Construction() {
		customer = new Customer("Stella", "Kazamia");
		assertEquals('S', customer.getName());
		assertEquals("Kazamia", customer.getSurname());
	}
	
}
