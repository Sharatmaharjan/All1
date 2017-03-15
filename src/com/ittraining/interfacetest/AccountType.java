package com.ittraining.interfacetest;

public class AccountType extends Bank {

	@Override
	double getRateofinterest() {
		return 0;
	}

}

class General extends AccountType{
	@Override
	double getRateofinterest() {
		return 2;
	} 
}

class Special extends AccountType{
	@Override
	double getRateofinterest() {
		return 3;
	}
}
