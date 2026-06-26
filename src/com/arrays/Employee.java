package com.arrays;

public class Employee {
	int empid;
	String empname;
	String empadd;
	int empsal;
	public Employee(int empid, String empname, String empadd, int empsal) {	
		this.empid = empid;
		this.empname = empname;
		this.empadd = empadd;
		this.empsal = empsal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empadd=" + empadd + ", empsal=" + empsal + "]";
	}
	
}
