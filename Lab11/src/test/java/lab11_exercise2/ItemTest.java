package lab11_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	  @Test
	  public void testGetTotalsZero() {
	    Supplier supplier = new Supplier("Bloggs", "01483681234");
	    Ingredient butter = new Ingredient("Butter", IngredientType.VEGETABLE, supplier, 10, 20, 30, 40);
	    Ingredient flour = new Ingredient("Flour", IngredientType.VEGETABLE, supplier, 5, 15, 25, 35);

	    Item biscuit = new Item();
	    biscuit.addIngredient(butter);
	    biscuit.addIngredient(flour);

	    assertEquals(35, biscuit.getTotalCalories(), 0);
	    assertEquals(0, biscuit.getTotalFat(IngredientType.MEAT), 0);
	    assertEquals(0, biscuit.getTotalSodium(IngredientType.MEAT), 0);
	    assertEquals(15 * 0.8, biscuit.getTotalWeight(), 0);
	  }
	  
	  @Test
	  public void testGetTotals() {
	    Supplier supplier = new Supplier("Bloggs", "01483681234");
	    Ingredient butter = new Ingredient("Butter", IngredientType.VEGETABLE, supplier, 10, 20, 30, 40);
	    Ingredient flour = new Ingredient("Flour", IngredientType.VEGETABLE, supplier, 5, 15, 25, 35);

	    Item biscuit = new Item();
	    biscuit.addIngredient(butter);
	    biscuit.addIngredient(flour);

	    assertEquals(35, biscuit.getTotalCalories(), 0);
	    assertEquals(55, biscuit.getTotalFat(IngredientType.VEGETABLE), 0);
	    assertEquals(75, biscuit.getTotalSodium(IngredientType.VEGETABLE), 0);
	    assertEquals(15 * 0.8, biscuit.getTotalWeight(), 0);
	  }

}
