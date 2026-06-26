package com.j8;

interface Payment {

	void process();
  default  void refund()
  {
	  System.out.println("refund initiated...");
  }
}

class X implements Payment {
 public	void process() {
	};
}

class Y implements Payment {
 
 public	void process() {
	};
}

class Z implements Payment {
public	void process() {
	};
}

class Final implements Payment {
	public void process() {
	};
	
    public void refund()
    {
    	System.out.println("10000 refund initiated...");
    }
}

public class MyDemo {

	public static void main(String[] args) {
		
		Final f= new Final();
		f.process();
		f.refund();
		
	}
}
