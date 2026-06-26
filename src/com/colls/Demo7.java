package com.colls;

import java.util.HashMap;

public class Demo7 {

	
	public static int getBucketIndex(Object key,int capcity)
	{
		int hashcode=key.hashCode();
		int index=(capcity-1)&hashcode;
		return index; 
	}
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<>();
		
		hm.put(123,"sathya");
		hm.put(163,"soma");
		hm.put(933,"prkash");
		hm.put(126,"sathya");
		
		System.out.println(hm);
		
		int keys[]= {123,163,933,126};
		
		for(int key:keys)
		{
			int capacity=16;
			int indx=getBucketIndex(key, capacity);
			System.out.println(
					"key  :"+key+
					" value "+hm.get(key)+
					" index :"+indx
					);
		}
	}
}
