package lab6;

public class Example2 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// We want a variable to represent the day for late night shopping.
		Weekdays lateNightShoppingDay = Weekdays.THURSDAY;

		// toString() applied implicitly.
		System.out.println("Late night shopping is on " + lateNightShoppingDay);

		// Iterate over days of the week. Note that the .values() is a static method
		// that returns an array of the enum values in the
		// order in which they were declared.
		System.out.println("Days of the week");
		Weekdays[] daysArray = Weekdays.values();

		for (Weekdays day : daysArray) {
			System.out.println(day + " is a " + day.getDayType()+" "+day.getDayNumber());
		}
	}
}
