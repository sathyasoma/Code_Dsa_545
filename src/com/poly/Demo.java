package com.poly;

public class Demo {
	
	public void addition(int a,int b,int c)
	{
		System.out.println("addition of 3 interge values :"+(a+b+c));
	}
	public void addition(int a,int b)
	{
		System.out.println("addition of 2 integer values :"+(a+b));
	}
	public void addition(float a,float b)
	{
		System.out.println("addition of 2 float value:"+(a+b));
	}
	public void addition(int a,float b)
	{
		System.out.println("addition of int,float values :"+(a+b));
	}
	public void addition(float a,int b)
	{
		System.out.println("addition of float,int values :"+(a+b));
	}
public static void main(String[] args) {
	
	Demo d= new Demo();
	d.addition(12, 67);
	d.addition(12,34,10);
	d.addition(12, 78.89f);
	d.addition('a', 'a');//type promotion
	
	
}
}
