package coursework_question4;

public class Seller extends User {

	private int sales;
	
	public Seller(String fullname) {
		super(fullname);
		
	
	}
	

	@Override
	public String getName() {
		String fullname = super.fullname;
		String firstname = fullname.split(" ")[0];
		return firstname;
	}
	
	public int getSales() { //we will use this method to access sales when calculating top seller
		return this.sales;
	}
	
	public void incrementSales() {
		this.sales+=1;
	}
	
	public String identifyRating() {  //method for determining our sellers rating based on how many things they have sold
		if (this.sales==0) {
			return "Level 0"; //if sales=0 then return level 0
		}else if(sales<=5) {
			return "Level 1";  //if we have 5 or less sales then we are level 1
			
		}else if (sales<=10) {
			return "Level 2";  //we only reach here if the value is >=6 and <=10 so its within required boundaries for level 2
		}else {
			return "Level 3"; //if the value is >10 then we are level 3
		}
	}
	
	@Override
	public String toString() {
		String returnstring="";
		String fullname = super.fullname;
		String[] splitname = fullname.split(" ");
		//concatenates the first name, a space, the first letter of the second word and a full stop
		returnstring+=splitname[0] + " " + splitname[1].charAt(0)+". (";
		returnstring+=("Sales: "+this.sales + ", Rating: "+identifyRating()+")");
		
		return returnstring;
		
	}
}
