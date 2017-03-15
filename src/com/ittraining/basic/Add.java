package com.ittraining.basic;

public class Add {
	int a, b;

	void sum(int x, int y) {
		a = x;
		b = y;
		int result = a + b;
		System.out.println("sum is " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		add.sum(3, 5);
	}

}
