package com.coffeeShop;

public class Latte implements CoffeeImp{
	private static final Double LATTE_PRICE = 4.0;
	private static final String LATTE_NAME = "LATTE";
	@Override
	public double calculatePrice(int quantity) {
		// TODO Auto-generated method stub
		return quantity * this.LATTE_PRICE;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.LATTE_NAME;
	}
	
	
 
}
