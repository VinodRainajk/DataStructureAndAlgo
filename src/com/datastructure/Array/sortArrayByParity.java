package com.datastructure.Array;

public class sortArrayByParity {
	
	public static void main(String[] args) {
		int[] inputarray =  {3,1,2,4};
		int frontidx = 0;
		int backidx = inputarray.length-1;
		while (frontidx!=backidx)
		{
			if(inputarray[frontidx]%2 == 0)
			{
				frontidx++;	
			}else
			{
				int temp =  inputarray[frontidx];
				inputarray[frontidx] = inputarray[backidx];
				inputarray[backidx] = temp;
				backidx--;
			}
		}
		
		for (int i : inputarray) {
			System.out.println(i);
		}
		
		
		
	}

}
