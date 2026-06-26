package com.ab;

 abstract class Vechile{
	
	 public Vechile() {
        System.out.println("vechile constrttrt");
	 }
	 
	public abstract void start();
	
	public void stop()
	{
		System.out.println("vechile stopped...");
	}
}

class Car extends Vechile{
	@Override
	public void start() {
		System.out.println("car starterted....");
	}
}
class Bus extends Vechile{

	@Override
	public void start() {
	  System.out.println("bus starteted");	
	}
}
public class MainVech {

	public static void main(String[] args) {
		
		//Vechile vvv= new Vechile();	
		Vechile v;
		v=new Car();
		v.start();
		v.stop();
		System.out.println("-----------");
		v=new Bus();
		v.start();
		v.stop();
	}
}
