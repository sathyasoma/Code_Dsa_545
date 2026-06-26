package com.dt;

public class Demo {

	int age = 91; // non static variable
	static String schoolName = "shs";

	public static void main(String[] args) {

		int age = 90;
		System.out.println("my age is " + age);
		
		System.out.println("my schoolName :"+Demo.schoolName);
		
		Demo d= new Demo();
		System.out.println("my global age is :"+d.age);

	}
}
