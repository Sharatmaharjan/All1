package com.ittraining.electricitybill.practisejavatpointfactorypattern;

public abstract class Plan {
	protected double rate;

	abstract void getRate();

	void calc(double units) {
		System.out.println("Total amount to be paid is " + rate * units);
	}

}
