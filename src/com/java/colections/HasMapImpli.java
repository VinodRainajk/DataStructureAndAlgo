package com.java.colections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HasMapImpli {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hmp = new HashMap<Integer,String>();
		
		hmp.put(2014, "Egypt");
		hmp.put(2015, "Barbados");
		hmp.put(2016, "Canada");
		hmp.put(2017, "USA");
		hmp.put(2019, "India");
		
		for(Entry<Integer, String> tst :hmp.entrySet())
		{
			System.out.println(tst.getValue());
			System.out.println(tst.getKey());
			System.out.println("************");
		}
		
		
	
	}
	

}
