package coursework_question1;
import java.util.Map;


import java.text.DecimalFormat;
import java.util.HashMap;


public class Auctioneer {  //defining all of the fields
	protected String name;
	protected Map <Advert, User> carsForSale;
	protected Map <Advert, User> soldCars;
	protected Map <Advert, User> unsoldCars;

	public Auctioneer(String name) { //parameterised constructor taking in a String name input, then initialising the name field along with the HashMaps
		this.name=name;
		this.carsForSale=new HashMap<Advert,User>();
		this.soldCars= new HashMap<Advert,User>();
		this.unsoldCars= new HashMap<Advert,User>();
		
	}
	
	
	public boolean checkExistence (Car car) {
		//we don't need to check if the Car object is null as this exception is already handled in the Advert class (from which we get the car).
		//checks if car is in the sequence of cars for sale
		for(Advert advert: this.carsForSale.keySet()) { //iterating through the keys in carForSale (type Advert)
			if(advert.getCar().equals(car)) { //if the car parameter is the same as the one we current select:
				System.out.println("Found car match"); 
				return true; //return true
			}
		}
		
		return false; //we only get here if we didn't find a match, so we return false (car is not already up for sale.
	}
	
	
	public String displaySoldCars() {  //method to display details of all sold cars
		DecimalFormat priceformat = new DecimalFormat("0.00"); //format for the price
		StringBuilder returnstring = new StringBuilder(); 
		returnstring.append("SOLD CARS:\n");  //The title for the output.
		for (Map.Entry<Advert,User> entry: this.soldCars.entrySet()) { //iterating over the entries in the soldCars Map
			Car advertcar= entry.getKey().getCar();  //get the Car object from the current entries key(type Advert)
			User buyer = entry.getValue(); //get the value from the current entry
			returnstring.append(advertcar.getID()+ " - Purchased by "+buyer.getName());
			returnstring.append(" with a successful £"+priceformat.format(entry.getKey().getHighestOffer().getValue())+" bid. \n");
			//the above line uses the Adverts getHighestOffer() method to return an Offer object, then gets the value of that offer
			//that value is then formatted with our DecimalFormat object (priceformat) 
		}
		
		return returnstring.toString();  //Convert the StringBuilder to type String and return it
	}
	
	
	public String displayStatistics() {
		return "Statistics";  
	}
	
	
	public String displayUnsoldCars() { //method to display details of all unsold cars
		StringBuilder returnstring = new StringBuilder();
		returnstring.append("UNSOLD CARS:\n");
		for (Advert advert: this.unsoldCars.keySet()) { //iterate over the keys in the unSoldCars map (type Advert)
			returnstring.append(advert.toString()+"\n"); //append the toString() representation of the advert to the StringBuilder
		}
		
		return returnstring.toString(); //Convert the StringBuilder to type String and return it
	}
	
	
	public void endSale(Advert advert) {
		if (advert==null) { 
			throw new IllegalArgumentException();
		}
		
		User seller = null;
		seller=this.carsForSale.get(advert);
		this.carsForSale.remove(advert); //remove the advert from the carsForSale map.
		
		Offer highestoffer= advert.getHighestOffer();		
		User buyer = highestoffer.getBuyer();
		if (highestoffer.getValue()<advert.getCar().getPrice()) { //if the highestoffer is less than the reserved price, then the car is not sold, but is added to unsoldCars
			this.unsoldCars.put(advert, buyer);
		}else { //otherwise, the car is sold and put in the soldCars map.
		
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
		
		//initialising the colour, type, body and seatnumber of the Car in the advert
		carAdvert.getCar().setColour(colour);
		carAdvert.getCar().setGearbox(type);
		carAdvert.getCar().setBody(body);
		carAdvert.getCar().setNumberOfSeats(noOfSeats);
		
		if (checkExistence(carAdvert.getCar())==false) {  //we only put the car up for sale if it isn't already up for sale.
		
			this.carsForSale.put(carAdvert,user);
		}
		

	}
	
}
