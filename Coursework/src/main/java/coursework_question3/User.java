package coursework_question3;

public abstract class User {

	protected String fullname;
	
	public User(String fullname) {
		this.fullname=fullname;
		String regex = "[A-Z]{1}[a-z]+\s[A-Z]{1}[a-z]+";
		boolean matchfound = fullname.matches(regex);
		if (!matchfound) {
			throw new IllegalArgumentException();
		}
	}
	

	public abstract String getName();

	public abstract  String toString();

	
}