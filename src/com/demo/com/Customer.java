package com.demo.com;

public class Customer {

	public  Customer() {
		System.out.println("just started sleeping..");
	}
	public Customer(double age)
	{
		System.out.println("my age is :"+age);
	}
	public Customer(double age,String name)
	{
		System.out.println("my age is :"+age);
		System.out.println("my age is :"+name);
	}
	public static void main(String[] args) {

		Customer custo= new Customer();
		Customer custo1= new Customer(45,null);
		
		
	}
}
