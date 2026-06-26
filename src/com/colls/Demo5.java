package com.colls;

import java.util.LinkedHashSet;

public class Demo5 {
public static void main(String[] args) {
	
	LinkedHashSet<Integer> hs= new LinkedHashSet();
	
	for(int i=0;i<=10;i++)
	{
		hs.add(i);
	}
	hs.add(-8);
	hs.add(2);
	hs.add(5);
	hs.add(-3);
	hs.add(10);
	
	System.out.println(hs);
	
	
}
}
