package com.project.restaurant;

import java.util.List;

public class Cook {
	private final static String name = "Ram";
	
	public static boolean prepare(List<Food> items){
		System.out.println(" Items being prepared ::"+items);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
			
		}
		System.out.println("Yes items ready");
		return true;
	}

	private void makeChowmein() {
		System.out.println("Please wait for a while your chowmein is being prepared by our cook " + name);
	}

	private void makeMomo() {
		System.out.println("Please wait for a while your momo is being prepared by our cook " + name);
	}

	
}
