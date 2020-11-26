package lab8_exercise3;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person;
		try {
			person = new Person("Hassan","Khan",20);
			System.out.println(person.toString());
		} catch (InvalidSurnameException | InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
