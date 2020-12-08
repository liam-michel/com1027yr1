package lab11_exercise3;
import java.util.List;
import java.util.ArrayList;




public class Item implements IItem{

	private List<Ingredient> ingredients;
	
	public Item() {
		this.ingredients= new ArrayList<Ingredient>();
	
	}
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public double getTotalWeight() {
		double total=0;
		for (Ingredient ingredient: this.ingredients) {
			total+=ingredient.getCookedWeight();
		}
		return total;
		
	}
	
	public double getTotalCalories() {
		double total=0;
		for (Ingredient ingredient: this.ingredients) {
			total+=ingredient.getCalories();
		}
		
		return total;
	}
	
	public double getTotalFat(IngredientType ingredient) {

		double total=0;
		for (Ingredient index: this.ingredients) {
			if(typeEquiv(ingredient,index.getType())) {
				total+=index.getFat();
			}
		}
		
		return total;
	}
	
	public double getTotalSodium(IngredientType ingredient) {

		double total=0;
		for (Ingredient index: this.ingredients) {
			if(typeEquiv(ingredient, index.getType())) {
			total+=index.getSodium();
			}
		}
		
		return total;

	}
		
	private boolean typeEquiv(IngredientType ingred1, IngredientType ingred2) {
		if (ingred1==ingred2) {
			return true;
		}
		return false;
	}
	
	
	
}

