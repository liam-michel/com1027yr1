package lab5_exercise3;

public class Pizza {
	private String[] toppings;
	
	public Pizza() {
		this.toppings = new String[10];
		
	}
	
	public void addToppings(String[] array) {
		if (array.length<=10) {
			for (int i=0; i<array.length;i++) {
				this.toppings[i]=array[i];  }
		}
	}

	public String printToppings() {
		String returnstring="";
		for(String i: this.toppings) {
			if (i!=null) {
				returnstring+=i+','; }
		}
			
		return returnstring.substring(0,returnstring.length()-1);
	}
	
	public double calculateCost() {
		int topcount=0;
		int i=0;
		while(this.toppings[i]!=null) {
			topcount++;
			i++;
		}
		
		if (topcount>4) {
			return 4.99+topcount;}
		else if (topcount==0){
			return 0;
		}
		else {
			return 8.99;
		}
		
		
		
	}
}
