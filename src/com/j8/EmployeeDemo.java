package com.j8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {
public static void main(String[] args) {
	
	ArrayList<Employee> al= new ArrayList();
	
	al.add(new Employee(123, "sathya"));
	al.add(new Employee(356, "soma"));
	al.add(new Employee(271, "ballla"));
	al.add(new Employee(362, "devasena"));
	al.add(new Employee(822, "bahu"));
	
	System.out.println(al);
	
	Comparator<Employee> c=(e1,e2)->(e1.empid<e2.empid)?-1:(e1.empid>e2.empid)?1:0;
   
	 Collections.sort(al, c);
	System.out.println(al);
}
}
