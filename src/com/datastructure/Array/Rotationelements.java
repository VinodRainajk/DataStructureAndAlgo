package com.datastructure.Array;

public class Rotationelements {
	public static void main(String[] args) {
		int[] Input=  {1,2,3,4,5,6,7};
		int[] output = new int[Input.length];
		int rotation = 2;
		int statindx = rotation%Input.length;
		/*
		 * The logic here is if you have 7 rotation, you are back to same position
		 * if 1 then only 7 moves, I wanted to avoid multiple loops
		 * so if 14 rotation, again same string is returned, if 22 its equivalent to 1 roation so 22%7(length) = 1
		 * No if you see if only one rotation has to be moved then index at 0 will become 1 and  1 will become 2
		 * similartly if 3 roation , then index 0 will become 3
		 * 
		 */
		
		
	  for(int idx = 0; idx<Input.length;idx++ )
	  {
		  output[rotation] = Input[idx];
		  rotation++;
		  if (rotation==Input.length)
		  {
			  rotation = 0;  
		  }
		  
	  }

	for (int i : output) {
		System.out.println(i);
	}  
		
	}

}
