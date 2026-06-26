package com.j8;

interface Interf{
	
	public void display();
}
//class ImplClass implements Interf{
//
//	@Override
//	public void display() {
//		System.out.println("welcome to last bench world");	
//	}
//}
public class Demo2 {

	public static void main(String[] args) {
		
//		ImplClass imp= new  ImplClass();
//		imp.display();
		
		Interf i= ()->{System.out.println("welcome to sleeping world");};
		i.display();
	}
}
