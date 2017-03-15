package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SimpleArrayList {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		List<Integer> numbers=new ArrayList<>();
		List<Double> numbersInPoint=new ArrayList<>();
		names.add("Sharat");
		names.add("Rupesh");
		names.add("Deepika");
		names.add("Vivek-sir");
		names.add("Rupal-dai");
		Collections.sort(names);
		for(int i=1;i<=10;i++){
		numbers.add(i);
		}
		for(int i=1;i<=10;i++){
			numbersInPoint.add(i+.1);
			}
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		Iterator<Integer> itr1=numbers.iterator();
		while(itr1.hasNext()){
			System.out.print(itr1.next()+" ");
		}
		Iterator<Double> itr2=numbersInPoint.iterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next()+" ");
		}
	}

}
