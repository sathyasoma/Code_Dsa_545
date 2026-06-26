package com.kw;
class SuperDemo{
	int salary=60000;
	public void getSalary(int salary)
	{
		salary=50000;
		System.out.println("my parent salary :"+salary);
	}
}
public class ThisDemo extends SuperDemo{
	int salary = 30000;
	public void getSalary(int salary) {
		salary = 20000;
		System.out.println("my salary is :" + salary);
		System.out.println("my global salary :"+this.salary);
		//System.out.println(this);
		super.getSalary(40000);
		System.out.println("my parent global salary :"+super.salary);
	}
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.getSalary(10000);
		
	}
}
