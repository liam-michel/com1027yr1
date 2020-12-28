package coursework_question4;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Seller> list = new ArrayList<Seller>();
		Seller seller = new Seller("Liam Michel");
		list.add(seller);
		int sales = list.get(0).getSales();
		System.out.println(sales);
		seller.incrementSales();
		int sales2 = list.get(0).getSales();
		System.out.println(sales2);
		
		
	}

}
