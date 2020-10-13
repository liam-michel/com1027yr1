package lab2;
/**
 * 
 */

/**
 * @author liamd
 *
 */
public class NumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberInfo number = new NumberInfo(3);
		number.increment();
		System.out.println(number.getValue());
		number.increment();
		System.out.println(number.getValue());
		number.increment();
		System.out.println(number.getValue());


	}

}
