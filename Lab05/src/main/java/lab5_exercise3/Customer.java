package lab5_exercise3;

public class Customer {
	private String name;
	private String surname;
	
	public Customer(String name, String surname) {
		this.name=name;
		this.surname=surname;
		
	}

	public char getName() {
		return name.charAt(0);
	}

	public String getSurname() {
		return surname;
	}

	
}
