package com.colls;

import java.util.ArrayList;

public class Demo1 {
public static void main(String[] args) {
	
	ArrayList al= new ArrayList();
     
	  for(int i=0;i<=10;i++)
	  {
		  al.add(i);
	  }
	  
	  for(int i=0;i<al.size();i++)
	  {
		  System.out.println(al.get(i));
	  }
	  
	  for(Object sorry:al)
	  {
		  System.out.println(sorry);
	  }
	  //10-->odd numbers
	  for(Object tellme:al)
	  {
		  Integer i=(Integer)tellme;
		  if(i%2!=0)
		  {
			  System.out.println(i);
		  }
	  }
}
}
