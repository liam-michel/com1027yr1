package coursework_question4;

public class Offer {

	private double value;
	private User user;
	
	public Offer (User user, double value) {
		//if the value is <=0, or if the User object is null then throw an IllegalArgumentException
		if ((value<=0)  || (user==null)){
			throw new IllegalArgumentException("You entered an invalid offer");
		}
		
		this.value=value;
		this.user=user;
	}
	
	public Buyer getBuyer() {
		return (Buyer)this.user; //bind User type to Buyer in order to return the correct type as per the UML diagram
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		//buyer.toString() returns their fullname
		return (this.user.toString()+" offered £"+this.value);
	}
	

	
		
	
}
