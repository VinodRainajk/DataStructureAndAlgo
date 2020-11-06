package com.java.colections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpli {
	
	public static void main(String[] args) {
		
		LinkedList<String> likedlistName =  new LinkedList<String>();
		likedlistName.add("Vinod");
		likedlistName.add("Raina");
		likedlistName.add("Oracle");
		likedlistName.add("Java");
		
		Iterator<String> itr = likedlistName.iterator();
		

		while(itr.hasNext())
		{
			if(itr.next() == "Oracle")
			itr.remove();// you cannot invoke remove() on iterator without invoking .next();
		}
		
		itr = likedlistName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	

}
