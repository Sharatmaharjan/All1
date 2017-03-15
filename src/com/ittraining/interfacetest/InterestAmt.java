package com.ittraining.interfacetest;

public class InterestAmt {

	public static void main(String[] args) {
		
		Bank b = new AccountType();
		b.calc();
		
		AccountType g=new General();
		AccountType s=new Special();
		if(args[0].equalsIgnoreCase("general")){
			g.getRateofinterest();
		}
		if(args[0].equalsIgnoreCase("special")){
			s.getRateofinterest();
		}
	b.display();
	}

}
