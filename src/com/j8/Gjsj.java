package com.j8;

interface Left{
	
	default void m1()
	{
		System.out.println("left default interface ethod");
	}	
}
interface Right{
	
	default void m1()
	{
		System.out.println("right default interface ethod");
	}
}
public class Gjsj implements Right,Left{
	
	public void m1()
	{
		System.out.println("overriden of m1 method");
		Left.super.m1();
		Right.super.m1();
	}
	
public static void main(String[] args) {
	
	Gjsj gg= new Gjsj();
	gg.m1();
}
}
