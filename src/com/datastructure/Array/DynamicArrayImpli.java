package com.datastructure.Array;

public class DynamicArrayImpli {

	public static void main(String[] args) {
		DynamicArray<Integer> DynArr  = new DynamicArray<Integer>();
		
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(10);
		DynArr.add(17);
		System.out.println(DynArr.getsize());
		
		for(int idx= 0 ;idx <DynArr.getsize(); idx++ )
		{
			System.out.println("The value is "+DynArr.getValues(idx));
		}
		
	}
	
	
}
