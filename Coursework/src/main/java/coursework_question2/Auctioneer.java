package coursework_question2;
import java.util.Map;


import java.text.DecimalFormat;
import java.util.HashMap;


public class Auctioneer {
	protected String name;
	protected Map <Advert, User> carsForSale;
	protected Map <Advert, User> soldCars;
	protected Map <Advert, User> unsoldCars;

	public Auctioneer(String name) {
		this.name=name;
		this.carsForSale=new HashMap<Advert,User>();
		this.soldCars= new HashMap<Advert,User>();
		this.unsoldCars= new HashMap<Advert,User>();
		
	}
	
	private boolean checkExistence (Car car) {
		//checks if car is in the sequence of cars for sale
		for(Advert advert: this.carsForSale.keySet()) {
			if(advert.getCar().equals(car)) {
				System.out.println("Found car match");
				return true;
			}
		}
		
		return false;
	}
	
	
	public String displaySoldCars() {
		DecimalFormat priceformat = new DecimalFormat("0.00"); //format for the price
		StringBuilder returnstring = new StringBuilder();
		returnstring.append("SOLD CARS:\n");
		for (Map.Entry<Advert,User> entry: this.soldCars.entrySet()) {
			Car advertcar= entry.getKey().getCar();
			User buyer = entry.getValue();
			returnstring.append(advertcar.getID()+ " - Purchased by "+buyer.getName());
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
	
	
	public void endSale(Advert advert) {
		if (advert==null) {
			throw new IllegalArgumentException();
		}
		
		for (Advert index: this.carsForSale.keySet()) {
			if (index.equals(advert)) {
				this.carsForSale.remove(index);
				break;
				
			}
		}
		
		
		Offer highestoffer= advert.getHighestOffer();		
		User buyer = highestoffer.getBuyer();
		if (highestoffer.getValue()<advert.getCar().getPrice()) {
			this.unsoldCars.put(advert, buyer);
		}else {
		
			this.soldCars.put(advert, buyer);
		}	
		
		
		
	}
	
	public boolean placeOffer(Advert carAdvert, User user, double value) {
		if ((carAdvert==null) || (user==null)) {
			throw new IllegalArgumentException();
		}
		
		for (Advert advert: this.carsForSale.keySet()) { //iterates over the keys in the forsale hashmap
			if (advert==carAdvert) {  //checks to see if the passed in advert == the one we are at in the hashmap
				advert.placeOffer(user, value); //if it is, then place the offer with the passed in user and value
				return true;  //return true to indicate that the offer was placed
			}
		}
		
		return false; //if we make it here, then the car is not for sale so we return false
		
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
			this.carsForSale.put(carAdvert,user);
		}

	}
	
}
