package com.datastructure.stack;

/*
 * This Class contains the basic Stack operations
 * We will define a push and pop operation
 */

public class StackImpli<T> {
	
	private int size;
	private Object[] stackholder;
	private int top;
	
	public StackImpli(int size) {
		super();
		this.size = size;
		this.stackholder = new Object[size];
		this.top = -1;
	}

	public void push(Object element)
	{
		if(isfull())
		{
			System.out.println("Stack is full");
			return;
		}
	  
		top = top+1;
		stackholder[top] = element;
		
	}
	
	public Object pop()
	{
		
		if(isempty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		
		Object retrunelement =  stackholder[top];
		top =  top-1;
		return retrunelement;
	  }
	
	public boolean isempty()
	{
		if (top == -1)
		{
			return true;
		}
		return false;
	}
	
	
	private boolean isfull()
	{
		if (top == size)
		{
			return true;
		}
		
		return false;
	}
	
	

}
