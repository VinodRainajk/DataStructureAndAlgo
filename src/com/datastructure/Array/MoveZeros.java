package com.datastructure.Array;

public class MoveZeros {
	
	public static void main(String[] args) {
		int[] Input=  {0,1,0,0,0,0,3,12};
		int[] output = new int[Input.length];
		int jdx = 0;
		int zeros =Input.length-1;
		
		for(int idx= 0; idx<Input.length; idx++)
		{
			if(Input[idx] !=0)
			{
				output[jdx] = Input[idx];
				jdx++;
			}else
			{
				output[zeros] = 0;
				zeros= zeros-1;
			}
		}
		
		for (int i : output) {
			System.out.println(i);
		}
	}

}
