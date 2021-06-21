package com.algoexpert.runlength;

import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
   
	  String returnval ="";
	  String lastval = "";
	  int counter =0;
	  
	  for(int idx = 0; idx< string.length(); idx++)
	  {
		  if(lastval != "")  
		  {
			  if(lastval.charAt(0)== string.charAt(idx))
			  {
				 
				 if((counter+1)<9)
				 {
					 counter = counter+1; 
				 }else
				 {
					 returnval = returnval.concat("9"+lastval.charAt(0));
					 counter = 0;
				 }
				  
			  } else
			  {
				  returnval = returnval.concat(String.valueOf(counter)+lastval.charAt(0));
				  counter= 1;
				  lastval = String.valueOf(string.charAt(idx));
			  }
			  
		  }else
		  {
			  lastval =   String.valueOf(string.charAt(idx));
			  counter= 1;
		  }
		  
		 
		  
	  }
	  
	  returnval = returnval.concat(String.valueOf(counter)+lastval.charAt(0));
    return returnval;
  }
}