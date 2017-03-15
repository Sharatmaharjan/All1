package com.project.restaurant;

import java.util.List;

public class Waiter {
	
	public static Order getOrder(){
		// Take customro table name
		// Take items
		// Prepare order object
		Customer random = new Customer();
		random.setTableNo(1);
		
		return new Order(Restauranet.items, random);
	}
	
	public static void serve(Order order){
		System.out.println(" I am serving this food");
	}
	
}
