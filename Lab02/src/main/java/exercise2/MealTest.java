package exercise2;

public class MealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food main = new Food ("BLT Sandwich",4.7);
		Food dessert = new Food ("Dark Chocolate",48);
		Meal mymeal = new Meal (main,dessert);
		System.out.println(mymeal.toString());
		System.out.println("Total amount of sugar: " + mymeal.calculateTotalSugarLevel() + "g");
		
		
		
		
		

	}

}
