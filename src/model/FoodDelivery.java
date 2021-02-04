/**
 * @author Daniel de Lima - dcdelima
 * CIS 175 - Spring 2021
 * Feb 4, 2021
 */
package model;

/**
 * This class represents the details of a Food delivery order application
 */
public class FoodDelivery {
	

	// represents food quantity
	private int quantity;
	
	// represents the final price of the order
	private double orderTotal;
	
	// represents the price of the food ordered
	private double priceOfFood;

	// tax rate percentage to be charged
	private double salesTax;
	
	//represents the type of food ordered
	private String typeOfFood;
	
	// represents the total times a customer has ordered in a restaurant
	private int timesAlreadyOrderd;
	
	
	// default constructor
	public FoodDelivery() {}

	// parametized constructor
	public FoodDelivery(String typeOfFood, int quantity, double priceOfFood, int timesAlreadyOrderd) {
		super();
		this.typeOfFood = typeOfFood;
		this.quantity = quantity;
		this.priceOfFood = priceOfFood;
		this.timesAlreadyOrderd = timesAlreadyOrderd;
	}

	// getters and setters

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getOrderTotal() {
		return orderTotal;
	}


	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}


	public double getPriceOfFood() {
		return priceOfFood;
	}


	public void setPriceOfFood(int priceOfFood) {
		this.priceOfFood = priceOfFood;
	}


	public double getSalesTax() {
		return salesTax;
	}


	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}


	public String getTypeOfFood() {
		return typeOfFood;
	}


	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}


	public int getTimesAlreadyOrderd() {
		return timesAlreadyOrderd;
	}


	public void setTimesAlreadyOrderd(int timesAlreadyOrderd) {
		this.timesAlreadyOrderd = timesAlreadyOrderd;
	}

	
	@Override
	public String toString() {
		return "FoodDelivery [quantity=" + quantity + ", orderTotal=" + orderTotal + ", priceOfFood=" + priceOfFood
				+ ", salesTax=" + salesTax + ", typeOfFood=" + typeOfFood + ", timesAlreadyOrderd=" + timesAlreadyOrderd
				+ "]";
	}
	
	
}
