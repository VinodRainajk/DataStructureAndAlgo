package com.algoexpert.binarysearch;


class Program {
	  public static int binarySearch(int[] array, int target) {
		 int retunvar = findmiddle(array, target,0, array.length,0 );	 
			
			System.out.println("retunvar "+retunvar);
	    return retunvar;
	  }
	  

	  public static int findmiddle(int[] array, int target,int first, int last, int pointer)
	  {
		
		  
		 int middle =  Math.round((last-first)/2) + pointer;
		  System.out.println(middle);
		  if(array[middle] == target)
		  {
			  return middle;
		  }else
			{
				if(middle==array.length || middle ==0)
				{
					return -1;
				}
				
			}
				
			
			
		 
		 if(array[middle] > target)
		 {
			 findmiddle(array, target,first, middle,0 );
			
		 }
		 else
		 {
			  findmiddle(array, target,middle, last,middle );
		 }
		  
		  return -1;
	  }
	  
	  
	  
	}
