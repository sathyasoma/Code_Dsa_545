package com.colls;

import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		
		//ArrayList al= new ArrayList();
		//LinkedList al= new LinkedList();
		Vector al= new Vector();
		//Stack al= new Stack();
		
		System.out.println("initilial size :"+al.size());
		System.out.println("initial capcity :"+al.capacity());
		al.add(34);
		al.add(92);
		al.add(null);
		al.add("soma");
		al.add(true);
		al.add("devasena");
		al.add("shivagami");
		al.add("soma");	
		al.add("kattapa");
		al.add("kalakeya");
		al.add("kuntala"); //11th value
		System.out.println("final size :"+al.size());
		System.out.println("final capcity :"+al.capacity());
		System.out.println(al);
		
	
	}
}
