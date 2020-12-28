package coursework_question3;
import java.util.List;
import java.util.ArrayList;

public class Advert {

	private Car car;
	private List<Offer> offers;
	
	public Advert(Car car) {
		if (car==null) {
			throw new IllegalArgumentException();
		}
		
		this.car=car;
		this.offers= new ArrayList<Offer>();
	}
	
	public Offer getHighestOffer() {
		Offer highestoffer=null; //this is our return value, started as null
		double highestnum=0;  
		for (Offer offer: this.offers) {  //loop throgh arraylist of offers
			if (offer.getValue()>highestnum) {  //checking if this offers value is higher than our current highest value
				highestnum=offer.getValue();   //copy the new high value into 'highestnum'
				highestoffer=offer;  //copy the offer from the array into our 'highestoffer' return variable
			}	
		}
		
		//once we are done checking the list, we have the highest value offer, we then return it
		return highestoffer;
	}

	
	public boolean placeOffer(User buyer, double value) {
		if((buyer==null) || (value<=0)) {
			throw new IllegalArgumentException("You can't place an offer with a null buyer");	
		}
		
		Offer newoffer = new Offer((Buyer)buyer, value);
		this.offers.add(newoffer);
		
		return true;
	}

	public Car getCar() {
		return this.car;
	}
	
	@Override
	public String toString() {
		String returnstring= "Ad: ";
		returnstring+=this.car.displayCarSpecification();
		return returnstring;
	}
			
			
			
		
	
	
}
