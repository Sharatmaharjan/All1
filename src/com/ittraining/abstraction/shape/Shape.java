package com.ittraining.abstraction.shape;

public abstract class Shape {
	abstract void run();
}

class Rectangle extends Shape {

	@Override
	void run() {
		System.out.println("Rectangle is being drawn.");
	}

}

class Circle extends Shape {

	@Override
	void run() {
		System.out.println("Circle is being drawn.");
	}
}

class ShapeTest{
	public static void main(String[] args){
		Shape s1=new Rectangle();
		//Shape s2=new Circle();
		s1.run();
		//s2.run();
	}
}