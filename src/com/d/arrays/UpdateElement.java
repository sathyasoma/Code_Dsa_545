package com.d.arrays;

import java.util.Arrays;

public class UpdateElement {

	public static void updateElement(int arr[],int size,int position,int newVal)
	{
		if(position<0 || position>=size)
		{
			System.out.println("invalid positions");
		}
		else
		{
			arr[position]=newVal;
			System.out.println("updated data :"+position+" "+newVal);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,3,9};		
		UpdateElement.updateElement(arr, arr.length, 3, 77);
		System.out.println(Arrays.toString(arr));
		
	}
}
