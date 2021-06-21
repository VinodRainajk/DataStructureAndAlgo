package com.algoexpert.palindrome;

class Program {
	  public static boolean isPalindrome(String str) {
	   
		  String returnvar = ""; 
		  for(int idx=0; idx<str.length(); idx++)
		  {
			  System.out.println(str.charAt(idx));
			  returnvar = str.charAt(idx)+returnvar;
			 
		  }
		  
		  
		  if(returnvar.contentEquals(str))
		  {
			  return true;
		  }
		  
	    return false;
	  }
	}
