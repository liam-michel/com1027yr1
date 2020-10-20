package lab4_exercise1;


public class Neighbourhood {
	House[] houses = new House[3];
	

	
	public Neighbourhood() {
		houses[0] = new House(3,4);
		houses[1]= new House(5,1);
		houses[2]= new House(7,2);
		System.out.println(this.displayArray());
		

	}
	public int calculateTotal() {
		int total=0;
		for (int i=0; i<houses.length;i++) {
			total+=houses[i].getNumberBottles();
			
		}
		return total;
		
	}
	public String displayArray() {
		int totalbottles = 0;
		String returnstatement = "";
		for (int i=0; i<houses.length; i++) {
			returnstatement+=("Number of bottles in House number "+houses[i].getNumberOfHouse()+" is "+houses[i].getNumberBottles()+"\n");
			totalbottles+=houses[i].getNumberBottles();
			
		}
		returnstatement+=("Total number of bottles to be delivered: "+totalbottles);
		return returnstatement;
		
	}
	
	public House getHouses(int index) {
		return houses[index];
	}
	
	public void setHouses(int index, int numberOfHouse, int numberBottles) {
		houses[index]= new House(numberOfHouse,numberBottles);
	}
	

	

}
