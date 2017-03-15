package com.ittraining.practise.viveksir;

public class FinalTest {

	public static void main(String[] args) {
		int[] numbers = { 10, -20, 30 };
		// int sum = sum(numbers);
		// System.out.println(sum);
		boolean negative = hasNegativeNumbers(numbers);
		System.out.println(negative);
		int counts=countNegativeNumbers(numbers);
		if(counts==0){
			System.out.println("sorry no negative found.");
		}
		else{
			System.out.println("no of negative numbers is : " +counts);
		}
		
	}

	// static void reverseLine
	// static void printAllindiffline
	static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;

		}
		return sum;
	}

	static boolean hasNegativeNumbers(int[] numbers) {
		for (int number : numbers) {
			if (number < 0) {
				return true;
			}

		}
		return false;
	}

	static int countNegativeNumbers(int[] numbers){
		int count=0;
		for(int number:numbers){
			if(number<0){
				count++;
			}
		}
		return count;
		
	}
}
