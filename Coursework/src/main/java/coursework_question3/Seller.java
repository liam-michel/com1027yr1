package coursework_question3;

public class Seller extends User {

	
	public Seller(String fullname) {
		super(fullname);
		
	}
	

	@Override
	public String getName() {
		String fullname = super.fullname;
		String firstname = fullname.split(" ")[0];
		return firstname;
	}
	
	
	@Override
	public String toString() {
		String returnstring="";
		String fullname = super.fullname;
		String[] splitname = fullname.split(" ");
		//concatenates the first name, a space, the first letter of the second word and a full stop
		returnstring+=splitname[0] + " " + splitname[1].charAt(0)+". ()";
		
		return returnstring;
		
	}
}
