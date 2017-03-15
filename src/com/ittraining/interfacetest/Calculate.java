package com.ittraining.interfacetest;

public interface Calculate {
	void calc();
}

interface Display extends Calculate {
	void display();
}

abstract class Bank implements Display {
	double i;
	double p = 100;
	double t = 1;

	abstract double getRateofinterest();

	@Override
	public void calc() {
		i = (p * t * getRateofinterest()) / 100;

	}

	@Override
	public void display() {
System.out.println("Interest amt is : "+i);
	}


}