package com.ittraining.learn.polymorphism;

public class Student1 {
	int a;
	String n;

	public Student1(int id, String name) {
		a = id;
		n = name;
	}

	void display() {

		System.out.println("Student's ID and name is :" + a + "" + n);
	}
}

class New extends Student1 {
	// public Student1(){}
	public Student1(int id1, String name1) {
		super.a = id;
		super.n = name;
	}

	void display() {

		System.out.println("Student's ID and name is :" + super.a + "" + super.n);
	}
}

class StudentTest {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Sharat");
		s1.display();

	}

}