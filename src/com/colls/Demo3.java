package com.colls;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
	ArrayList al= new ArrayList();
	
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
	
	System.out.println(al);
	
	ArrayList al1= new ArrayList();
	
	al1.add(true);
	al1.add("devasena");
	al1.add("shivagami");
	al1.add("soma");	
	al1.add(78);
	al1.add("mahishmathi");
	
//	al.addAll(al1);
//	System.out.println(al);
//	al.removeAll(al1);
//	System.out.println(al);
	
	al.retainAll(al1);
	System.out.println(al);
}
}