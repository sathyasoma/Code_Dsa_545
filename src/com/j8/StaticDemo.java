package com.j8;


interface StactiInt{
	
	public static void sleep() {
		System.out.println("sleeping in the class cant by money...");
	}	
}
public class StaticDemo implements StactiInt {

	public static void main(String[] args) {
		
		StactiInt.sleep();
	}
}
