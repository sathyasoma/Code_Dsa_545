package com.j8;

public class MyRunnable{

//	@Override
//	public void run() {
//      for(int i=0;i<=10;i++)
//      {
//    	  System.out.println("seetha thread");
//    	  
//      }
//	}

	public static void main(String[] args) {
	
		
		Runnable r=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("seetha thread...");
			}
			
		};
		
//		MyRunnable mr= new MyRunnable();
//	    
		Thread t= new Thread(r);
		t.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("rama thread...");
		}
		
	}

}
