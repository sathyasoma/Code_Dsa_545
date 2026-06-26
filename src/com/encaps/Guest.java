package com.encaps;

public class Guest {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		 
		emp.setEmpid(900);
		emp.setName("keerthi");
		emp.setPinNumber(1234);
		emp.setSalary(89999);
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		//System.out.println(emp.getPinNumber());
		System.out.println(emp.getSalary());
	}
}
