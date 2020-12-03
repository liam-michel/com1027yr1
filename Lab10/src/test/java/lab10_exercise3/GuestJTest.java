package lab10_exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuestJTest {

	/**
	 * Creating a Guest object with a valid forename, surname, address and telephone
	 * number. Add three charges to the guest and testing that they have been added
	 * to the list.
	 */
	@Test
	public void testCharges() {
		Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

		Service service1 = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);
		guest.addCharge(service1, 200);

		Service service2 = new Service("DRIN1234", "Drink", VATRate.LOW, 5);
		guest.addCharge(service2, 10);

		Service service3 = new Service("NEWS1234", "Newspaper", VATRate.ZERO, 1);
		guest.addCharge(service3, 1);

		assertEquals(3, guest.getCharges().size());
	}

	/**
	 * Creating a Guest object with a valid forename, surname, address and telephone
	 * number. Testing that the forename, surname, address and telephone number can
	 * be retrieved correctly and that the toString method returns the correct
	 * string representation of the Guest.
	 */
	@Test
	public void testGuest() {
		Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

		assertEquals("Sid", guest.getForename());
		assertEquals("James", guest.getSurname());
		assertEquals("12 North Lane, Guildford, Surrey", guest.getAddress());
		assertEquals("01483 654321", guest.getTelephone());

		System.out.println(guest);
	}

	/**
	 * Creating a Guest object with a valid forename, surname, address and telephone
	 * number. Add two charges to the guest at the "LOW" VAT rate, with the first
	 * charge at £60, and the second charge £90. Test that the calculateTotalCharge-
	 * WithoutVAT method returns £150, and that the calculateVATChargeAtRate method
	 * returns £7.50 for the "LOW" VAT rate.
	 */
	@Test
	public void testLow() {
		Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

		Service service1 = new Service("ROOM1234", "Room", VATRate.LOW, 100);
		guest.addCharge(service1, 60);

		Service service2 = new Service("ROOM1234", "Room", VATRate.LOW, 100);
		guest.addCharge(service2, 90);

		assertEquals(150, guest.calculateTotalChargeWithoutVAT(), 0);
		assertEquals(7.50, guest.calculateVATChargeAtRate(VATRate.LOW), 0);
	}

	/**
	 * Creating a Guest object with a valid forename, surname, address and telephone
	 * number. Add two charges to the guest at the "STANDARD" VAT rate, with the
	 * first charge at £60, and the second charge £90. Test that the calculateTo-
	 * talChargeWithoutVAT method returns £150, and that the
	 * calculateVATChargeAtRate method returns £26.25 for the "STANDARD" VAT rate.
	 */
	@Test
	public void testStandard() {
		Guest guest = new Guest("Bob", "Ross", "10 Guildford Park Road, Guildford, Surrey", "01483 123456");

		Service service1 = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);
		guest.addCharge(service1, 60);

		Service service2 = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);
		guest.addCharge(service2, 80);

		assertEquals(140, guest.calculateTotalChargeWithoutVAT(), 0);
		assertEquals(24.5, guest.calculateVATChargeAtRate(VATRate.STANDARD), 0);
	}
	
	@Test
	public void testToStringOutput() {
		Guest guest = new Guest("Bob", "Ross", "10 Guildford Park Road, Guildford, Surrey", "01483 123456");

		Service service1 = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);
		guest.addCharge(service1, 60);

		Service service2 = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);
		guest.addCharge(service2, 80);

		assertEquals("Bob Ross, 10 Guildford Park Road, Guildford, Surrey, 01483 123456", guest.toString());
	}
	
}