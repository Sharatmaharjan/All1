package com.project.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RestaurantDemo {
	private static int num;

	public static void main(String[] args) {

		Restauranet.displayWelcomeMessage();

		Restauranet.displayItems();

		Order order = Waiter.getOrder();

		boolean isPrepared = Cook.prepare(order.getItems());

		if (isPrepared) {
			Waiter.serve(order);
			Counter.pay(order);
		}
		
		Restauranet.sayGoodBye();

	}

}
