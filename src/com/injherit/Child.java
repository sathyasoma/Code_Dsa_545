package com.injherit;

class GrandParent{
	
	public void tales()
	{
		System.out.println("we used to tell stories...");
	}
	
}
class Parent extends GrandParent {
	
	public void house()
	{
		System.out.println("we have 2bhk house");
	}
	public void property()
	{
		System.out.println("we haev 1000 crores property");
	}
}
public class Child extends Parent {
 
	public void roaming()
	{
		System.out.println("always chilling...");
	}
	public static void main(String[] args) {
		
		Child ch= new Child();
		ch.roaming();
		ch.house();
		ch.property();
		ch.tales();
	}
}
