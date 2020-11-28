package lab9_exercise2;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		MP3Player mp3_1 = new MP3Player(250.00);
		MP3Player mp3_2 = new MP3Player(150.00);
		TV tv_1 = new TV(499.00, 26);
		TV tv_2 = new TV(999.00,42);
		shop.addItem(mp3_1);
		shop.addItem(mp3_2);
		shop.addItem(tv_1);
		shop.addItem(tv_2);
		System.out.println(shop.displayCatalogue());
	}
	

}
