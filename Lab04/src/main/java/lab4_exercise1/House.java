package lab4_exercise1;

/**
 * Class used in Lab 4 to illustrate the use of the debugger and for creating
 * arrays of objects.
 * 
 * This class represents the order for milk bottles for a house.
 * 
 * @author Stella Kazamia
 */
public class House {

	/** The number of the house. */
	private int numberOfHouse;

	/** The number of milk bottles to deliver. */
	private int numberBottles;

	/**
	 * Constructor for class allowing the house number and number of milk bottles to
	 * be defined.
	 * 
	 * @param numberOfHouse the house number.
	 * @param numberBottles the number of milk bottles required.
	 */
	public House(int numberOfHouse, int numberBottles) {
		super();
		this.numberOfHouse = numberOfHouse;
		this.numberBottles = numberBottles;
	}

	/**
	 * @return the number of milk bottles required.
	 */
	public int getNumberBottles() {
		return this.numberBottles;
	}

	/**
	 * @return the house number.
	 */
	public int getNumberOfHouse() {
		return this.numberOfHouse;
	}

	/**
	 * @param numberBottles the new number of milk bottles required.
	 */
	public void setNumberBottles(int numberBottles) {
		this.numberBottles = numberBottles;
	}
	
	@Override
	public String toString() {
		return "House number: " + this.numberOfHouse + ", (" + this.numberBottles + " bottles)";
	}
}
