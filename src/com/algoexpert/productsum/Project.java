package com.algoexpert.productsum;

import java.util.*;



class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
   	  return sumrecurssion(array,1);
  }
  
  public static int sumrecurssion(List<Object> array, int multiplier)
  {
	  int sum = 0;
	  
	  for(Object elem : array )
	  {
		  if(elem instanceof ArrayList)
		  
		  {
				
				//@SuppressWarnings("unchecked")
				ArrayList<Object> conv = (ArrayList<Object>) elem;
			  sum =  sum+ sumrecurssion(conv,multiplier+1 );
		  }else
		  {
			  sum =  sum +  (int)elem; 
		  }
		  
		  
		  
	  }
	  
	  
	  return sum;
  }
}