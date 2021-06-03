package com.algoexpert.fibonacci;

import java.util.*;

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
	  
	  int prev2= 0;
	  int prev1= 0;
	  int currval = 0;
	  
	  if(n == 1)
		  return 0;
	  
	  for(int idx= 1; idx< n; idx++)
	  {
		  prev2 = prev1;
		  prev1 = currval;
		  
		  if(prev2==0 && prev1 == 0 && idx== 1)
		  {
			  prev2 =1; 
		  }
		  
		  currval =  prev2 + prev1;
		  
	  }
	  
	  
    return currval;
  }
}
