package lab7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * An example on how user-defined methods can be used to structure how HashMaps
 * work
 * 
 * @author Stella Kazamia
 *
 */
public class Example3 {
	// Create a map
	private Map<String, Double> values;

	/**
	 * Define the map as a HashMap in a default constructor
	 * 
	 */
	public Example3() {
		super();
		this.values = new HashMap<String, Double>();
	}

	/**
	 * In a UML, this would look like this: + addElement(in key: String, in value:
	 * double)
	 */
	public void addElement(String key, double value) {
		// add code here
		this.values.put(key,value);
	}

	/**
	 * In a UML, this would look like this: + removeElement (in key: String)
	 */
	public void removeElement(String key) {
		if (checkifElementExists(key)) {
			// add code here
			this.values.remove(key);
		}
	}

	/**
	 * In a UML, this would look like this: - checkIfElementExists(in key: String):
	 * boolean
	 */
	private boolean checkifElementExists(String key) {
		String newKey = key.toUpperCase();
		boolean output = false;
		if (this.values.containsKey(newKey)) {
			output = true;
		}

		return output;

	}

	/**
	 * In a UML, this would look like this: + retrieveElement(in key: String)
	 */
	public double retrieveElement(String key) {
		double value = 0;
		if (checkifElementExists(key)) {
			//add code here
			value=this.values.get(key);
		} else {
			System.out.println("Invalid Index");
		}
		return value;
	}

	/**
	 * In a UML, this would look like this: + displayList(): String
	 */
	public String displayMap() {
		String output = "";
		for (String temp : this.values.keySet()) {
			output += "Key:" + temp + " Value:" + retrieveElement(temp) + " ";
		}
		return output;
	}

	/**
	 * In a UML, this would look like this: + displaysortedList(): String
	 */
	public String displayOrderedMap() {
		StringBuffer output = new StringBuffer();

		// Collections.sort won't work on maps, therefore we need to use a different way
		// of achieving this. One way of doing this is: a)Create a temporary list,
		// b) order the list, c) extract values from the map based on the list values
		List<String> keys = new ArrayList<String>();

		for (String key : this.values.keySet()) {
			keys.add(key);
		}

		Collections.sort(keys);
		output.append("Ordered Map\n");

		for (String key : keys) {
			output.append("Key:");
			output.append(key);
			output.append(" Value:");
			output.append(this.values.get(key));
			output.append("\n");
		}
		return output.toString();
	}

	/**
	 * In a UML, this would look like this: + calculateAverage(): double
	 */
	public double calculateAverage() {
		double output = 0;
		for (double temp : this.values.values()) {
			output += temp;
		}
		return output / this.values.size();
	}

	public static void main(String[] args) {
		Example3 test = new Example3();
		List<String> moduleNames = new ArrayList<String>();

		// Now read in names from the command line to put into the temporary arraylist.
		boolean finished = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter module names, one per line");

		// Continue reading until "exit" is entered.
		while (!finished) {
			String line = scanner.nextLine();

			// Check for exit.
			if (line.startsWith("exit")) {
				finished = true;
			} else {
				// Not exit, so a new key-value pair is expected
				moduleNames.add(line.toUpperCase());
				finished = !scanner.hasNextLine();
			}
		}

		System.out.println("You have defined " + moduleNames.size() + " modules.");

		List<Double> moduleGrades = new ArrayList<Double>();

		// Now read in grades from the command line to put into the temporary arraylist.
		finished = false;
		int i = 0;

		// Continue reading until the end of the list.
		while (i < moduleNames.size()) {
			System.out.println("Enter the grade for " + moduleNames.get(i) + " :");
			String line = scanner.nextLine();

			// Check for exit.
			if (line.startsWith("exit")) {
				finished = true;
			} else {
				// Not exit, so a new key-value pair is expected
				moduleGrades.add(Double.parseDouble(line));
			}
			i++;
		}

		scanner.close();

		// add key-value pairs in the map
		for (int index = 0; index < moduleNames.size(); index++) {
			test.addElement(moduleNames.get(index), moduleGrades.get(index));
		}

		// remove an element from the list
		test.removeElement("COM1027");

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .get method");
		System.out.println();

		// retrieve elements and display them on the console
		System.out.println("This is the value associated to the key 'COM1025': " + test.retrieveElement("COM1025"));
		System.out.println("This is the value associated to the key 'COM1026': " + test.retrieveElement("COM1026"));

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Displaying Map");
		System.out.println();

		// display all the elements of the list
		System.out.println(test.displayMap());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .sort method");
		System.out.println();

		// add one more element in the list
		test.addElement("COM1027", 75);

		// display all the elements of the list
		System.out.println(test.displayMap());

		// display all the elements of the list (in an order)
		System.out.println(test.displayOrderedMap());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Applying arithmetic operations on list values");
		System.out.println();

		// calculate the average and display it on the console
		System.out.println(test.calculateAverage());

	}

}

