package com.strngs;

public class SbMethods {
public static void main(String[] args) {
	
	StringBuffer sb= new StringBuffer("sathya");
	System.out.println(sb);
	System.out.println(sb.capacity());
	
	StringBuffer sb1= new StringBuffer();
	sb1.ensureCapacity(50);
	System.out.println(sb1.capacity());
	System.out.println(sb.append("suresh"));
	System.out.println(sb.insert(4, "soma"));
	System.out.println(sb.delete(2, 6));
	
}
}
