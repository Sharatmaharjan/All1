package com.ittraining.practise.viveksir;

public class FirstClassTest {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, -30, 40, 50, 60 };
		// int[] numbers1={10,20,30,-10,50,60};
		// int[] numbers2={-10,-20,-30,-40,-50,-60};
		int sum = sum(numbers);
		System.out.println("Sum of numbers is : " + sum);

		int diff = difference(numbers);
		System.out.println("Difference of numbers is " + diff);

		int countnegative = numberOfNegativeNumbers(numbers);
		if (countnegative == 0) {
			System.out.println("Sorry no negative number/s found");
		} else {
			System.out.println("Number of negative number/s is : " + countnegative);
		}

		int countpositive = numberOfPositiveNumbers(numbers);
		if (countpositive == 0) {
			System.out.println("Sorry no positive number/s found");
		} else {
			System.out.println("Number of positive number/s is : " + countpositive);
		}

		boolean negativenumber = hasNegativeNumbers(numbers);
		System.out.println(negativenumber);

	}

	static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	static int difference(int[] numbers) {
		int diff = 0;
		for (int number : numbers) {
			diff -= number;
		}
		return diff;
	}

	static int numberOfNegativeNumbers(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (number < 0) {
				count++;
			}
		}
		return count;
	}

	static int numberOfPositiveNumbers(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (number > 0) {
				count++;
			}
		}
		return count;
	}

	static boolean hasNegativeNumbers(int[] numbers) {
		for (int number : numbers) {
			if (number < 0) {
				return true;
			}
		}
		return false;
	}

	// static int reverseOrder(int[] numbers){
	//
	// for(int i=0;i<numbers.length;i++){
	//
	//
	// }
	//
	// }
}