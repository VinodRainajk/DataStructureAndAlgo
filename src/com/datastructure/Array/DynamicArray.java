package com.datastructure.Array;

import java.util.Arrays;

public class DynamicArray <T> {
	
	private Object[] array;
	private int currentSize = 0;
	private int currentindex = 0;
	
	DynamicArray()
	{
		this.array =  new Object[1];
		this.currentindex = 0;
		this.currentSize = 1;
	}
	
	
	
	public void add(Object input)
	{
		//System.out.println("currentSize "+currentSize);
		//System.out.println("currentindex "+currentindex);
		
		if (!SpaceAvaliable())
		{
			System.out.println("lets increase");
			array = IncreaseSize(array);
		}
		
		array[currentindex] = input;
		currentindex++;
	}

	private boolean SpaceAvaliable()
	{	
		if (currentSize ==currentindex)
		{
			return false;
		}
			return true;	
	}
	
	
	private Object[] IncreaseSize(Object[] inputarray)
	{
		Object[] outputarray = Arrays.copyOf(inputarray, (currentSize*2)); 
		currentSize = currentSize*2;
		return outputarray;	
	}
	
	
	public int getsize()
	{
		return currentSize;
	}
	
	
	public T getValues(int index)
	{
		return (T)array[index];
	}
	
}
