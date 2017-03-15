package com.project.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Restauranet {
	Scanner scanner=new Scanner(System.in);
	String name;
	static List<Food> items = new ArrayList<>();
	
	static {
		setMenu();
	}
	
	public static void displayWelcomeMessage(){
		System.out.println("Welcome to our X restaurant.");
		System.out.println("Choose your table and enter table number and please be sitted.");
	}
	
	
	static void setMenu(){
		Food chowmin = new Food();
		chowmin.setData("chowmin",100);
		items.add(chowmin);
	}
	
	public static void displayItems(){
		Iterator<Food> itr = items.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void sayGoodBye(){
		System.out.println("***********Thank you for coming *************8");
	}
}
