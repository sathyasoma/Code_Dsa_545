package com.j8;

import java.util.function.Function;
import java.util.function.Supplier;

class Customer {
	public Customer() {
		System.out.println("i am reguler here...");
	}
	String name;

	public Customer(String name) {
		this.name = name;
	}
}
public class CustomerDemo {

	public static void main(String[] args) {

		Supplier<Customer> sup = Customer::new; //default constructor
		Customer c = sup.get();
		
		Function<String,Customer> fun=Customer::new; //param constructor
		Customer ct=fun.apply("keerthi");
		System.out.println(ct.name);
	}
}
