package lab9;

/**
 * MP3Player.java
 */

/**
 * This class defines an MP3 player item in a shop.
 * 
 * @author Stella Kazamia
 * 
 */
public class MP3Player implements IItem {

	/** Defines the percentage of the normal price used as the sale price. */
	private static final double SALE_PERCENTAGE = 0.75;

	/** Defines the current price of the MP3 player. */
	private double price = 0;

	/**
	 * Constructs an MP3Player object with an initial price.
	 * 
	 * @param price the initial price of the item.
	 */
	public MP3Player(double price) {
		super();
		this.price = price;
	}

	/**
	 * Calculates the price at which the item should be sold in a sale.
	 * 
	 * @return the sale price.
	 * 
	 */
	@Override
	public double calculateSalePrice() {
		return this.price * SALE_PERCENTAGE;
	}

	/**
	 * @return the name of the item.
	 * 
	 */
	@Override
	public String getName() {
		return "MP3 Player";
	}

	/**
	 * @return the current price of the item.
	 * 
	 */
	@Override
	public double getPrice() {
		return this.price;
	}

	/**
	 * @param price defines the new item price.
	 * 
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
}
