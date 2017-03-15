package com.project.detailofstudents.encapsulation;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of student : "); //check conditions like must starts with cl and mustnot contain integer
		StudentDetails student1=new StudentDetails();	//same process for student2,3,4. .. how to use loop in this step ?
		student1.setName(scanner.nextLine());
		
		System.out.println("Enter address of student : ");
		student1.setAddress(scanner.nextLine());
		
		System.out.println("Enter age of student : ");
		student1.setAge(Integer.valueOf(scanner.nextLine()));
		
		System.out.println("Enter roll of student : ");
		student1.setRoll(Integer.valueOf(scanner.nextLine()));
		//clrscr();
		
		System.out.println("Details of a student is : ");
		System.out.println("Roll : "+student1.getRoll());
		System.out.println("Name : "+student1.getName());
		System.out.println("Address : "+student1.getAddress());
		System.out.println("Age : "+student1.getAge());
		
		
		
		
	}
		
		
	}


