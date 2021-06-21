package com.algoexper.documentgenerator;

import java.util.*;


class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
	  
	  HashMap<String,Integer> parser = new HashMap<String,Integer>();
	  
	  if(characters.length()<document.length())
	  {
		  return false;
	  }
	  
	  for(int idx = 0; idx < characters.length(); idx++)
	  {
	
		  if(parser.containsKey(String.valueOf(characters.charAt(idx))))
		  {
			 int value =  parser.get(String.valueOf(characters.charAt(idx))) +1;
			 parser.put( String.valueOf(characters.charAt(idx)), value);
		  }
		  else
		  {
			  parser.put( String.valueOf(characters.charAt(idx)), 1);
		  }
	  }
	  
	  
	  for(int idx = 0; idx < document.length(); idx++)
	  {
		  if(parser.containsKey(String.valueOf(document.charAt(idx))))
		  {
			     int value =  parser.get(String.valueOf(document.charAt(idx)));
			     
			     if(value==0)
			     {
			    	 return false;
			     } else
			     {
			    	 parser.put( String.valueOf(document.charAt(idx)), value-1);   
			     }
				 
		  }else
		  {
			  return false;
		  }
		  
		  
	  }
	  
	  
	  
    return true;
  }
}
