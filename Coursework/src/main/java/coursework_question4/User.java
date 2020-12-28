package coursework_question4;

public abstract class User {

	protected String fullname;
	
	public User(String fullname) {
		this.fullname=fullname;
		String regex = "[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+";
		boolean matchfound=fullname.matches(regex);
		if (!matchfound) {  //if the name does not match the regex then throw an exception
			throw new IllegalArgumentException("Both names must start with capital letters");
		}
	}
	

	public abstract String getName();

	public abstract  String toString();

	
}