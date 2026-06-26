package com.j8;

import java.util.Arrays;
import java.util.List;

class PaymentUtil{
	
	static double calculateEmi(double amount)
	{
		return amount*0.67;
	}
	
	public void show(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodRefDemo {
public static void main(String[] args) {
		
	List<Integer> numbers=Arrays.asList(10,-10,20,-30,40);
	
	numbers.stream().map(Math::abs).forEach(System.out::println);
	
	
	List<Double> amounts=Arrays.asList(1200.78,488.83);
	
	amounts.stream().map(PaymentUtil::calculateEmi).forEach(System.out::println);

	//instance references
	PaymentUtil pt= new PaymentUtil();
	List<String> messages=Arrays.asList("hello","welcome","to","sleeping","wolrd");
	
	messages.forEach(pt::show);

}
}
