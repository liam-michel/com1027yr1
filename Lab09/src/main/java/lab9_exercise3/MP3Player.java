package lab9_exercise3;

/**
 * MP3Player.java
 */

/**
 * This class defines an MP3 player item in a shop.
 * 
 * @author Stella Kazamia
 */
public class MP3Player extends AbstractItem {

	/** Defines the percentage of the normal price used as the sale price. */
	private static final double SALE_PERCENTAGE = 0.75;

	/**
	 * Constructs an MP3Player object with an initial price.
	 * 
	 * @param price the initial price of the item.
	 */
	public MP3Player(double price) {
		super(price);
	}

	/**
	 * Calculates the price at which the item should be sold in a sale.
	 * 
	 * @return the sale price.
	 * 
	 */
	@Override
	public double calculateSalePrice() {
		return this.getPrice() * SALE_PERCENTAGE;
	}

	/**
	 * @return the name of the item.
	 * 
	 */
	@Override
	public String getName() {
		return "MP3 Player";
	}
}
