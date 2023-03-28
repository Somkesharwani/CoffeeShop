package com.coffeeShop;

public class Coffee implements CoffeeImp {
	
	private static final double COFFEE_PRICE = 2.50;
	private static final String COFFEE_NAME = "Coffe";
	

	@Override
	public double calculatePrice(int quantity) {
		// TODO Auto-generated method stub
		return quantity * this.COFFEE_PRICE;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.COFFEE_NAME;
	}

}
