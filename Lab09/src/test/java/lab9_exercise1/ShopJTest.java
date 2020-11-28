package lab9_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShopJTest {

	Shop shop = null;

	@Test
	public void lab9_testConstruction() {
		shop = new Shop();
		assertEquals("Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n" + "", shop.displayCatalogue());
	}

	@Test
	public void lab9_testAddItem() {
		shop = new Shop();
		shop.addItem(new MP3Player(250.00));
		assertEquals("Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n" + "MP3 Player	£250.00	£187.50\n" + "",
				shop.displayCatalogue());
	}

	@Test
	public void lab9_testAddTwoItems() {
		shop = new Shop();
		shop.addItem(new MP3Player(250.00));
		shop.addItem(new MP3Player(150.00));
		assertEquals("Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n" + "MP3 Player	£250.00	£187.50\n"
				+ "MP3 Player	£150.00	£112.50\n" + "", shop.displayCatalogue());
	}

	@Test
	public void lab9_testAddMultipleItems() {
		shop = new Shop();
		shop.addItem(new MP3Player(250.00));
		shop.addItem(new MP3Player(150.00));
		shop.addItem(new TV(499.00, 26));
		shop.addItem(new TV(999.00, 42));
		assertEquals("Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n" + "MP3 Player	£250.00	£187.50\n"
				+ "MP3 Player	£150.00	£112.50\n" + "TV (26\")	£499.00	£399.20\n" + "TV (42\")	£999.00	£799.20\n" + "",
				shop.displayCatalogue());
	}

}
