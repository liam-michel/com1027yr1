package lab7_exercise1;

public class Module {
	
	private String name;
	
	public Module(String name) {

		this.name=name;
		

	}
	
	public String getName() {
		String regex = "([A-Z]{3}[0-9]{4})";
		boolean matchFound = name.matches(regex);
		if (matchFound) {
			return this.name;
		}
		else {
			return "Error";
		}
	}
	

}
