package lab6;


/**
 * A more complex enumerated type to represent week days with working day
 * parameters.
 *
 * @author Stella Kazamia
 * 
 */
public enum Weekdays {
	MONDAY("working day",1), TUESDAY("working day",2), WEDNESDAY("working day",3), THURSDAY("working day",4),
	FRIDAY("working day",5), SATURDAY("weekend",6), SUNDAY("weekend",7);

	/**
	 * To add a parameter to each enum we need a field of the correct type to hold
	 * the value.
	 */
	private String dayType;
	private int dayNumber;

	/**
	 * We also need a constructor to allow the parameter to be put into the field.
	 * Note that the constructor is private as we do not create objects from an
	 * enum.
	 * 
	 * @param dayType the type of day as specified in the parameter for each value.
	 */
	private Weekdays(String dayType,int dayNumber) {
		this.dayType = dayType;
		this.dayNumber=dayNumber;
		
	}

	/**
	 * To retrieve the parameter for a given value, we need a getter.
	 * 
	 * @return the type of day.
	 */
	public String getDayType() {
		return this.dayType;
	}
	
	public int getDayNumber() {
		return this.dayNumber;
	}
}

