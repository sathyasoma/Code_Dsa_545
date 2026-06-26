package com.colls;

import java.util.LinkedList;

public class Demo2 {
public static void main(String[] args) {
	
	LinkedList li= new LinkedList();
	li.add(35);
	li.add(null);
	li.add("keerthi");
	li.add("suresh");
	li.add(638.93);
	li.add(true);
	li.add(44);
	
	System.out.println(li);
	System.out.println(li.contains("suresh"));
	System.out.println(li.get(4));
	System.out.println(li.getFirst());
	System.out.println(li.getLast());
	System.out.println(li.isEmpty());
	
}
}
