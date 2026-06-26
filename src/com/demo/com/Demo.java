package com.demo.com;

public class Demo {

	static {
		System.out.println("static block 1");
	}
	{
		System.out.println("instance block 2");
	}
	public Demo() {

		System.out.println("heyyyy....dont miss me....4");
	}
	static {
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		{
			System.out.println("normal block 2");
		}
		System.out.println("main method 3");
		Demo d = new Demo();
		Demo d1 = new Demo();
		{
			System.out.println("hey...wait i am also there...5");
		}
	}
	{
		System.out.println("not me....crying..6");
	}
}
