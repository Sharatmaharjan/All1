package com.ittraining.interfacetest;

public interface Printable {
void print();
}

interface Showable{
	void show();
}

class Aaa implements Printable,Showable{

	@Override
	public void show() {
System.out.println("hello");		
	}

	@Override
	public void print() {
		System.out.println("world");
		}
	public static void main(String[] args){
		Aaa a1=new Aaa();
		a1.show();
		a1.print();
	}
}
