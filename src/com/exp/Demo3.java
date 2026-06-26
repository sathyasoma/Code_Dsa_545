package com.exp;

public class Demo3 {
public static void main(String[] args) {
	
	try {
	int arr[]= new int[3];
	arr[2]=90/10;
	}
	catch (ArithmeticException RR) {
       System.out.println("dont enter ");
	}
	catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("array sis out of bound");
	}
	finally {
		System.out.println("always executed");
	}
	System.out.println("REMAING LINES OF CODE");
}
}
