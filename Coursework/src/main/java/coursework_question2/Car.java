package coursework_question2;

import java.lang.StringBuilder;
import java.text.DecimalFormat;



public class Car {

	private int id;
	private String name;
	private String colour;
	private double reservedPrice;
	private CarType gearbox;   //ENUM
	private CarBody body;
	private int numberOfSeats;  //ENUM
	private Condition condition;  //ENUM
	private SaleType type;
	
	//car = new Car(2345, "Toyota Corolla", 7000, Condition.USED);
	public Car(int id, String name, double reservedPrice, Condition condition,SaleType type) {
		
		//below are the three things that can have invalid inputs
		//if name or price or ID are invalid then throw IllegalArgumentException
		
		if ((name==null) || (reservedPrice<=0) || (id<=0)) {  
			throw new IllegalArgumentException("You have entered an illegal value");
		}
		
		
		this.id =id;
		this.name=name;
		this.reservedPrice=reservedPrice;
		this.condition=condition;
		this.type=type;
	}
	
	@Override
	public boolean equals(Object other) { //the default .equals() method does not work for comparing all object fields for equality, so have to override it
	    if (!(other instanceof Car)) {
	        return false;
	    }

	    Car that = (Car) other;

	    // Custom equality check here.
	    return this.id==that.id
	        && this.name.equals(that.name)
	        && this.reservedPrice==that.reservedPrice
	        && this.condition.equals(that.condition);
	}
	public String displayCarSpecification() {
		
		DecimalFormat priceformat = new DecimalFormat("0.00"); //format for the price
		String returnstring="";
		returnstring+=(this.getID()+" - "+this.getName()
	 			+" (£"+priceformat.format(this.getPrice())+")\n	 Type: "+this.getGearbox()
				+"\n	 Style: "+this.getBodyStyle()+"\n	 Colour: "+this.getColour()
				+"\n	 No. of Seats: "+this.getNumberOfSeats()+"\n	 Condition: "+this.getCondition()); 
		

		
		return returnstring;
		
	}

	
	public int getID() {
		return this.id;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public double getPrice() {
		return this.reservedPrice;
	}
	
	public CarBody getBodyStyle() {
		return this.body;
	}
	
	public CarType getGearbox() {
		return this.gearbox;
	}
	
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
	
	public SaleType getType() {
		return this.type;
	}
	
	
	public Condition getCondition() {
		return this.condition;
	}
	
	public void setBody(CarBody body) {
		this.body=body;
	}
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	public void setGearbox(CarType gearbox) {
		this.gearbox=gearbox;
	}
	
	public void setNumberOfSeats (int number) {
		this.numberOfSeats=number;
	}
	
	public void setType(SaleType type) {
		this.type=type;
	}
	
	
	@Override
	public String toString() {
		return this.id + " - " +this.name;	
	}
	
}
