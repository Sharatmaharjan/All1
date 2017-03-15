package com.project.listofstudents.list;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//StudentsDetails sd = new StudentsDetails();
		
			System.out.println("Enter name address age and roll and press A.");
			String[] detail = scanner.nextLine().split(""); // detail0 must
			StudentsDetails studentdetail = new StudentsDetails();
			studentdetail.addAll(detail[0], detail[1], Integer.valueOf(detail[2]), Integer.valueOf(detail[3]));	// starts with
															

//			sd.setName(detail[0]);
//			sd.setAddress(detail[1]);
//			sd.setAge(Integer.valueOf(detail[2]));
//			sd.setRoll(Integer.valueOf(detail[3]));
			// System.out.println("Name : "+detail[0]+" Address : "+detail[1]+"
			// Age : "+detail[2]+" Roll : "+detail[3]);
			
		
	}

}
