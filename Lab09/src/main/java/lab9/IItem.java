package lab9;

/**
 * IItem.java
 */

/**
 * Defines the expected behaviour for any class which defines an item in a shop.
 * 
 * @author Stella Kazamia
 */
public interface IItem {

	/**
	 * Calculates the price at which the item should be sold in a sale.
	 * 
	 * @return the sale price.
	 */
	public abstract double calculateSalePrice();

	/**
	 * @return the name of the item.
	 */
	public abstract String getName();

	/**
	 * @return the current price of the item.
	 */
	public abstract double getPrice();

	/**
	 * @param price defines the new item price.
	 */
	public abstract void setPrice(double price);
}
