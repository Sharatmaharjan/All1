package com.project.restaurant;

public class Food {
	private String name;
	private int price,qty = 1;
	
	public void setData(String name, int price){
		this.name=name;
		this.price=price;
		
	}
	public String toString(){
		return "Name of food:"+name+" Price:"+price+" Quantity:"+qty;
	}
	public int getPrice() {
		return price;
	}
	

	
}
