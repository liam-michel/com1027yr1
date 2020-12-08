package lab11_exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IngredientTest {

	@Test
	public void testGetCookedWeight() {
		Supplier supplier = new Supplier("Bloggs", "01483681234");
		Ingredient ingredient = new Ingredient("Chicken", IngredientType.MEAT, supplier, 100, 110, 1.2, 0.6);

		assertEquals(100 * 0.8, ingredient.getCookedWeight(), 0);
	}

	@Test
	public void testIngredient() {
		Supplier supplier = new Supplier("Bloggs", "01483681234");
		Ingredient ingredient = new Ingredient("Coconut Cream", IngredientType.VEGETABLE, supplier, 250, 824, 86.7, 10);

		assertEquals("Coconut Cream", ingredient.getName());
		assertEquals(IngredientType.VEGETABLE, ingredient.getType());
		assertEquals(supplier, ingredient.getSupplier());
		assertEquals(250, ingredient.getRawWeight(), 0);
		assertEquals(824, ingredient.getCalories(), 0);
		assertEquals(86.7, ingredient.getFat(), 0);
		assertEquals(10
				, ingredient.getSodium(), 0);
	}

}
