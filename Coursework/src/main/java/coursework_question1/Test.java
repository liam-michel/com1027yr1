package coursework_question1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auctioneer auctioneer = new Auctioneer("Adam Hills");
		Car car = new Car(8907, "Mazda 3", 4000, Condition.USED);
		Car car2 = new Car(9875, "Mazda 3", 4000, Condition.USED);
		User seller = new User("Sid James");
		User buyer = new User("Stella Kazamia");

		Advert ad = new Advert(car);


	}

}
