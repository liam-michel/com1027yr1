package lab9_exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MallJTest {
	Mall friaryMall = null;

	@Test
	public void lab9_testConstruction() {
		friaryMall = new Mall();
		assertEquals("", friaryMall.displayAllShops());
	}

	
	@Test
	public void lab9_testAddemptyShop() {
		friaryMall = new Mall();
		Shop shop = new Shop();
		friaryMall.addShop(0, shop);
		assertEquals("0 : Shop Catalogue\n" + 
				"\n" + 
				"Item		Price	Sale Price\n" + 
				"", friaryMall.displayAllShops());
	}
	
	@Test (expected = NullPointerException.class)
	public void lab9_testAddInvalidShop() {
		friaryMall = new Mall();
		friaryMall.addShop(0, null);
	}
	
	@Test
	public void lab9_testAddValidShop() {
		friaryMall = new Mall();
		Shop shop = new Shop();
		shop.addItem(new TV(850.00, 42));
		friaryMall.addShop(1, shop);
		assertEquals("1 : Shop Catalogue\n" + 
				"\n" + 
				"Item		Price	Sale Price\n" + 
				"TV (42\")	£850.00	£680.00\n" + 
				"", friaryMall.displayAllShops());
	}
}
