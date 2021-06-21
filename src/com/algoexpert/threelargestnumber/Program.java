package com.algoexpert.threelargestnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
	  public static int[] findThreeLargestNumbers(int[] array) {
	    // Write your code here.
		
		  int[] returnarray = null ;
		  
		  Arrays.sort(array);
		  
		  for(int idx=array.length-1; idx> array.length-3; idx-- )
		  {
			  System.out.println("idx "+idx);
			  System.out.println("array[idx] "+array[idx]);
			  int i = 0;
			  returnarray[i] =  array[idx];
		  }
		  
		  
	
	
	    return returnarray;
	  }
	}
