package com.java.colections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetTreeSet {
	
	public static void main(String[] args) {
		
		
		/*LinkedList contains duplicate and unordered list
		 * 
		 * */
		LinkedList<String> likedlistName =  new LinkedList<String>();
		likedlistName.add("Vinod");
		likedlistName.add("Raina");
		likedlistName.add("Oracle");
		likedlistName.add("Java");
		likedlistName.add("Java");
		
		
		Iterator<String> itr =  likedlistName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		/*HashSet contains non duplicate and unordered list*/	
		
		System.out.println("******HashSet****");
		
		HashSet<String> Hashset = new HashSet<String>();
		Hashset.add("Vinod");
		Hashset.add("Raina");
		Hashset.add("Oracle");
		Hashset.add("Java");
		Hashset.add("Java");
		Hashset.add("Alpha");
		
		Iterator<String> itr4 =  Hashset.iterator();
		
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		
		/*TreeSet contains non duplicate and ordered list*/	
		System.out.println("******TreeSet****");
		
		TreeSet<String> trset = new TreeSet<String>();
		trset.add("Vinod");
		trset.add("Raina");
		trset.add("Oracle");
		trset.add("Java");
		trset.add("Java");
		trset.add("Alpha");
		
		Iterator<String> itr2 =  trset.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
	}
	

	

}
