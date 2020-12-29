package coursework_question1;
import java.util.List;
import java.util.ArrayList;

public class Advert {

	private Car car;
	private List<Offer> offers;
	
	public Advert(Car car) {
		if (car==null) {  //if the user passes in a null object for the car, then we throw an exception
			throw new IllegalArgumentException();
		}
		
		this.car=car;
		this.offers= new ArrayList<Offer>();  //initalise the arraylist
	}
	
	public Offer getHighestOffer() {
		Offer highestoffer=null; //this is our return value, started as null. If there are no offers, then we will end up returning a null value
		double highestnum=0;  
		for (Offer offer: this.offers) {  //loop throgh arraylist of offers
			if (offer.getValue()>highestnum) {  //checking if this offers value is higher than our current highest value
				System.out.println("Offer with value "+offer.getValue() + " is the new highest offer");
				highestnum=offer.getValue();   //copy the new high value into 'highestnum'
				highestoffer=offer;  //copy the offer from the array into our 'highestoffer' return variable
			}	
		}
		
		//once we are done checking the list, we have the highest value offer, we then return it
		return highestoffer;
	}

	
	public boolean placeOffer(User buyer, double value) {
		if((buyer==null) || (value<=0)) { //if buyer is null or value<=0 then we throw exception
			throw new IllegalArgumentException("You can't place an offer with a null buyer");	
		}
		
		Offer newoffer = new Offer(buyer, value); //initalise a new offer with the passed in buyer and value
		this.offers.add(newoffer);  //add this offer to the list of offers (this.offers)
		
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
