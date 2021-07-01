package com.algoexpert.threesum;

import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

	  Arrays.sort(array);
	  List<Integer[]> returnlist = new ArrayList<Integer[]>();
	  
	  HashMap<Integer, Integer> allvalues =  new HashMap<Integer, Integer>();
	  
	  for(int idx =0 ; idx< array.length; idx++)
	  {
		  allvalues.put(array[idx], array[idx]);
	  }
	  
	  
	  for(int idx =0 ; idx< array.length-1; idx++)
	  {
		  
		  for(int jdx =idx+1; jdx<array.length; jdx++)
		  {
			  int value = targetSum - (array[idx] + array[jdx]);
			  
			  if(value > array[jdx])
			  {
				  if(allvalues.containsKey(value))
				  {
					  Integer[] temparray = {array[idx] , array[jdx],value}; 
					  returnlist.add(temparray);
				  }
			  }
		  }
		  
		  
	  }
	  
	  
	  
	  
	  
	  
    return returnlist;
  }
}