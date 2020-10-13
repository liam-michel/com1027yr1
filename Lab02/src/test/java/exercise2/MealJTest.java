/**
 * MealTest.java
 */

package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A simple class used to test the "Meal" class.
 * 
 * @author Stella Kazamia
 */
public class MealJTest {

	/**
	 * Main entry point for the "Meal" example.
	 * 
	 */
	@Test
	public void MealOneValues() {
		Meal meal = new Meal(new Food("Fish and Chips", 0.2), new Food("Apple Pie", 17));
		assertEquals("Meal [mainCourse = Fish and Chips, dessert = Apple Pie]", meal.toString());
	}

	@Test
	public void MealTwoValues() {
		Meal meal = new Meal(new Food("BLT Sandwich", 4.7), new Food("Dark Chocolate", 48));
		assertEquals("Meal [mainCourse = BLT Sandwich, dessert = Dark Chocolate]", meal.toString());
		System.out.println(meal.toString());
		System.out.println("Total amount of sugar: " + meal.calculateTotalSugarLevel() + "g");
	}

	@Test
	public void MealThreeValues() {
		Meal meal = new Meal(new Food("Vegetarian Stuffed Peppers", 2), new Food("Fruit Salad", 45));
		assertEquals("Meal [mainCourse = Vegetarian Stuffed Peppers, dessert = Fruit Salad]", meal.toString());

	}

	@Test
	public void MealOne() {
		Meal meal = new Meal(new Food("fish and chips", 0.2), new Food("apple pie", 17));
		assertEquals(17.2, meal.calculateTotalSugarLevel(), 0);

	}

	@Test
	public void MealTwo() {
		Meal meal = new Meal(new Food("BLT Sandwich", 4.7), new Food("Dark Chocolate", 48));
		assertEquals(52.7, meal.calculateTotalSugarLevel(), 0);

	}

	@Test
	public void MealThree() {
		Meal meal = new Meal(new Food("Vegetarian Stuffed Peppers", 2), new Food("Fruit Salad", 45));
		assertEquals(47, meal.calculateTotalSugarLevel(), 0);

	}
}
