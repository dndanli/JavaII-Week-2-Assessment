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
 * determineOrderBeingPrepared()
 * displayOrderDetails()
 */
public class FoodDeliveryTest2 {

	
	FoodDelivery order = new FoodDelivery("Red Velvet Cake", 5, 12.95, 7);
	FoodDeliveryLogic foodDLogic = new FoodDeliveryLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tests when an order is not being prepared
	 * Passes when null is returned 
	 */
	@Test
	public void testDetermineOrderNotBeingPrepared() {
		assertNull(foodDLogic.determineOrderBeingPrepared(order, false));
	}
	
	
	/**
	 * Tests when an order is being prepared
	 * Passes when details of order are returned 
	 */
	@Test
	public void testDetermineOrderBeingPrepared() {
		assertNotNull(foodDLogic.determineOrderBeingPrepared(order, true));	
	}
	
	/**
	 * Tests if the order details are displayed
	 * Passes if it returns the oder details
	 */
	@Test
	public void testDisplayOrderDetails() {
		
		String orderDetails = "Oder details" + "| \n" + "Food Ordered : " + order.getTypeOfFood() + "\n" +
					
							"Quantity: " + order.getQuantity() + "\n" +	"Order Total: "+ order.getOrderTotal(); 
		
		assertEquals(orderDetails, foodDLogic.displayOrderDetails(order, true));
	}
	
	/**
	 * Tests if the order details are displayed
	 * Passes if it returns the oder details
	 */
	@Test
	public void testDisplayOrderDetailsProcessing() {
	
		assertEquals("Processing payment ...", foodDLogic.displayOrderDetails(order, false));
	}
	
	

}
