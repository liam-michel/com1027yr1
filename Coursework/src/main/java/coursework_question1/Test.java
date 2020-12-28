package coursework_question1;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(1234, "Mazda 3", 20000, Condition.NEW);
		Car car1 = new Car(1234, "Mazda 3", 20000, Condition.NEW);
		System.out.println(car.equals(car1));
	}

}
