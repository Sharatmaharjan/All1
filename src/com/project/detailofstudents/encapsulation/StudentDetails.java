package com.project.detailofstudents.encapsulation;

public class StudentDetails {
	private String name,address;
	private int age;
	private static int roll;
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected static int getRoll() {
		return roll;
	}
	protected static void setRoll(int roll) {
		StudentDetails.roll = roll;
	}
	

}
