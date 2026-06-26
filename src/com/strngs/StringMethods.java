package com.strngs;

public class StringMethods {
public static void main(String[] args) {	
	String name="capgemini";
	String name1="capgemini";	
	System.out.println(name.charAt(0));
	//System.out.println(name.charAt(9));
	System.out.println(name.codePointAt(0));
	System.out.println(name.codePointBefore(1));
	System.out.println(name.codePointCount(0, 9));
	System.out.println(name.compareTo(name1));
	System.out.println(name.concat("india"));
	System.out.println(name.contains("minid"));
	System.out.println(name.contentEquals(name1));
	String filname="welcome.pdf";
	System.out.println(filname.endsWith(".pdf"));
	System.out.println(name.equals("capgemini"));
	System.out.println(name.equalsIgnoreCase("CAPGEMINI"));
	String naam="keerthi";
	int age=33;
	System.out.printf("Name is :%s and age is :%d",naam,age);
	System.out.println();
	System.out.println(name.hashCode());
	System.out.println(name);
	System.out.println(name.indent(9));
	System.out.println(name.indexOf('c'));
	System.out.println(name.indexOf("mini"));
	
	String st=new String("welcome");
	String st1=st.intern();
	String stt="welcome";
	System.out.println(st1==stt);
	String bb="  ";
	System.out.println(bb.isBlank());
	System.out.println(bb.isEmpty());
	System.out.println(name.indexOf('i'));
	System.out.println(name.lastIndexOf('i'));
	System.out.println(name.length());
	System.out.println(name.substring(3));
	System.out.println(name.substring(3, 6));
	
	
}
}
