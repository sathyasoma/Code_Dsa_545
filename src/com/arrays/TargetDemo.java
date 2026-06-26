package com.arrays;

public class TargetDemo {
public static void main(String[] args) {
	
	int arr[]= {10,30,40,50,60,70};
	int target=40;
	boolean found=false;
	for(int num:arr)
	{
		if(num==target)
		{
			found=true;
			break;
		}
	}	
	System.out.println(found ? " found ":"not found");
}
}
