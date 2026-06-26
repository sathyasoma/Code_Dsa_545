package com.arrays;

public class MaxDemo {
public static void main(String[] args) {
	
	int arr[]= {56,90,18,47,38};	
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	
	System.out.println("max ele :"+max);
	
}
}
