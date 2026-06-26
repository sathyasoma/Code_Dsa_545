package com.arrays;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1= new Employee(123, "keerthi", "kochi", 2000);
		Employee emp2= new Employee(893, "suresh", "combed", 6453);
		Employee emp3= new Employee(256, "bahu", "kuntala", 8655);
		Employee emp4= new Employee(732, "devasena", "rajyanga", 2546);
		
		
		Employee employees[]={emp1,emp2,emp3,emp4};
		
		for(Employee e:employees)
		{
			System.out.println(e);
		}
	}
}
