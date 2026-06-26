package com.j8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyCompartor{
    
	public static void main(String[] args) {
				
		ArrayList<Integer> al= new ArrayList<>();
		al.add(56);
		al.add(38);
		al.add(17);
		al.add(49);
		al.add(73);
		al.add(17);
		al.add(39);
		al.add(56);
		al.add(47);
		
		System.out.println(al);
//		Collections.sort(al, new MyCompartor());
//		System.out.println(al);
		Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		Collections.sort(al,c);
		System.out.println(al);
	}
}
