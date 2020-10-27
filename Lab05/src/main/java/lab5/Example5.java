package lab5;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reference = "HO1234";
		
		boolean foundMatch = reference.matches("(HO)([0-9]{4})");
		//The reference must start with "HO" and then be followed by 4 numbers ranging from 0-9
		
		if (foundMatch){
			System.out.println("Reference number is valid");
		
		}else {
			System.out.println("Reference number is not valid");
		}

	}

}
