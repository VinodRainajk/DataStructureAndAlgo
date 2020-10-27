package com.datastructure.questions;

public class SpiralMatrix {

	
	
	public void getValue(int[][] inputarray)
	{
		int totalrows = inputarray.length;
		int totalcolumns =  inputarray[0].length;
		
		int startvaluerow =  0;
		int Startcolumnval = 0;
		int Prevvcolvalue =totalcolumns-1;
		int Prevvrowvalue = totalrows-1;
				 
		for(int idx = Startcolumnval;  idx <= Prevvcolvalue;  idx++)
		{
			System.out.println(inputarray[startvaluerow][idx]);
		}
		
		for(int idx = startvaluerow+1;  idx <= Prevvrowvalue;  idx++)
		{
			System.out.println(inputarray[idx][Prevvcolvalue]);
		}
		
		for(int idx = Prevvcolvalue-1;  idx >= Startcolumnval ;  idx--)
		{
			System.out.println(inputarray[startvaluerow][idx]);
		}
		
		for(int idx = Prevvrowvalue-1;  idx >= startvaluerow +1;  idx--)
		{
			System.out.println(inputarray[idx][Startcolumnval]);
		}
		
		Startcolumnval++;
		startvaluerow++;
		Prevvcolvalue--;
		Prevvrowvalue--;
	}
	
}
