package com.coffeeShop;

public class Cappuccino implements CoffeeImp{
	private static final Double CAPPUCCINO_PRICE = 4.5;
	private static final String CAPPUCCINO_NAME = "CAPPUCCINO";
	@Override
	public double calculatePrice(int quantity) {
		// TODO Auto-generated method stub
		return quantity * this.CAPPUCCINO_PRICE;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.CAPPUCCINO_NAME;
	}
}
