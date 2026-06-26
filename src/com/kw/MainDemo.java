package com.kw;

class Employee{
	
	private int empid;
	private String empname;
	private double empsal;
	
	public Employee(int empid,String empname,double empsal) {
        this.empid=empid;
        this.empname=empname;
        this.empsal=empsal;
	}
	
	public void setSalary(double salary)
	{
		if(salary>0)
		{
			this.empsal=empsal;
		}
		else {
			System.out.println("invalid salary");
		}
	}
	
	public double getSalary()
	{
		return empsal;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getEmpName()
	{
		return empname;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee id :"+empid);
		System.out.println("Employee name :"+empname);
		System.out.println("eMPLOYEE SALARY:"+empsal);
	}
}
class Developer extends Employee{
	
	public int projectBonus;
	
	public Developer(int empid,String empname,double empsal,int projectBonus) {
		super(empid,empname,empsal);
		this.projectBonus=projectBonus;
	}
	
	public double calculateSalary()
	{
		return getSalary()+projectBonus;
	}
	
	public void displayDeveloper()
	{
		displayEmployeeDetails();
		System.out.println("project bonus is :"+projectBonus);
		System.out.println("total salry is :"+calculateSalary());
	}
}
class Tester {
	
}
public class MainDemo {

	public static void main(String[] args) {
		
		Developer d= new Developer(123, "keerthi", 20000, 1000);
		System.out.println("============developer detailes========");
		d.displayDeveloper();
	}
}
