package com.arraylist;

public class Students {
	private String name;
	private String address;
	public Students(String name,String address){
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString(){
		return "Name : "+name+" Address : "+address;
	}
}
