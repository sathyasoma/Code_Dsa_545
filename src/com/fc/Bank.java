package com.fc;

import java.util.Scanner;

public class Bank {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int bal=5000;
	System.out.println("Enter Amount to withdraw...");
	int withdraw=sc.nextInt();
	
	if(withdraw<=bal)
	{
		System.out.println("withdrwan ssucc :"+withdraw);
	}
	else {
		System.out.println("insuffiencent funds");
	}
	
}
}
