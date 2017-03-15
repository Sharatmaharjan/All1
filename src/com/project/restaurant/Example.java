package com.project.restaurant;

import java.util.Scanner;

public class Example {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()){
			System.out.println("you entered ::"+scan.nextLine());
		}
	}
}
