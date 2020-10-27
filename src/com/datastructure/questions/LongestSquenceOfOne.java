package com.datastructure.questions;

/*
	You are given a sting of 0 and 1, find the longest sequence of 1. 
	You can replace only one 0 in between and that could be also considered as 1
	e.g 1,1,1,0,1,0,1,1
	here you have 1,1,1,0,1 = 4
	              1,0,1,1 = 3
		
*/
import java.util.ArrayList;
import java.util.List;

public class LongestSquenceOfOne {
	
	
	public static void main(String[] args) {
	   
		int[] arrayOfValues =  {1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		List<Integer> integerList = new ArrayList<Integer>();	
		
		int counter = 0;
		int prevvalue = 1;

		for(int idx = 0; idx< arrayOfValues.length; idx++)
		{
			
			if(arrayOfValues[idx] ==  1)
			{
				counter++;
				prevvalue= arrayOfValues[idx];
			}else if(arrayOfValues[idx] ==  0 && prevvalue != 0 && idx!=arrayOfValues.length-1  ) 
			{
			
				integerList.add(counter);
				counter= 0;
				prevvalue= arrayOfValues[idx];
			}
			
			if(arrayOfValues[idx] ==  0 )
			{
				integerList.add(0);
				prevvalue= arrayOfValues[idx];
				counter=0;
			}
			
			
		}
		
		integerList.add(counter);
			
		
		
		System.out.println(integerList);
		
		int maxvalue =0;
		boolean lastvalue = true;
		counter = 0;
		System.out.println("size "+integerList.size());
		while(lastvalue)
        {
			System.out.println("counter "+counter);
			System.out.println("maxvalue "+maxvalue);
        	if(counter+2 < integerList.size())
        	{
        		System.out.println("valuye " +integerList.get(counter));
			maxvalue =  Math.max(maxvalue, (integerList.get(counter) + integerList.get(counter+2)) );
        	}
        	
					
			if(counter+2 > integerList.size())
			{
				lastvalue = false;
	        }else
	        {
	        	counter =  counter+2;
	        }
		
        }
		
		System.out.println(maxvalue);
		
	}
	

}
