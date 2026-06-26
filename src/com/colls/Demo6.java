package com.colls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo6 {
public static void main(String[] args) {
		
	HashMap<Integer,String> hm= new HashMap<>();
	
	hm.put(123,"sathya");
	hm.put(163,"soma");
	hm.put(933,"prkash");
	hm.put(126,"sathya");
		
	System.out.println(hm);
	System.out.println(hm.containsKey(163));
	System.out.println(hm.get(123));
	System.out.println(hm.getOrDefault(934, "not found"));
	
	Set<Entry<Integer, String>> result=hm.entrySet();
	
	Iterator<Entry<Integer,String>> itr=result.iterator();
	
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
		
		Entry<Integer,String> finalResult=itr.next();
		System.out.println(finalResult.getKey()+" "+finalResult.getValue());
	}
	
	
}
}
