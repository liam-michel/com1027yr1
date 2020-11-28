package lab9;

/**
 * This class allows us to test various animals.
 * 
 * @author Stella Kazamia
 * 
 */
public class Pond {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		Mallard mallard = new Mallard("Quack");
		System.out.println(mallard.getName());
		Mallard nameless = new Mallard();
		System.out.println(nameless.getName());
	}
}
