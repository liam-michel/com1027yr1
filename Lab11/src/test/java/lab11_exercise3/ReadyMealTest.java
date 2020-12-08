package lab11_exercise3;

import static org.junit.Assert.*;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class ReadyMealTest {

	@Test
	public void testaddItem() {
		Factory factory = new Factory("Charlie Bigham", 123, "North Street", "Guildford", "Surrey", "GU2 1AB", "UK");
		ReadyMeal readyMeal = new ReadyMeal("Chicken Korma", ProductType.INDIAN, factory);
		Item curry = new Item();
		Supplier supplier = new Supplier("Bloggs", "01483681234");
		curry.addIngredient(new Ingredient("Chicken", IngredientType.MEAT, supplier, 100, 110, 1.2, 0.6));
		curry.addIngredient(new Ingredient("Coconut Cream", IngredientType.VEGETABLE, supplier, 250, 824, 86.7, 10));
		readyMeal.addItem(curry);
		}
	
	@Test
	public void testaddItemAndDisplay() {
		Factory factory = new Factory("Charlie Bigham", 123, "North Street", "Guildford", "Surrey", "GU2 1AB", "UK");
		ReadyMeal readyMeal = new ReadyMeal("Chicken Korma", ProductType.INDIAN, factory);
		Item curry = new Item();
		Supplier supplier = new Supplier("Bloggs", "01483681234");
		curry.addIngredient(new Ingredient("Chicken", IngredientType.MEAT, supplier, 100, 110, 1.2, 0.6));
		curry.addIngredient(new Ingredient("Coconut Cream", IngredientType.VEGETABLE, supplier, 250, 824, 86.7, 10));
		readyMeal.addItem(curry);
		
		assertEquals("Indian Chicken Korma Ready Meal 280.0 g\n" + 
				"\n" + 
				"Contents\n" + 
				"Calories: 934.0kcal\n" + 
				"Meat (fat): 1.2g\n" + 
				"Vegetable (sodium): 10.0g\n" + 
				"\n" + 
				"Charlie Bigham\n" + 
				"123 North Street\n" + 
				"Guildford\n" + 
				"Surrey\n" + 
				"GU2 1AB\n" + 
				"UK\n" + 
				"", readyMeal.printContent());
		}

	@Test
	public void testReadyMeal() {
		Factory factory = new Factory("Wilkins", 23, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");
		ReadyMeal readyMeal = new ReadyMeal("Digestive", ProductType.TRADITIONAL, factory);

		assertEquals("Digestive", readyMeal.getName());
		assertEquals(ProductType.TRADITIONAL, readyMeal.getType());
		assertEquals(factory, readyMeal.getFactory());
	}

	@Test
	public void testPrintLabel() {
		Factory factory = new Factory("Wilkins", 23, "Swan Street", "Guildford", "Surrey", "GU2 1AB", "UK");
		ReadyMeal readyMeal = new ReadyMeal("Digestive", ProductType.TRADITIONAL, factory);

		Item biscuit = new Item();
		readyMeal.addItem(biscuit);

		assertEquals("Traditional Digestive Ready Meal 0.0 g\n" + 
				"\n" + 
				"Contents\n" + 
				"Calories: 0.0kcal\n" + 
				"Meat (fat): 0.0g\n" + 
				"Vegetable (sodium): 0.0g\n" + 
				"\n" + 
				"Wilkins\n" + 
				"23 Swan Street\n" + 
				"Guildford\n" + 
				"Surrey\n" + 
				"GU2 1AB\n" + 
				"UK\n" + 
				"", readyMeal.printContent());
	}

}
