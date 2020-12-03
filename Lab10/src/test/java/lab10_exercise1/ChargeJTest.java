package lab10_exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChargeJTest{
	  /**
	   * Creating a Charge object with a valid service and charge. Testing that the service and charge can be retrieved correctly and
	   * that the calculateVAT method returns the required VAT value for a service at the lower rate. The VAT value should be calculated
	   * against the actual charge incurred, not the standard charge for the service.
	   */
	  @Test
	  public void testLow() {
	    Service service = new Service("ROOM1234", "Room", VATRate.LOW, 10);
	    Charge charge = new Charge(service, 100);

	    assertEquals(service, charge.getService());
	    assertEquals(100, charge.getCharge(), 0);
	    assertEquals(5, charge.calculateVAT(), 0);
	  }

	  /**
	   * Creating a Charge object with a valid service and charge. Testing that the service and charge can be retrieved correctly and
	   * that the calculateVAT method returns the required VAT value for a service at the standard rate. The VAT value should be
	   * calculated against the actual charge incurred, not the standard charge for the service.
	   */
	  @Test
	  public void testStandard() {
	    Service service = new Service("ROOM1234", "Room", VATRate.STANDARD, 10);
	    Charge charge = new Charge(service, 100);

	    assertEquals(service, charge.getService());
	    assertEquals(100, charge.getCharge(), 0);
	    assertEquals(17.5, charge.calculateVAT(), 0);
	  }
	
}