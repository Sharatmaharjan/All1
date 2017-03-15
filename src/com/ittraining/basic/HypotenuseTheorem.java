package com.ittraining.basic;

public class HypotenuseTheorem {
	public static int x, y, z;
	public static double a;
	public static double b;
	//long o=999999999999999999L;

	public static void main(String[] args) {
		giveValue();
	}

	static void giveValue() {
		// double hyp=h;
		int count = 0;

		for (int i = 1; i < 50; i++) {
			for (int j = 1; j < 50; j++) {
				for (int k = 1; k < 50; k++) {
					a = Math.pow(i, 2);
					b = Math.pow(j, 2) + Math.pow(k, 2);
					if (a == b) {
						x = i;
						y = j;
						z = k;
						count++;
					}
					// else{
					// System.out.println("no value found.");
					// }
				}
			}
		}
		if (count==0) {
			System.out.println("No solutions found.");
		} else {
			System.out.println("Number of solutions are : " + count + " And one of them is given below : ");
			System.out.println("Value of h : " + x);
			System.out.println("Value of p : " + y);
			System.out.println("Value of b : " + z);
			// System.out.println("hey");
		}
		//System.out.println("hey");
	}

}
