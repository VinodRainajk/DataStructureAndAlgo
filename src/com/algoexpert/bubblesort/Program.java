package com.algoexpert.bubblesort;

public class Program {

	
		  public static int[] bubbleSort(int[] array) {
		    
			  boolean sortrequired =  true;
			  int length = array.length;
			  while(sortrequired)
			  {
				  sortrequired = false;
				  
				  for(int idx = 1 ; idx < length ; idx++)
				  {
					 
					  System.out.println("array[idx-1] " +array[idx-1]);
					  System.out.println("array[idx] " +array[idx]);
					  if(array[idx] < array[idx-1])
					  {
						
						  int temp = array[idx-1];
						  array[idx-1] =  array[idx];
						  array[idx] = temp;
						  
						sortrequired = true; 
						 
					  }
					  
					  length = length-1;
				  }
				  
				  
				  
			  }
			  
			  
			  
		    return array;
		  }
}

