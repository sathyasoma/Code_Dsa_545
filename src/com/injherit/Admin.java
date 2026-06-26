package com.injherit;

public class Admin extends Developer{
	
	public void delete()
	{
		System.out.println("i can ddeltee");
	}
	
	public static void main(String[] args) {
		
		Admin ad= new Admin();
		ad.read();
		ad.write();
		ad.delete();
	}
}
