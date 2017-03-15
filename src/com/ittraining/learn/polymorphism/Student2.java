package com.ittraining.learn.polymorphism;

public class Student2 {
	int id = 0;
	String name = null;
	String address = null;
	String phone = null;

	public Student2(int id, String name, String address, String phone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;

	}

	void display() {
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Address :" + address);
		System.out.println("Phone :" + phone);
	}

}

class One extends Student2 {

	public One(int id, String name, String address, String phone) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
		// super.id=id;
		// super.name=name;
		// super.address=address;
		// super.phone=phone;
	}

	void display() {
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Address :" + address);
		System.out.println("Phone :" + phone);
	}

}

class Two extends Student2 {

	public Two(int id, String name, String address, String phone) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
		// super.id=id;
		// super.name=name;
		// super.address=address;
		// super.phone=phone;
	}

	void display() {
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Address :" + address);
		System.out.println("Phone :" + phone);
	}

}

class StudentTest2 {
	public static void main(String[] args){
		Student2 s1=new Student2(0, null, null, null);
		Student2 s2=new One(1, "Sharat", "Swoyambhu", "9849606221");
		Student2 s3=new Two(2, "Keshav", "Pepsicola", "9849234231");
		s1.display();
		s2.display();
		s3.display();
		
	}
}