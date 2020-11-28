package lab9_exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShopJTest {
	private class DummyItem implements IItem {

		@Override
		public double calculateSalePrice() {
			return 120.4;
		}

		@Override
		public String getName() {
			return "TV (15\")";
		}

		@Override
		public double getPrice() {
			return 150.50;
		}

		@Override
		public void setPrice(double price) {

		}

	}

	Shop shop = null;

	@Test
	public void lab9_testConstruction() {
		shop = new Shop();
		assertEquals("Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n" + "", shop.displayCatalogue());
	}

	@Test
	public void lab9_testAddItem() {
		shop = new Shop();
		DummyItem item = new DummyItem();
		shop.addItem(item);
		assertEquals("Shop Catalogue\n" + 
				"\n" + 
				"Item		Price	Sale Price\n" + 
				"TV (15\")	£150.50	£120.40\n" + 
				"",
				shop.displayCatalogue());
	}

	@Test
	public void lab9_testAddTwoItems() {
		shop = new Shop();

		DummyItem item = new DummyItem();
		DummyItem item2 = new DummyItem();
		shop.addItem(item);
		shop.addItem(item2);
		assertEquals("Shop Catalogue\n" + 
				"\n" + 
				"Item		Price	Sale Price\n" + 
				"TV (15\")	£150.50	£120.40\n" + 
				"TV (15\")	£150.50	£120.40" + "\n", shop.displayCatalogue());
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
