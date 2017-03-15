package com.ittraining.practise.viveksir;

public class Test {
	// public Test(String string){
	// return;
	// }
	public static void main(String[] args) {
		// System.out.println("Enter a string");
		// String a=null;
		// for (int i = 0; i < args.length; i++) {
		// System.out.println(args[i]);
		// System.out.println(args[1]);
		// System.out.println(args[2]);
		// System.out.println(args[3]);
		// System.out.println(args[4]);

		System.out.println(printWordsInNextLine(args));

	}

	static String printWordsInNextLine(String[] givensentence) {
		String words = null;
		for (int i=0;i<givensentence.length;i++) {
			words = givensentence[i];
		}
		return words;
	}
}
