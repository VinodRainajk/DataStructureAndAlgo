package com.algoexpert.smallestdiff;

import java.util.Arrays;

class Program {
	  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
	    
		  Arrays.sort(arrayOne);
		  Arrays.sort(arrayTwo);
		  
		  int smallestvalue =  Math.abs(arrayOne[0] - arrayTwo[0]);
		  int[] returnarray =  {arrayOne[0], arrayTwo[0]};
		  
		  
		  for(int idx = 0; idx< arrayOne.length; idx++)
		  {
			  
			  for(int jdx = 0; jdx< arrayTwo.length; jdx++)
			  {
				  
				  if((arrayOne[idx]- arrayTwo[jdx]) == 0)
				  {
					  returnarray[0] = arrayOne[idx];
					  returnarray[1] = arrayTwo[jdx];
					  return returnarray;
				  }
				  else if(smallestvalue < Math.abs((arrayOne[idx]- arrayTwo[jdx])))
				  {
					  returnarray[0] = arrayOne[idx];
					  returnarray[1] = arrayTwo[jdx];
					  smallestvalue = Math.abs((arrayOne[idx]- arrayTwo[jdx]));
				  }
				  
			  }
			  
			  
		  }
		  
		    return returnarray;
	  }
	}