package lab11_exercise2;
public class Supplier {
	private String name;
	private String phone;


	public Supplier(String name, String phone) {
		String regex = "(0[0-9]{6,10})";
		boolean matchfound = phone.matches(regex);
		if (!matchfound) {
			throw new IllegalArgumentException();
		}
		this.name=name;
		this.phone=phone;
		
	}
	
	public String getName() {
		return this.name;	
	}
	
	public String getPhone(){
		return this.phone;
	}
	
}
