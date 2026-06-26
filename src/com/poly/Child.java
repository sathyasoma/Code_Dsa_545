package com.poly;

class Mother{
	
	public void eat() {
		System.out.println("dont eat chklt already sufferung with fvr");
	}
}
public class Child extends Mother {

	@Override
	public void eat()
	{
		System.out.println("npoo..noo...i want it other wise claen started");
	}
	public static void main(String[] args) {
		
		Mother m= new Child();
		m.eat();
		
	}
}
