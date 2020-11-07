package com.datastructure.Array;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "My Name is  Vinod Raina";
		String Output= "";
		
		System.out.println("*****************Method 1**************");
		for (int idx = (input.length()-1); idx>=0; idx--)
		{
			Output =  Output.concat( String.valueOf(input.charAt(idx)));
		}
		
		System.out.println(Output);
		System.out.println("*****************Method 2**************");
		
		//String[] temparray =  input.split("");
		System.out.println(new StringBuilder(input).reverse().toString());
		
		
		
	}

	
	
}
