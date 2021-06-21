package com.algoexpert.selectionsort;

import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    
	int smallValIndx = 0;
	int innerindex = 0;
	
	for(int idx = 0 ; idx < array.length; idx++)
	{
		System.out.println("idx"+idx);
		smallValIndx =idx;
		innerindex = idx;
		
		while((array.length-(innerindex+1))!=0)
		{
			System.out.println("inside loop");
			if(array[smallValIndx] < array[innerindex+1])
			{
				System.out.println("swap");
				smallValIndx = innerindex;
			}
			innerindex++;
			
		}
		
		if(smallValIndx!= idx)
		{
			 int temp = array[smallValIndx];
			 array[smallValIndx] = array[idx];
			 array[idx] = temp;
		}
		
		
	}
	  
	  
	  
    return array;
  }
}
