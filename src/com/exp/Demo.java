package com.exp;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number..");
	int fnum=sc.nextInt();
	System.out.println("Enter second number..");
	int snum=sc.nextInt();	
	try {
	int result=fnum/snum;
	System.out.println("result is :"+result);
	}
	catch(Exception r)
	{
		System.out.println("dont enter denominator as zero");
	}
	finally {
		System.out.println("always execeddted to close connections");
	}
	System.out.println("remaining 1000 lines of code");
}
}
