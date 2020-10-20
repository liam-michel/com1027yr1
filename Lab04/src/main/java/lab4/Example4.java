package lab4;
import java.util.List;
import java.util.ArrayList;

/**
 * A simple class to introduce ArrayLists
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {

	// Add a field
	private List<String> namesList = new ArrayList<String>();
	

	// Add a default constructor
	public Example4() {
		this.namesList=namesList;
	}

	public void addNames() {
		// Initialise the array list
		this.namesList.add("Helen");
		this.namesList.add("Stella");
		

	}

	public String displayNames() {
		// Loop through the array list
		String names = "";
		for(int i=0;i<this.namesList.size();i++) {
			names+=this.namesList.get(i);
		}
		return names;
		
		}
		

}

