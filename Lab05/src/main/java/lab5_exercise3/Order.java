package lab5_exercise3;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private List<Pizza> pizzas;
	private Customer customer;
	
	public Order(Customer customer) {
		this.customer=customer;
		this.pizzas = new ArrayList<Pizza>();
		
		
	}
	
	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	
	public double calculateTotal() {
		double sum=0;
		for(int i=0;i<this.pizzas.size();i++) {
			sum+=this.pizzas.get(i).calculateCost();  }
		
		return sum;
	}
	public String printReceipt() {
		return ("Customer: "+this.customer.getName()+". "+this.customer.getSurname()+"\nNumber of Pizzas: "+this.pizzas.size()+"\nTotal Cost: "+this.calculateTotal());
	}
	
	

}
