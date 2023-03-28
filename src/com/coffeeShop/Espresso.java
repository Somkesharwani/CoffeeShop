package com.coffeeShop;

public class Espresso implements CoffeeImp{
	private static final double ESPRESSO_PRICE = 3.5;
	private static final String ESPRESSO_NAME = "ESPRESSO";
	@Override
	public double calculatePrice(int quantity) {
		// TODO Auto-generated method stub
		return quantity * this.ESPRESSO_PRICE;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.ESPRESSO_NAME;
	}
	
	
}
