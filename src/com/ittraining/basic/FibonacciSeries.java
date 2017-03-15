package com.ittraining.basic;

public class FibonacciSeries {
	public static void main(String[] args) {
		 int numberOfTermsInFS = Integer.valueOf(args[0]);
		GenerateFibonacciSeries(numberOfTermsInFS);
	}

	static void GenerateFibonacciSeries(int num) {
		int a = 0, b = 1, c;
		System.out.print(0+" "+1+" ");
		for (int i = 0; i < num-2; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
