package com.colls;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo4 {
public static void main(String[] args) {
	
	ArrayList<String> al= new ArrayList<String>();
	
	al.add("shivagami");
	al.add("ramesh");
	al.add("suresh");
	al.add("sumo");
	al.add("biryani");
	al.add("cheyaleda");
	al.add("annayya");		
	System.out.println(al);
	
	ListIterator<String> itr=al.listIterator();
	while(itr.hasNext())
	{
		if(itr.next().contains("biryani"))
		{
			itr.set("DUM bIRYANI");;
		}
	}
	
	for(String str:al)
	{
		System.out.println(str);
	}
	
	System.out.println("reverse-----");
	 while(itr.hasPrevious())
	 {
		 System.out.println(itr.previous());
	 }
}
}
