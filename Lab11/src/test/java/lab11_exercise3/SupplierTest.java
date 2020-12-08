package lab11_exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SupplierTest {

	@Test(expected = IllegalArgumentException.class)
	public void testSupplierInvalid() {
		new Supplier("Bloggs", "1483681234");
	}

	@Test
	public void testSupplierValid() {
		Supplier supplier = new Supplier("Bloggs", "01483681234");

		assertEquals("Bloggs", supplier.getName());
		assertEquals("01483681234", supplier.getPhone());
	}
}
