/**
 * @author Daniel de Lima - dcdelima
 * CIS 175 - Spring 2021
 * Feb 4, 2021
 */
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class implements the logic for the Food Delivery class.
 *
 */
public class FoodDeliveryLogic {

	/**
	 * This method calculates the final price of an order based on the subtotal and tax rate
	 * 
	 * @param order represents the order object with order details from Food Delivery class
	 * @return the final order amount
	 */
	public double calculateOrderTotal(FoodDelivery order) {
		// tax rate of 3.4% to be charged
		final double TAX_RATE = 0.034; 
		
		//calculating subtotal
		double subtotal = order.getPriceOfFood() * order.getQuantity();
		
		// final sales tax to be added to total order price
		double salesTax = subtotal * TAX_RATE;
		
		// assigning to object sales tax variable
		order.setSalesTax(salesTax);
		
		// holds the final price of the order before being formated
		double totalToBePaid = subtotal + salesTax;
        BigDecimal bd = new BigDecimal(totalToBePaid).setScale(2, RoundingMode.HALF_UP);
        
        // assigning to object order total variable
        order.setOrderTotal(bd.doubleValue());
		
		return order.getOrderTotal();
	}
	
	/**
	 * This method determines if a customer is frequent
	 * That is if the customer has ordered more than 10 times from the same location(restaurant).
	 * 
	 * @param order represents the order object with order details from Food Delivery class
	 * @return
	 */
	public boolean determineFrequentCustomer(FoodDelivery order) {
		
		// represents how many times a customer has to order to be classified as frequent.
		final int TIMES_ORDERED_FREQUENT = 10;
		
		if(order.getTimesAlreadyOrderd() > TIMES_ORDERED_FREQUENT) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method returns a message if the order is being prepared at the restaurant
	 * Else it returns null to represent that the order is not being prepared at the moment.
	 * 
	 * @param order represents the order object with order details from Food Delivery class
	 * @param customerHasOrdered represents the confirmation when a customer has finished placing their order
	 * 
	 * @return a status message or null for when its still processing.
	 */
	public String determineOrderBeingPrepared(FoodDelivery order, boolean customerHasOrdered) {
		if(customerHasOrdered == true) {
			return "Your order is being prepared...";
		}
		return null;
	}
	
	/**
	 *  This method displays the order details when an order is placed.
	 *  If not, it returns a message warning the user that payment is still being processed. 
	 *  
	 * @param order represents the order object with order details from Food Delivery class
	 * @param orderWasProcessed represents the confirmation when a customer has finished paying for the order
	 * 
	 * @return the order details or a warning message
	 */
	public String displayOrderDetails(FoodDelivery order, boolean orderWasProcessed) {
		if(orderWasProcessed == true) {
			
			return "Oder details" + "| \n" +
			
					"Food Ordered : " + order.getTypeOfFood() + "\n" +
					
					"Quantity: " + order.getQuantity() + "\n" +
					
					"Order Total: "+ order.getOrderTotal(); 
		}else {
			
			return "Processing payment ...";
		}
	}
}
