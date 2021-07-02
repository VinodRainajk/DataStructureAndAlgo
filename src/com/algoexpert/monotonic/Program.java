package com.algoexpert.monotonic;




class Program {
	  public static boolean isMonotonic(int[] array) {
	    // Write your code here.
		  
		  boolean increasing = true;
		  boolean equal = false;
		  
		  if(array.length<=1)
		  {
			  return true;
		  }
		  
		  if(array[0]> array[1])
		  {
			  increasing = false;
		  }else
		  {
			  if(array[0]< array[1])
			  {
				  increasing = true;  
			  }else
			  {
				  increasing = false;
				  equal = true;
			  }
			  
		  }
		  
		  for(int idx = 1 ; idx< array.length ; idx++ )
		  {
			  if(equal )
			  {
				  if(array[idx-1] <  array[idx])
				  {
					  equal = false;
					  increasing = true;  
					  
				  }else if(array[idx-1] >  array[idx])
					  
				  {
					  equal = false;
					  increasing = false;  
				  }
			  
			  }
		
			  
			  if(!(array[idx-1] == array[idx]))
				{
				
					  if(!equal)
					  {
						  if(array[idx-1]==  array[idx]) 
						  {
							  equal = true; 
						  }
					  }
					  
					  if(!equal && increasing )
					  {
						  if(array[idx-1] >  array[idx])
						  {
							  return false;
						  }
						  
					  }else if(!equal && (!increasing) )
					  {
						  
						  if(array[idx-1] <  array[idx])
						  {
							  return false;
						  }
						  
					  }
				}
			  
			
			  System.out.println("equal "+equal);
			  System.out.println("increasing "+increasing);
	
		  }
		  
		  
		  
		  
		  
	    return true;
	  }
	}