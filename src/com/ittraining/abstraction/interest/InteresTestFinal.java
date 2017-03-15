package com.ittraining.abstraction.interest;

public class InteresTestFinal {

	public static void main(String args[]) {
		
		Interest interest = null ;

//		InterestTest i1 = new Nabil();
//		InterestTest i2 = new Sunrise();
//		InterestTest i3 = new Axis();

		if (args[0].equalsIgnoreCase("nabil")) {
			interest = new Nabil();
		
		} else if (args[0].equalsIgnoreCase("sunrise")) {
			interest=new Sunrise();
			
		} else {
			
		}
		interest.calculate();
		interest.display();
	}
}
