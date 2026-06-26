package com.injherit;

public class Developer  extends Guest{
	
	public void write()
	{
		System.out.println("i can write");
	}
	public static void main(String[] args) {
		Developer d= new Developer();
		d.read();
		d.write();
		
	}
}
