package lab9_exercise3;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Mall {
	private Map<Integer,Shop> shops;
	
	public Mall() {
		this.shops = new HashMap<Integer,Shop>();
	}
	
	public void addShop(int number, Shop shop) {
		if (shop==null) {
			throw new NullPointerException();
		}
		this.shops.put(number,shop);
	}
	
	public String displayAllShops() {
		String returnstring="";
		for (Map.Entry<Integer,Shop> slot: this.shops.entrySet()) {
			Integer key = slot.getKey();
			Shop shop = slot.getValue();
			returnstring+=(key+" : "+shop.displayCatalogue());
			
		}
		return returnstring;
	}
	
	
}
