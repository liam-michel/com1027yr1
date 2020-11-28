package lab9;

/**
 * Animal.java
 */

/**
 * This class defines a generic animal.
 * 
 * @author Stella Kazamia
 * 
 */
public class Animal {

	/** The name of the animal. */
	private String name = null;


	
	/**
	 * Constructor requiring the animal's name.
	 * 
	 * @param name the name of the animal.
	 */
	public Animal(String name) {
		super();

		System.out.println("In Animal constructor");
		this.name = name;
	}

	/**
	 * @return the animal's name.
	 */
	public String getName() {
		return this.name;
	}
}
