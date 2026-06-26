package com.arrays;

public class Demo2 {
public static void main(String[] args) {
	
	String name[]= {"bahibali","devasena","kattappa","kalakeya","rajamatha"};
	

	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	System.out.println(name[4]);
	
	System.out.println("-------------------------");
	for(int i=0;i<5;i++)
	{
		System.out.print(name[i]+" ");
	}
	System.out.println("-------------------");
	for(int i=0;i<name.length;i++)
	{
		System.out.print(name[i]+" ");
	}
	
	System.out.println("---------------------");
	
	for(String str:name)
	{
		System.out.print(str+" ");
	}
}
}
