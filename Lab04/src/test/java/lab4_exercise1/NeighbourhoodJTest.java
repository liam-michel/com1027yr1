package lab4_exercise1;
/**
 * @author Stella Kazamia
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NeighbourhoodJTest {

	Neighbourhood guildford;
	@Test
	public void lab4_testConstruction() {
		guildford = new Neighbourhood();
		String testHouse = new House(3,4).toString();
	assertEquals(testHouse, guildford.getHouses(0).toString());
	
	}
	
	@Test
	public void lab4_testCalculateTotal() {
		guildford = new Neighbourhood();
		assertEquals(7, guildford.calculateTotal());
	}
	@Test
	public void lab4_testDisplayArray() {
		guildford = new Neighbourhood();
		assertEquals("Number of bottles in House number 3 is 4\n" + 
				"Number of bottles in House number 5 is 1\n" + 
				"Number of bottles in House number 7 is 2\n" + 
				"Total number of bottles to be delivered: 7", guildford.displayArray());
	}
	
	@Test
	public void lab4_testSetter() {
		guildford = new Neighbourhood();
		guildford.setHouses(0, 1, 3);
		String testHouse = new House(1,3).toString();
		assertEquals(testHouse, guildford.getHouses(0).toString());
	
	}
	@Test
	public void lab4_testObject() {
		Neighbourhood nh = new Neighbourhood();

		nh.setHouses(0, 10, 1);
		assertEquals(10, nh.getHouses(0).getNumberOfHouse());
		assertEquals(1, nh.getHouses(0).getNumberBottles());
	}
	
	
	
}
