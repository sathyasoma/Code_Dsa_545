package com.d.arrays;

import java.util.Arrays;

public class DeleteElPosi {
public static void main(String[] args) {
	
	int arr[]= {1,0,2,0,3,0,12};
	//int position=4;
	int newArr[]= new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			continue;
		}
		newArr[j]=arr[i];
		j++;
	}
	System.out.println(Arrays.toString(newArr));
}
}
