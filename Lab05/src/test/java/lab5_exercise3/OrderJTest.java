package lab5_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderJTest {

	Customer customer = new Customer("Joe", "Bloggs");
	Order order = new Order(customer);

	@Test
	public void lab5_testOrder() {
		assertEquals(0, order.calculateTotal(), 0);
	}

	@Test
	public void lab5_testAddPizza() {
		Pizza pizza = new Pizza();
		String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
		pizza.addToppings(toppings);
		order.addPizza(pizza);
		assertEquals(8.99, order.calculateTotal(), 0);

	}

	@Test
	public void lab5_testCalculateTotal() {
		Pizza pizza = new Pizza();
		String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
		pizza.addToppings(toppings);
		
		Pizza pizza2 = new Pizza();
		String[] toppings2 = new String[] { "chicken", "peppers", "tomato" , "corn", "bacon", "chilli" };
		pizza2.addToppings(toppings);
		
		
		order.addPizza(pizza);
		order.addPizza(pizza2);

		assertEquals(17.98, order.calculateTotal(), 0);	
		}

	@Test
	public void lab5_testPrintReceipt() {
		Pizza pizza = new Pizza();
		String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
		pizza.addToppings(toppings);
		
		Pizza pizza2 = new Pizza();
		String[] toppings2 = new String[] { "chicken", "peppers", "tomato" , "corn", "bacon", "chilli" };
		pizza2.addToppings(toppings);
		
		
		order.addPizza(pizza);
		order.addPizza(pizza);

		order.addPizza(pizza2);

		assertEquals("Customer: J. Bloggs\n" + 
				"Number of Pizzas: 3\n" + 
				"Total Cost: 26.97", order.printReceipt());	}

}
