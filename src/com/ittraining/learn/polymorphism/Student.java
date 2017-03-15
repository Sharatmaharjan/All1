package com.ittraining.learn.polymorphism;

public class Student {
	 static int rollno = 0;

	void detail() {
		// how to display name of student
		//displaying unique id of students like 1,2,3...(done)
		System.out.println("Roll no.of student : " + rollno);
	}

}

class Sharat extends Student {

	void detail() {
		rollno+=1;
		System.out.println("Roll no.of student : " + rollno);
	}
}

class Deepika extends Student {

	void detail() {
		rollno++;
		System.out.println("Roll no.of student : " + rollno);
	}
}

class Keshav extends Student {

	void detail() {
		rollno++;
		System.out.println("Roll no.of student : " + rollno);
	}
}

class StudentTest {
	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Sharat();
		s2 = new Deepika();
		s3 = new Keshav();
		s1.detail();
		s2.detail();
		s3.detail();
	}
}