package coursework_question4;

public abstract class User {

	protected String fullname;
	
	public User(String fullname) {
		this.fullname=fullname;
	}
	

	public abstract String getName();

	public abstract  String toString();

	
}