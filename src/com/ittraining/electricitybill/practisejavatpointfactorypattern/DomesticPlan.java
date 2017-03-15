package com.ittraining.electricitybill.practisejavatpointfactorypattern;

class DomesticPlan extends Plan {

	@Override
	void getRate() {
		rate = 10;
	}

}

class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 15;
	}
}

class InstitutePlan extends Plan {

	@Override
	void getRate() {
		rate = 20;
	}

}
