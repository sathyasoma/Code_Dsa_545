package com.demo.com;

public class Employee {

	int empid;
	String empname;
	
	public Employee() {
      empid=788;
      empname="suresh";
	}
	public void display()
	{
		System.out.println(empid+"  "+empname);
	}
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.display();
	}
}
