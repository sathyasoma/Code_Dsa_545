package com.kw;

class SuperCon{
	
	public SuperCon() {
		this(34);
         System.out.println("i am parent class default constructor");
	}
	public SuperCon(int age)
	{
		this.m1();
		System.out.println("i am parent param con :"+age);
	}
	public void m1()
	{
		System.out.println("i am parent class m1 method");
	}
}
public class ThisCon extends SuperCon{
   
	public ThisCon() {
		//super();
		this(67);
      System.out.println("i am child default constructor");
	}
	public ThisCon(int age)
	{
		this.m1();
		System.out.println("child of param :"+age);
	}
	public void m1()
	{
		System.out.println("child class m1 method");
	}
	public static void main(String[] args) {		
		ThisCon tc= new ThisCon();
	}
}
