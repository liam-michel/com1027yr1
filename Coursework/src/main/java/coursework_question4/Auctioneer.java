package coursework_question4;
import java.util.Map;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;

public class Auctioneer extends Dealership {
	private Seller topSeller;

	private Map<Seller,Integer> sales;
	private Map<Advert,Seller> carsForSale;
	private Map<Advert,Buyer> soldCars;
	private Map<Advert,Seller> unsoldCars;

	public Auctioneer(String name) {
		super(name);
		this.topSeller=null;
		this.sales = new HashMap<Seller,Integer>();
		this.carsForSale=new HashMap<Advert,Seller>();
		this.soldCars= new HashMap<Advert,Buyer>();
		this.unsoldCars= new HashMap<Advert,Seller>();
	}
	
	private boolean checkExistence (Car car) {
		if(carsForSale.keySet().contains(car)) {
			return true;
		}
		return false;
	}
	
	private void updateTopSeller(Seller seller) {
		if(this.topSeller==null) {
			this.topSeller=seller;
		}else {
			if(seller.getSales()>this.topSeller.getSales()) {
				this.topSeller=seller;
			}
		}
		
		
	
	}
	
	
	
	private int getAutomaticSales() { //method to get number of automatic sales
		int automatic = 0;
		for (Advert advert: this.soldCars.keySet()) {
			Car car = advert.getCar();
			if (car.getGearbox()==CarType.AUTOMATIC) {
				automatic+=1;
			}
		}
	
		return automatic;
	
	}
	
	private void saveInFile(int noOfSales, double percentageOfAutomatic, double percentageOfManual) {
		String filename = "auction_statistics.txt";
		try {
			FileWriter mywriter = new FileWriter(filename);
			StringBuilder mybuilder = new StringBuilder();
			mybuilder.append("Total Auction Sales: "+getAuctionSales());
			mybuilder.append(" Automatic Cars: "+percentageOfAutomatic+"%");
			mybuilder.append(" Manual Cars: "+percentageOfManual+"%\n");
			mybuilder.append("Top Seller: "+this.topSeller.toString());
			String towrite = mybuilder.toString();
			
			mywriter.write(towrite); //write the towrite string
			mywriter.close();  //close the filewriter
			//System.out.println("File has successfully been written to");  //print string to inform user that the writing was successful
			
		}catch (IOException e) {
			System.out.println("An IOException has occured");  
		}
	

		
	}

	private void updateStatistics(Seller seller) { //this method is going to call all of the other ones concerned with updating values i.e the filewriting
		updateTopSeller(seller);
		int totalsales = getAuctionSales();

		int automaticsales = getAutomaticSales();

		double automatic = ((float)automaticsales / totalsales);  //calculates % of cars that are automatic

		double manual = 1 - automatic;  //we can do 1 - automatic % to find the % that were manual
		
		automatic*=100;
		manual*=100;
		saveInFile(totalsales,automatic,manual);		
	
	}
		
	private int getAuctionSales() {
		int totalsales = 0;
		for (Integer num: this.sales.values()) {
			totalsales+=num;
		}
		
		return totalsales;
	}
	
	private String makeStatistics() { //this will return the statistics that are to be written to the file
		int totalsales = getAuctionSales();

		int automaticsales = getAutomaticSales();

		double automatic = ((float)automaticsales / totalsales);  //calculates % of cars that are automatic

		double manual = 1 - automatic;  //we can do 1 - automatic % to find the % that were manual
		
		automatic*=100;
		manual*=100;
		
		StringBuilder mybuilder = new StringBuilder();
		mybuilder.append("Total Auction Sales: "+getAuctionSales());
		mybuilder.append("	 Automatic Cars: "+automatic+"%");
		mybuilder.append("	 Manual Cars: "+manual+"%\n");
		mybuilder.append("Top Seller: "+this.topSeller.toString()+"\n");
		
		return mybuilder.toString();
	}
	
	
	public String displayStatistics() {
		StringBuilder mybuilder = new StringBuilder();
		mybuilder.append("** Auctioneer - "+super.name+"**\n");
		mybuilder.append(makeStatistics());
		return mybuilder.toString();
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
		
		Seller seller = null;
		
		for(Map.Entry<Advert,Seller> entry: this.carsForSale.entrySet()) {
			if (entry.getKey().equals(advert)) {
				seller = entry.getValue();
				this.carsForSale.remove(seller);
				break;
			}
		}
		
		Offer highestoffer= advert.getHighestOffer();		
		User buyer = highestoffer.getBuyer();
		if (highestoffer.getValue()<advert.getCar().getPrice()) {
			this.unsoldCars.put(advert, (Seller)seller);
		}else {
			this.soldCars.put(advert, (Buyer)buyer);
			updateSales(seller);
			updateStatistics(seller);
			
		}	
		
		
		
	}
	
	private void updateSales(Seller seller) {  //this method updates the this.sales<Seller,Integer> map, adding one to the number of sales
		if (this.sales.containsKey(seller)) {  //if the seller is already in the sales map
			this.sales.put(seller, this.sales.get(seller)+1); //get the value for the given seller, +1 and then store it back with the same key
		}else {
			this.sales.put(seller, 1);  //if the seller is not in the map, then put them in with a starting value of 1 sale
		}
		
		seller.incrementSales(); //use the Seller incrementSales() method to update its sales field
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
			this.carsForSale.put(carAdvert,(Seller)user);
		}
		

	}
	
}
