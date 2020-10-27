package lab5;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example2 {

	public static void main(String[] args) {

		// Add your code here
		for (int i =1; i<=6; i++) {
			System.out.println();
			for (int j=0; j<=3; j++) {
				System.out.print(i+j*2); //take initial i value, then add j amounts of two to it. Our j value starts at 0, as the first number of each row requires 0x2, 2nd requires 1x2 and so on.
				System.out.print(" ");  //this creates a gap between the numbers on each row.
				
			}
		}
		
		
	}
}
