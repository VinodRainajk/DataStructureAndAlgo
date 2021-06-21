package com.algoexpert.nonrepeating;
import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
   
	  HashMap<String,Integer> parser = new HashMap<String,Integer>();
	  
	  for(int idx = 0; idx < string.length(); idx++)
	  {
	
		  if(parser.containsKey(String.valueOf(string.charAt(idx))))
		  {
			 int value =  parser.get(String.valueOf(string.charAt(idx))) +1;
			 parser.put( String.valueOf(string.charAt(idx)), value);
		  }
		  else
		  {
			  parser.put( String.valueOf(string.charAt(idx)), 1);
		  }
	  }
	  
	  
	  for(int idx = 0; idx < string.length(); idx++)
	  {
		  if(parser.containsKey(String.valueOf(string.charAt(idx))))
		  {
			  int value =  parser.get(String.valueOf(string.charAt(idx)));
			  if(value==1)
			  {
				  return idx;
			  }
		  }
		  
		  
	  }
	  
	  
    return -1;
  }
}