package coursework_question2;

public class Offer {

	private double value;
	private User buyer;
	
	public Offer (User buyer, double value) {
		//if the value is <=0, or if the User object is null then throw an IllegalArgumentException
		if ((value<=0)  || (buyer==null)){
			throw new IllegalArgumentException("You entered an invalid offer");
		}
		
		this.value=value;
		this.buyer=buyer;
	}
	
	public User getBuyer() {
		return this.buyer;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		//buyer.toString() returns their fullname
		return (this.buyer.toString()+" offered £"+this.value);
	}
	

	
		
	
}
