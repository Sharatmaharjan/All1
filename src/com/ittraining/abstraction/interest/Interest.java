package com.ittraining.abstraction.interest;

public abstract class Interest {
	double i;
	double p=100;
	double t=1;
	
	void process(){
		calculate();
		display();
	}
	abstract double getRateofinterest();
	void calculate(){
		i=(p*t*getRateofinterest())/100;
	} 
	void display(){
		System.out.println("Your interest amount is : "+i);
	}
}
