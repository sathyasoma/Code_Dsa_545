package com.d.arrays;

import java.util.Arrays;

public class INsertPosEle {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 3, 9, 2, 47 };
		int position = 3;
		int elemnt = 88;		
		//creaeting new array to insert new elemnt
		int newArr[]= new int[arr.length+1];	
		//insert the values upto position
		for(int i=0;i<position;i++)
		{
			newArr[i]=arr[i];
		}
		//insert element at specific position
		newArr[position]=elemnt;
		//insert remaing values inside new array
		for(int i=position;i<arr.length;i++)
		{
			newArr[i+1]=arr[i];
		}		
		System.out.println("old array :"+Arrays.toString(arr));
		System.out.println("new array :"+Arrays.toString(newArr));
	}
}
