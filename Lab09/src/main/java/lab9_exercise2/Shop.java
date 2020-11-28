package lab9_exercise2;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;



public class Shop {
	private List<IItem> items;

	
	public Shop() {
		this.items = new ArrayList<IItem>();
	}
	
	public void addItem(IItem item) {
		if (item.getPrice()<=0) {
			throw new IllegalArgumentException("Invalid Price");
		}
		this.items.add(item);
	}
	
	public String displayCatalogue() {
		DecimalFormat decformat = new DecimalFormat("00.00");
		String returnstring= "Shop Catalogue\n" + "\n" + "Item		Price	Sale Price\n";
		for (IItem item: this.items) {
			returnstring+=(item.getName()+"	£"+decformat.format(item.getPrice())+"	£"+decformat.format(item.calculateSalePrice())+"\n");
		}
		
		return returnstring;
	}
	
	public static void main(String[] args) {
		Shop myshop = new Shop();
		myshop.addItem(new MP3Player(250.00));
		myshop.addItem(new MP3Player(150.00));
		myshop.addItem(new TV(499.00,26));
		myshop.addItem(new TV(999.00,42));
		System.out.println(myshop.displayCatalogue());
	}
	

}
