package com.ittraining.bankcreditcard.customer;

public class AdapterPattern {

	public static void main(String[] args) {
		CreditCard targetInterface=new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.println(targetInterface.getCreditCard());
	}

}
