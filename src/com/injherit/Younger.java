package com.injherit;

class Father{
	
	public void meet()
	{
		System.out.println("want");
	}
}
class Elder extends Father{
	
	public void usa()
	{
		System.out.println("want to go for hiegher studies,want to meet dad");
	}
}
public class Younger extends Father{
 
	public void bdy()
	{
		System.out.println("celebtrrate bdy wants to meet dad");
	}
	public static void main(String[] args) {
		
		Younger y= new Younger();
		y.bdy();
		y.meet();
		
		Elder e= new Elder();
		e.usa();
		e.meet();
	}
}
