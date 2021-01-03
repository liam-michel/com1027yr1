package lab11_exercise3;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class ReadyMeal {
	private String name;
	private ProductType type;
	private Factory factory;
	private Date productionDate;
	private List<IItem> items;

	public ReadyMeal(String name, ProductType type, Factory factory) {
		this.items = new ArrayList<IItem>();
		this.name=name;
		this.type=type;
		this.factory=factory;
	}
	
	public void addItem(IItem item) {
		this.items.add(item);
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public ProductType getType() {
		return type;
	}
	
	public Factory getFactory() {
		return factory;
	}
	public String printContent() {
		StringBuilder mybuilder = new StringBuilder();
		String name = getType().toString();
		int length = name.length();
		String newname= (name.substring(0,1).toUpperCase()+ name.substring(1,length).toLowerCase());
		double weight = 0;
		for (IItem item: this.items) {
			weight+= item.getTotalWeight();
		}
		
		mybuilder.append(newname+ " " + this.name + " Ready Meal "+weight+" g\n");
		mybuilder.append("\n");	
		mybuilder.append("Contents\n");
		
		for (IItem item: this.items) {
			mybuilder.append("Calories: "+ item.getTotalCalories()+"kcal\n");
			mybuilder.append("Meat (fat): "+item.getTotalFat(IngredientType.MEAT)+"g\n");
			mybuilder.append("Vegetable (sodium): "+item.getTotalSodium(IngredientType.VEGETABLE)+"g\n");
			mybuilder.append("\n");	}
		
		mybuilder.append(factory.getAddress());
			
			
		
		
		return mybuilder.toString();

		
	}
}
