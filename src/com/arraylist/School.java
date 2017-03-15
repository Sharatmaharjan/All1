package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {
	private String name;

	public School(String name) {
		this.name = name;
	}

	List<Students> students = new ArrayList<>();

	public School(Students student) {
		students.add(student);
	}

	public String toString() {
		return "Name of School : " + name;
	}

	public void printAll() {
		Iterator<Students> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
