package com.demo.com;

public class Student {
	int stid;
	String stname;
	public Student() {
       stid=0;
       stname=null;
	}
	public void assign()
	{
		stid=890;
		stname="keerthi";
	}
	public void display()
	{
		System.out.println(stid+" "+stname);
	}
	public static void main(String[] args) {
		
		Student st= new Student();
		st.assign();
		st.display();
	}
}
