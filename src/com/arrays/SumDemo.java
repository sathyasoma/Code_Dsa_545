package com.arrays;

public class SumDemo {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6};
	int sum=0;
	
	for(int num:arr)
	{
		sum=sum+num;
	}
	
	double avg=sum/arr.length;
	System.out.println("avg is :"+avg);
	System.out.println("sum is :"+sum);
}
}
