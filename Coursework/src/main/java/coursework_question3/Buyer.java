package coursework_question3;

public class Buyer extends User {

	private int age;
	
	public Buyer(String fullname, int age) {
		super(fullname);
		if (age<18) {
			throw new IllegalArgumentException();
		}
		
		this.age=age;
		
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	
	@Override
	public String getName() {
		String fullname = super.fullname;
		String firstname = fullname.split(" ")[0];
		return firstname;
	}
	
	
	@Override
	public String toString() {
		StringBuilder returnstring = new StringBuilder();
		String firstname = getName();
		int lastposition = firstname.length()-1; //gets the index position of the last letter (i.e length of word -1)
		returnstring.append(firstname.charAt(0));
		returnstring.append("***");
		returnstring.append(firstname.charAt(lastposition));
		
		return returnstring.toString(); //returns a string version of the stringbuilder
				
			
		
	}
	
}
