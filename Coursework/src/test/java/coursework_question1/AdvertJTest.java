package coursework_question1;
import static org.junit.Assert.*;

import org.junit.Test;


public class AdvertJTest {

	Advert advert = null;
	
	
	@Test
	public void coursework_testAdvertConstruction() {
		Car car = new Car(4567,"Ford KA",1500,Condition.USED);
		advert = new Advert(car);
		assertEquals(car,advert.getCar());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void coursework_testInvalidAdvertConstruction() {
		Car car = null;
		advert = new Advert(car);
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void coursework_testInvalidOffer() {
		Car car = new Car(4567,"Ford KA",1500,Condition.USED);
		advert = new Advert(car); //make the advert with a valid car
		User buyer = null;  //make the buyer a null object
		advert.placeOffer(buyer, 0);  //place an offer with null buyer and value=0
		//the above line should throw IllegalArgumentException in placeOffer()
		
	}
	
	@Test
	public void coursework_testgetHighestOfferEmpty() {
		Car car = new Car(4567,"Ford KA",1500,Condition.USED);
		advert = new Advert(car); //make the advert with a valid car
		//since there are no offers, advert.getHighestOffer() should return null value;
		assertEquals(null,advert.getHighestOffer());
		
	}
	


	
	
	@Test
	public void coursework_testToString() {
		Car car = new Car(4567,"Ford KA",1500,Condition.USED);
		advert = new Advert(car);
		
		car.setBody(CarBody.MICRO);
		car.setColour("Red");
		car.setGearbox(CarType.MANUAL);
		car.setNumberOfSeats(4);

		assertEquals("Ad: 4567 - Ford KA (£1500.00)\n" +
		"	 Type: MANUAL\n	 Style: MICRO\n	 Colour: Red\n"+
		"	 No. of Seats: 4\n	 Condition: USED",advert.toString());
		
		
	}
}
