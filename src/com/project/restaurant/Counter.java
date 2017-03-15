package com.project.restaurant;

import java.util.List;

public class Counter {
	
	public static double pay(Order order){
		
		return 10000;
	}
	private int priceOfChowmein=100;
	private int priceOfMomo=120;
	
	public void billOfChowmein(){
		System.out.println("Your total amount is : "+priceOfChowmein); //how to access price of chowmein which is in class RestaurantDemo??
		System.out.println("Thank you for visiting and you are always welcome.");
	}
	public void billOfMomo(){
		System.out.println("Your total amount is : "+priceOfMomo);
		System.out.println("Thank you for visiting and you are always welcome.");
	}
}
