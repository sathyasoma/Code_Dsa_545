package com.strngs;

public class Demo {
public static void main(String[] args) {
	
	String name="keerthi";
	
	name.concat("suresh");
	
	System.out.println(name);
	String s1="capgemini";
	String s2="capgemini"; //scp(string consteant pool)
	
	System.out.println(s1==s2); //t f
	System.out.println(s1.equals(s2));//f t
	
	String str=new String("keerthi");
	String str1=new String("keerthi");
	
	System.out.println(str==str1);//f
	System.out.println(str.equals(str1));// t
	
}
}
