package coursework_question1;

public class User {

	private String fullname;
	
	public User(String fullname) {
		//regex that allows for two words starting with capitals followed by 1 or more letters, both words seperated by a space
		//I require atleast one lowercase letter after the uppercase one as otherwise it'd be an initial rather then a name.
		String regex = "([A-Z]{1}[a-z]+\s[A-Z]{1}[a-z]+)";
		boolean matchfound=fullname.matches(regex);
		if (!matchfound) {  //if the name does not match the regex then throw an exception
			throw new IllegalArgumentException("Both names must start with capital letters");
		}
	
		//program only reaches here if the input was valid, assign it to this.fullname
		this.fullname=fullname;
		
	}
	
	
	//Returns the first name of the user
	public String getName() {
	String[] splitstring = this.fullname.split(" "); //splits the users fullname on space 	
	String fname = splitstring[0];  //first (0th) slot in the array contains first name
	return fname;  
	
	}
	
	
	@Override //override the default toString method
	public String toString() {
		return this.fullname;
	}
	
	
}