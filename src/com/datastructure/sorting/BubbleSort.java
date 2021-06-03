package com.datastructure.sorting;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		int[] inputarray = {7,2,5,1,0,9,3};
		
		int[] outputarray = bubblesorted(inputarray);
		
		for (int i : outputarray) {
			System.out.println(i);
			
		}
	}

	private static int[] bubblesorted(int[] inputarray) {
		
		for(int idx = 0 ; idx<inputarray.length; idx++)
		{

			
			for(int jdx = 1 ; jdx<inputarray.length-idx; jdx++)
			{
				if(inputarray[jdx-1]>inputarray[jdx])
				{
					int temp = inputarray[jdx-1];
					inputarray[jdx-1] = inputarray[jdx]; 
					inputarray[jdx]= temp;

				}
			}
			
		
		
		}
		return 	inputarray;
		
		
	}
	
}
