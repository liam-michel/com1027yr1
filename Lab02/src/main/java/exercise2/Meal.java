package exercise2;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	
	public Meal(Food mainCourse, Food dessert) {
		this.mainCourse=mainCourse;
		this.dessert=dessert;
		
		
	}
	
	public double calculateTotalSugarLevel() {
		return (this.mainCourse.getSugarLevel()+this.dessert.getSugarLevel());
		
		
		
	}

	@Override
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + dessert.getName() + "]";
	}

	
		
	}
	
	


