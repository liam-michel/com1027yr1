package lab3;

public class User {
	private String name;
	private Email email;
	
	public User(String fullname, Email emailAddress) {
		this.name=fullname;
		this.email=emailAddress;
		
	}
	public String toString() {
		return this.name+" <" + this.email.getEmailAddress() + ">";
		
	}

}
