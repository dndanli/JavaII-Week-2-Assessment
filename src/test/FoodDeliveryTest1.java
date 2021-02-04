/**
 * @author Daniel de Lima - dcdelima
 * CIS 175 - Spring 2021
 * Feb 4, 2021
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.FoodDelivery;
import model.FoodDeliveryLogic;

/**
 * Tests the following methods from the  Food Delivery Logic class:
 * 
 * calculateOrderTotal()
 * determineFrequentCustomer()
 */
public class FoodDeliveryTest1 {
	
	// Declaring and instantiating objects
	
	// orderA and orderB represent the orders of two different customers
	// That to test the determineFrequentCustomer method.
	FoodDelivery orderA = new FoodDelivery("Red Velvet Cake", 5, 12.95, 7);
	FoodDelivery orderB = new FoodDelivery("Sushi Roll", 5, 40.95, 11);
	
	FoodDeliveryLogic foodDLogic = new FoodDeliveryLogic();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tests the total price from an order
	 * Passes if the total expected is equals to the total calculated by the method 
	 */
	@Test
	public void testClaculateOrderTotal() {
		assertEquals(66.95, foodDLogic.calculateOrderTotal(orderA), 0.0);
	}
	
	/**
	 * Tests if a customer is not frequent
	 * Passes if the customer has not ordered more than 10 times
	 * 
	 */
	@Test
	public void TestDetermineNotAFrequentCustomer() {
		assertFalse(foodDLogic.determineFrequentCustomer(orderA));
	}
	
	
	/**
	 * Tests if a customer is frequent
	 * Passes if the customer has ordered more than 10 times
	 * 
	 */
	@Test
	public void TestDetermineFrequentCustomer() {
		assertTrue(foodDLogic.determineFrequentCustomer(orderB));
	}
	
}
