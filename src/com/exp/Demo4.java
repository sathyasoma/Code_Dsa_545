package com.exp;

public class Demo4 {
public static void main(String[] args) {
	try {
	int arr[]= new int[5];
	arr[4]=45/0;
	String s="123";
	int x=Integer.parseInt(s);
	System.out.println(s.length());
	System.out.println("no error :"+s+" "+x);
	}	
	catch (ArithmeticException e) {
    // System.out.println("dont eneter den");
		//System.out.println(e.getMessage());
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array is out of bound");
	}
	catch (NumberFormatException e) {
       System.out.println("cont convert rom string to nyumber");
	}
	catch (NullPointerException e) {
      System.out.println("cant fn length of the null");
	}
	catch (Exception e) {
	     System.out.println("HANDLED BY PARENT");
		}
	finally {
		System.out.println("altes execyted");
	}
	System.out.println("reminhg 1000 lines of code");
}
}
