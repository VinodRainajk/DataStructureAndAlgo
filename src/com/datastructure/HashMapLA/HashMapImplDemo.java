package com.datastructure.HashMapLA;

public class HashMapImplDemo {

	
	public static void main(String[] args) {
		
		HasMapImpli hmi = new HasMapImpli(9);
		hmi.addelement(2, "Vinod");
		hmi.addelement(3, "Bharti");
		hmi.addelement(4, "Dady");
		hmi.addelement(5, "papa");
		hmi.addelement(9, "mom");
		hmi.addelement(7, "mummy");
		hmi.addelement(7, "kakli");
		
		
		hmi.Display();
	}
	
}
