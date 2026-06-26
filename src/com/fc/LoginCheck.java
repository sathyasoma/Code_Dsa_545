package com.fc;

import java.util.Scanner;

public class LoginCheck {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter username");
	String username=sc.next();
	System.out.println("Enter password");
	String pwd=sc.next();
	
	if(username.equals("keerthi") && pwd.equals("keerthi123"))
	{
		System.out.println("login successs");
	}
	else {
		System.out.println("OOPPSSSS....LOGIN DENIED...");
	}
}
}
