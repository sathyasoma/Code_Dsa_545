package com.strngs;

public class SbDemo {
public static void main(String[] args) {
	
	StringBuffer sb= new StringBuffer("capgemini");
	StringBuffer sb1=new StringBuffer("capgemini");
	
	System.out.println(sb==sb1);//t f
	System.out.println(sb.equals(sb1));//f t

}
}
