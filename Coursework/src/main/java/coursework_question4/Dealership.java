package coursework_question4;
import java.util.Map;
import java.util.HashMap;

public abstract class Dealership {

	protected String name;
	protected Map<Advert,Seller> carsForSale;
	protected Map<Advert,Buyer> soldCars;
	protected Map<Advert,Seller> unsoldCars;
	
	public Dealership(String name) {
		this.name=name;
		Map<Advert,Seller> carsForSale= new HashMap<Advert,Seller>();
		Map<Advert,Seller> soldCars = new HashMap<Advert,Seller>();
		Map<Advert,Seller> unsoldCars = new HashMap<Advert,Seller>();
		
	}
	
	
	public abstract String displaySoldCars();
	
	public abstract String displayStatistics();

	public abstract String displayUnsoldCars();
	
	public abstract boolean placeOffer(Advert carAdvert, User user, double value);
	
	public abstract void registerCar(Advert carAdvert, User user, String colour, CarType type, CarBody body, int noOfSeats);
	
	
	
}
