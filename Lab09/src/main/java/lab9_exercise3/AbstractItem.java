package lab9_exercise3;

/**
 * @author Stella Kazamia
 */
public abstract class AbstractItem implements IItem {

	/** Defines the current price of the item. */
	private double price = 0;

	/**
	 * Constructs an item object with an initial price.
	 * 
	 * @param price the initial price of the item.
	 */
	public AbstractItem(double price) {
		super();
		this.price = price;
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