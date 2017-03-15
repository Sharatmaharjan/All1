package com.ittraining.abstraction.interest;

public class InterestTest extends Interest {

	@Override
	double getRateofinterest() {
		return 10;
	}
}

class Nabil extends InterestTest{
	@Override
	double getRateofinterest(){
		return 15;
		
	}
}

class Sunrise extends InterestTest{
	double getRateofinterest(){
		return 6;
		
	}
}

class Axis extends InterestTest{
	double getRateofinterest(){
		return 7;
		
	}
}