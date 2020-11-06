package com.datastructure.queue;

import java.util.PriorityQueue;

public class PriorityQueueImpli {
	
	
	public static void main(String[] args) {
		
		int[] values = {7,2,4,9,1,5,2,1,4,};
		int topN = 3;
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
		
		for(int idx = 0; idx< values.length;idx++)
		{
			prq.add(values[idx]);
			
			if(idx >= topN)
			{
				System.out.println("hello ");
				prq.poll();	
			}
		}
		
		System.out.println(prq);
	}
	

}
