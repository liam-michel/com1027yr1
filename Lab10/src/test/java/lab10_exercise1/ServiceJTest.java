package lab10_exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceJTest {
	/**
	   * Creating a Service object with an invalid code, and valid name, rate and standard charge.
	   */
	  @Test(expected = IllegalArgumentException.class)
	  public void testInvalidCode() {
	    new Service("1234", "Room", VATRate.STANDARD, 100);
	  }

	  /**
	   * Creating a Service object with an invalid code, and valid name, rate and standard charge.
	   */
	  @Test(expected = NullPointerException.class)
	  public void testInvalidCodeNull() {
	    new Service(null, "Room", VATRate.STANDARD, 100);
	  }

	  /**
	   * Creating a Service object with an invalid name (null), and valid code, rate and standard charge.
	   */
	  @Test(expected = NullPointerException.class)
	  public void testInvalidNameNull() {
	    new Service("ROOM1234", null, VATRate.STANDARD, 100);
	  }

	  /**
	   * Creating a Service object with an invalid standard charge, and valid name, code and rate.
	   */
	  @Test(expected = IllegalArgumentException.class)
	  public void testInvalidStandardCharge() {
	    new Service("ROOM1234", "Room", VATRate.STANDARD, -10);
	  }

	  /**
	   * Creating a Service object with a valid code, name, rate and standard charge. Testing that the code, name, rate and standard
	   * charge can be retrieved correctly.
	   */
	  @Test
	  public void testValid() {
	    Service service = new Service("ROOM1234", "Room", VATRate.STANDARD, 100);

	    assertEquals("ROOM1234", service.getCode());
	    assertEquals("Room", service.getName());
	    assertEquals(VATRate.STANDARD, service.getRate());
	    assertEquals(100, service.getStandardCharge(), 0);
	  }

}
