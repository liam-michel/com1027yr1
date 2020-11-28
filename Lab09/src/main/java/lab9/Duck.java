package lab9;

/**
 * Duck.java
 */

/**
 * This class defines a generic duck.
 * 
 * @author Stella Kazamia
 * 
 */
public class Duck extends Animal {

	

	
	/**
	 * Constructor requiring the animal's name.
	 * 
	 * @param name the name of the animal.
	 */
	public Duck(String name) {
		super(name);
		System.out.println("In Duck constructor");
	}

	/**
	 * @return the animal's name.
	 * 
	 */
	@Override
	public String getName() {
		return super.getName() + " is my duck name";
	}
}
