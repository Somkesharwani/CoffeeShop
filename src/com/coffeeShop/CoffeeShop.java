package com.coffeeShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	
	private static ArrayList<CoffeeImp> coffee;

	private static CoffeeShop instance = null;
	
	static {
		coffee = new ArrayList<CoffeeImp>();
		coffee.add(new Cappuccino());
		coffee.add(new Coffee());
		coffee.add(new Espresso());
		coffee.add(new Latte());
	}
	
	private CoffeeShop() {
		
	}
	
	public List<CoffeeImp> getCoffee() {
		return coffee;
	}

	public synchronized static CoffeeShop getInstance() {
		
		if (instance == null) {
			instance = new CoffeeShop();
		}
		
		return instance;
	}
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Coffee Shop!\n");

	        double totalPrice = 0.0;
	        
	        for(CoffeeImp coffee : CoffeeShop.getInstance().getCoffee()) {
	        	System.out.printf("How many %s would you like to order? ", coffee.getName());
	            int quantity = scanner.nextInt();
	            totalPrice += coffee.calculatePrice(quantity);
	        }
	        
	        
	        System.out.printf("\nYour total comes to: $%.2f\n", totalPrice);
	    }
}
