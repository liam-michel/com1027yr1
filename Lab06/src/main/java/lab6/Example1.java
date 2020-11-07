package lab6;

/**
 * A simple class used to test the Weekday enum.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example1 {
		/**
		 * Main entry point: this is the first method that is run.
		 * 
		 * @param args The command line arguments.
		 */
		public static void main(String[] args) {
			// We want a variable to represent the day for late night shopping.
			Weekday lateNightShoppingDay = Weekday.THURSDAY;

			// toString() applied implicitly.
			System.out.println("Late night shopping is on " + lateNightShoppingDay);

			// Iterate over days of the week. Note that the .values() is a static method
			// that returns an array of the enum values in the
			// order in which they were declared.
			System.out.println("Days of the week");


			for (Weekday day : Weekday.values()) {
				switch (day) {
				case SATURDAY:
					System.out.println(day+" is a weekend");
					break;
					
				case SUNDAY:
					System.out.println(day+" is a weekend");
					break;
					
				// We need to add code here to deal with each day as needed.
				default:
					System.out.println(day + " is a working day");
					break;
				
				}
			}
			
			System.out.println(Weekday.FRIDAY.ordinal());
		}

	}

