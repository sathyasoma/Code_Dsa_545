package com.demo.methods;

public class MethodsDemo {

	// 1.method without returnType without paramters

	public  void display() {
		System.out.println("i am display");
	}

	// 2.method without returnType with paramters
	public void Sleeping(int time) {
		System.out.println("sleeping :" + time);
	}
	// 3.method with return type with paramters

	public double sum(int a, int b) {
		return a + b;
	}
  
	public String chat()
	{
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
		
		return "success";
		
	}
	
	public String toString()
	{
		return "we are watching web seriese last benches";
	}
	public static void main(String[] args) {

		MethodsDemo md = new MethodsDemo();
		md.display();
		md.Sleeping(56);
		System.out.println(md.sum(23, 23));
        System.out.println(md.chat());
       
        System.out.println(md);
        System.out.println(md.toString());
	}

}
