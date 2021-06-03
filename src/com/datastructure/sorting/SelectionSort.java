package com.datastructure.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] inputarray = {7,2,5,1,0,9,3};
		int[] outputarray = Selectionsorting(inputarray);
		
		for (int i : outputarray) {
			System.out.println(i);
		}
	}

	private static int[] Selectionsorting(int[] inputarray) {

		for(int idx = 0; idx < inputarray.length; idx++)
		{
			int swapidx =idx;
			for(int jdx =idx+1; jdx<inputarray.length; jdx++)
			{
				if(inputarray[jdx]< inputarray[swapidx])
				{
					swapidx = jdx;
				}				
				
			}
			
			if(swapidx!=idx)
			{
				int temp = inputarray[idx];
				inputarray[idx]= inputarray[swapidx];
				inputarray[swapidx] = temp;
			}
			
		}
		
		return 	inputarray;
		
	}
	

}
