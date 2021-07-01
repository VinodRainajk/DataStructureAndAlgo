package com.algoexpert.MoveElementToEND;

import java.util.*;

class Program {
	
	static List<Integer> arrayMain ;
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

	  int istIndex = 0;
	  int lastIndex = array.size()-1;
	  arrayMain = array;
	  
	  while( (istIndex!=lastIndex) || (istIndex<lastIndex))
	  {
		  System.out.println("istIndex"+ istIndex);
		  System.out.println("lastIndex"+ lastIndex);
		  
			  if( (array.get(istIndex) == toMove) && (array.get(lastIndex) != toMove))
			  {
				  Swap(istIndex, lastIndex);
			  }
		  
		  if(arrayMain.get(istIndex) != toMove)
		  {
			  istIndex++;
		  }
		  
		  if(arrayMain.get(lastIndex) == toMove)
		  {
			  lastIndex++;
		  }  
		  
	  }
	  
	  
	  
    return arrayMain;
  }

  
  private static void Swap(int istIndex, int lastIndex) {
		int temp = arrayMain.get(lastIndex);
		arrayMain.add(lastIndex, arrayMain.get(istIndex));
		arrayMain.add(istIndex, temp);		
	}

}