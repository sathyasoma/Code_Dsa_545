package com.poly;

 class ParentFinal{
	
 	int age=88;	
	public  void getAge(int age)
	{
		this.age=++age;
		System.out.println("parent age is :"+this.age);
	}
}
public class ChildFinal extends ParentFinal {

	@Override
	public void getAge(int age)
	{
		this.age=--age;
		System.out.println("child age is :"+this.age);
	}
	public static void main(String[] args) {
		
		ChildFinal cf= new ChildFinal();
		cf.getAge(77); //77 78 76 87 88 89 na re eo ce
	}
}
