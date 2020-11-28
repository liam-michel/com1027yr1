package lab9;

/**
 * TV.java
 */

/**
 * This class defines a TV item in a shop.
 * 
 * @author Stella Kazamia
 * 
 */
public class TV implements IItem {

	/** Defines the percentage of the normal price used as the sale price. */
	private static final double SALE_PERCENTAGE = 0.80;

	/** Defines the current price of the TV. */
	private double price = 0;

	/** Defines the size of the TV in inches. */
	private int size = 0;

	/**
	 * Constructs a TV object with an initial price and fixed size.
	 * 
	 * @param price the initial price of the item.
	 * @param size  the fixed size of the TV.
	 */
	public TV(double price, int size) {
		super();
		this.price = price;
		this.size = size;
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
		return "TV (" + this.getSize() + "\")";
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
	 * @return the fixed size of the TV.
	 */
	public int getSize() {
		return this.size;
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