package com.ittraining.electricitybill.practisejavatpointfactorypattern;

public class GenerateBill {
	public static void main(String[] args) {
		Plan p = null;
		//System.out.println("Enter your plan and units consumed : ");
		if (args[0].equalsIgnoreCase("domesticplan")) {
			p = new DomesticPlan();
		} else if (args[0].equalsIgnoreCase("commercialplan")) {
			p = new CommercialPlan();
		} else if (args[0].equalsIgnoreCase("instituteplan")) {
			p = new InstitutePlan();
		}
		else{
			System.out.println("please enter correctly");
		}
		double a= Double.valueOf(args[1]);
	
		p.getRate();
		p.calc(a); 	//how to input units consumed and then display
	}
}
