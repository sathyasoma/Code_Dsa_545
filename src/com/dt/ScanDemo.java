package com.dt;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		String name=sc.nextLine(); //"sathya Prakash"
		
		
		System.out.println("my id  is :"+id);
		System.out.println("my name is :"+name);
		
		//PRINT ALL TYPE OF DATA BY USING SCANNER 
	}
}
