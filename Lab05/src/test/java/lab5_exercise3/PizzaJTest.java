package lab5_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaJTest {

	Pizza pizza = new Pizza();
	@Test
	public void lab5_testPizzaConstruction() {
		assertEquals(0,pizza.calculateCost(),0);
	}

	@Test
	public void lab5_testCalculatePizzaCost() {
		String[] toppings = new String[] {"cheese", "pepperoni", "tomato"};
		pizza.addToppings(toppings);
		assertEquals(8.99,pizza.calculateCost(),0);
	}
	
	@Test
	public void lab5_testPrintPizza() {
		String[] toppings = new String[] {"cheese", "pepperoni", "tomato"};
		pizza.addToppings(toppings);
		assertEquals("cheese,pepperoni,tomato", pizza.printToppings());
	}

}
