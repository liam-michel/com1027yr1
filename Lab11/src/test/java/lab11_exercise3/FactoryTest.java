package lab11_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	  @Test
	  public void testFactory() {
	    Factory factory = new Factory("Wilkins", 23, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");

	    assertEquals("Wilkins", factory.getName());
	    assertEquals(23, factory.getNumber());
	    assertEquals("Swan Street", factory.getStreet());
	    assertEquals("Guildford", factory.getCity());
	    assertEquals("Surrey", factory.getCounty());
	    assertEquals("GU2 1AB", factory.getPostcode());
	    assertEquals("UK", factory.getCountry());
	  }
	  
	  
	  @Test
	  public void testGetAddress() {
	    Factory factory = new Factory("Wilkins", 23, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");

	    assertEquals("Wilkins\n23 Swan Street\nGuildford\nSurrey\nGU2 1AB\nUK\n", factory.getAddress());
	  }
	  
	  @Test(expected = IllegalArgumentException.class)
	  public void testInvalidName() {
		    Factory factory = new Factory(null, 23, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");

	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testInvalidNumber() {
		    Factory factory = new Factory("Sainsburys", 0, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");

	  }
	  
	  @Test(expected = IllegalArgumentException.class)
	  public void testInvalidAddress() {
		    Factory factory = new Factory("Sainsburys", 10, null, "Guildford", "Surrey", "GU2 1AB", "UK");

	  }
}
