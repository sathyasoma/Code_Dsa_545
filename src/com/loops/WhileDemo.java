package com.loops;

import java.util.Scanner;

//check current user password
public class WhileDemo {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	String password="";
	while(!password.equals("keerthi"))
	{
		System.out.println("Enter password");
		password=sc.nextLine();
	}
	System.out.println("login success");
}
}
