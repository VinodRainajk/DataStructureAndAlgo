package com.datastructure.Array;

public class MergeSortedArray {
	
	
	public static void main(String[] args) {
		
		int[] array1 = {10,15,14,19,21};
		int[] array2 = {1,8,20};
		int[] MergedSortedarray = new int[array1.length+array2.length];

		
		/*
		 * Method1
		 * 
		 */
		
		int idx =0;
		int jdx = 0;
		int Mdx = 0;
		while((idx< array1.length) || (jdx< array2.length))
		{
			System.out.println("idx "+idx);
			System.out.println("jdx "+jdx);
		if((idx< array1.length) &&(jdx< array2.length))
			{
				
					if(array1[idx]>array2[jdx])
					{
						MergedSortedarray[Mdx] = array2[jdx];
						Mdx++;
						jdx++;
								
					}else if((array1[idx]<array2[jdx]))
					{
						
						MergedSortedarray[Mdx] = array1[idx];
						Mdx++;
						idx++;
						
					}else 
					{
						MergedSortedarray[Mdx] = array1[idx];
						Mdx++;
						idx++;
						MergedSortedarray[Mdx] = array2[jdx];
						Mdx++;
						jdx++;
					}
		   }
		
		/*
		 * Below two can be completely omitted by using a boolean variable 
		 */
		   else if((jdx== array2.length))
		   {
			    MergedSortedarray[Mdx] = array1[idx];
				Mdx++;
				idx++;
		   }else if((idx== array1.length))
		   {
			    MergedSortedarray[Mdx] = array2[jdx];
				Mdx++;
				jdx++;
		   }
			
		}
		
		for (int kdx = 0 ;kdx < MergedSortedarray.length; kdx ++) {
			
			System.out.println(MergedSortedarray[kdx]);
		}
		
		System.out.println("******Method 2**********");
		
		
	}

}
