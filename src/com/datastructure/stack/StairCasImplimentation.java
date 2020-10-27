package com.datastructure.stack;

/*
 * This Problem demostractes how we can use Stack for staricase problem
 * 
 * https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/
 * 
 */

import java.util.ArrayList;
import java.util.Stack;

public class StairCasImplimentation {
	
	public static void main(String[] args) {
		Integer TotalStairs =  4;
		Stack<Stair> StackedStairs = new Stack<Stair>();
		
		StackedStairs.add(new Stair(0, new ArrayList<Integer>()));
		
		while(!StackedStairs.isEmpty())
		{
			Stair Laststair =   StackedStairs.pop();
			
			if(Laststair.Stairnumber == TotalStairs)
			{
				System.out.println(Laststair.visited);
				continue;
			}
			
			Integer onestep =  Laststair.Stairnumber +1;
			
			if(onestep <= TotalStairs)
			{
				StackedStairs.add(new Stair(onestep, Laststair.visited));
			}
			
			
			Integer twostep =  Laststair.Stairnumber +2;
			if(twostep <= TotalStairs)
			{
				StackedStairs.add(new Stair(twostep, Laststair.visited));
			}		
		}
		
	}

}
