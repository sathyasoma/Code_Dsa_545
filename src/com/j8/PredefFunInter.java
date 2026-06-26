package com.j8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefFunInter {
public static void main(String[] args) {	
	     Predicate<Integer> p=i->i%2==0;
	     System.out.println(p.test(45));
	     System.out.println(p.test(89));
	     System.out.println(p.test(90));
	     
	  String [] names= {"bahubali","devasena","balla","katta","shivagami"};
	  
	  for(String str:names)
	  {
		  Predicate<String> p1=s->s.length()>5;
		  
		  if(p1.test(str))
		  {
			  System.out.println(str);
		  }
	  }
	  
	  //Function:input,output-->perfomr some action produce some result
	  
	 Function<Integer,Integer> f= k->k*k;
	  System.out.println(f.apply(2));
	  System.out.println(f.apply(4));
	  System.out.println(f.apply(8));
	  //String--->integer
	  Function<String,Integer> f1=st->st.length();
	  System.out.println(f1.apply("bahubali"));
	  System.out.println(f1.apply("wrongtun"));
	  System.out.println(f1.apply("deathrace"));
	  //String--->String
	  Function<String,String> f2=wrd->wrd.toUpperCase();
	  System.out.println(f2.apply("sleeping"));
	  System.out.println(f2.apply("chatting"));
	  System.out.println(f2.apply("eating"));
	  System.out.println(f2.apply("last"));
	  System.out.println(f2.apply("benches"));
	  
	  //consmer---->produce some result
	Consumer<String> c=  l->System.out.println(l);
	c.accept("chatting");
	c.accept("watching movies");
	c.accept("last 4 benches");
	
	//Supplier--->get the objects
	Supplier<Date> d=()->new Date();
	System.out.println(d.get());
	
	//otp
	Supplier<String> st=()->{
		
		String otp="";
		for(int i=0;i<6;i++)
		{
			otp=otp+(int)(Math.random()*10);
		}
		return otp;
	};
	System.out.println(st.get());
}
}
