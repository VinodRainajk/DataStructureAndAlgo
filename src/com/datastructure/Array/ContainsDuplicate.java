package com.datastructure.Array;

import java.util.HashMap;

public class ContainsDuplicate {
	
	
	public static void main(String[] args) {
		int[] Input=  {0,1,2,3,4,2,5};
		
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		
		for (int idx = 0 ; idx <Input.length; idx++)
		{
			if(hmp.containsKey(Input[idx]))
			{
				System.out.println("Yes array contains duplicate");
				return;
			}else
			{
				hmp.put(Input[idx],idx );
			}
		}
		
	}

}
