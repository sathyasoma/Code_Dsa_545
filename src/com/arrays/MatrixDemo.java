package com.arrays;

public class MatrixDemo {
public static void main(String[] args) {
	
	int[][]arr= {{12,89},{56,90,76,89},{12,73}};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
