package coursework_question3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Trader extends Dealership {

	private List<Seller> sellers;
	private Map <Advert, Seller> carsForSale;
	private Map <Advert, Buyer> soldCars;
	private Map <Advert, Seller> unsoldCars;

	
	public Trader(String name) {
		super(name);
		this.carsForSale=new HashMap<Advert,Seller>();
		this.soldCars= new HashMap<Advert,Buyer>();
		this.unsoldCars= new HashMap<Advert,Seller>();
		
	}
	
	private boolean checkExistence (Car car) {
		//checks if car is in the sequence of cars for sale
		for (Advert advert: carsForSale.keySet()) {
			if (advert.getCar().equals(car)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public String displaySoldCars() {
		DecimalFormat priceformat = new DecimalFormat("0.00"); //format for the price
		StringBuilder returnstring = new StringBuilder();
		returnstring.append("SOLD CARS:\n");
		for (Map.Entry<Advert,Buyer> entry: this.soldCars.entrySet()) {
			Car advertcar= entry.getKey().getCar();
			Buyer buyer = entry.getValue();
			returnstring.append(advertcar.getID()+ " - Purchased by "+buyer.toString());
			returnstring.append(" with a successful £"+priceformat.format(entry.getKey().getHighestOffer().getValue())+" bid. \n");
			//the above line uses the Adverts getHighestOffer() method to return an Offer object, then gets the value of that offer
			//that value is then formatted with DecimalFro
		}
		
		return returnstring.toString();
	}
	
	
	public String displayStatistics() {
		return "Statistics";
	}
	
	
	public String displayUnsoldCars() {
		StringBuilder returnstring = new StringBuilder();
		returnstring.append("UNSOLD CARS:\n");
		for (Advert advert: this.unsoldCars.keySet()) {
			returnstring.append(advert.toString()+"\n");
		}
		
		return returnstring.toString();
	}
	
	
	private void endSale(Advert advert) {
		if (advert==null) {
			throw new IllegalArgumentException();
		}		
			
		this.carsForSale.remove(advert);

		
		Offer highestoffer= advert.getHighestOffer();		
		Buyer buyer = highestoffer.getBuyer();
		

		this.soldCars.put(advert,buyer);

		
		
		
	}
	
	public boolean placeOffer(Advert carAdvert, User user, double value) {
		if ((carAdvert==null) || (user==null)) {
			throw new IllegalArgumentException();
		}else if (carAdvert.getCar().getType()==SaleType.AUCTION) {
			throw new IllegalArgumentException("You can only place an offer on an item if its for sale.");
		}
		
	
		for (Advert advert: this.carsForSale.keySet()) { //iterates over the keys in the forsale hashmap
			if (advert.equals(carAdvert)) {  //checks to see if the passed in advert == the one we are at in the hashmap
				advert.placeOffer(user, value); //if it is, then place the offer with the passed in user and value
				if (isOfferValid(advert, value)) {
					return true;  //return true to indicate that the offer was placed and sale was ended
				}
			}
		}
		
		return false; //if we make it here, then the offer was invalid
		
	}
	
	
	//auctioneer.registerCar(null, null, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5)
	public void registerCar(Advert carAdvert, User user, String colour, CarType type, CarBody body, int noOfSeats) {
		if ((carAdvert==null) || (user==null)){
			throw new IllegalArgumentException();
		}

		carAdvert.getCar().setColour(colour);
		carAdvert.getCar().setGearbox(type);
		carAdvert.getCar().setBody(body);
		carAdvert.getCar().setNumberOfSeats(noOfSeats);
		if (checkExistence(carAdvert.getCar())==false) {  //we only put the car up for sale if it isn't already up for sale.
			this.carsForSale.put(carAdvert,(Seller)user);
		}

	}
	
	private boolean isOfferValid(Advert advert,double value) { //method to check if a placed offer is valid
		Car car = advert.getCar(); //assign the car from the advert to a local variable
		double carprice = car.getPrice();  //get the reserved price of the car for sale
		if (value>=carprice) { //if the offer value is less than the carprice, then return false			
			endSale(advert); //end the sale as the offer is valid
			return true; //return true to indicate that we ended the sale
		}

			return false;  //if we get here then the offer was not valid, so we return false
	}
	
}