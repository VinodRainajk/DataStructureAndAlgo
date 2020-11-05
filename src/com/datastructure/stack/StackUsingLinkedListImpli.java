package com.datastructure.stack;

public class StackUsingLinkedListImpli {
	
	Node Top;
	
	public void push(int value){
		
		Node element = null;
		
		if(Top==null)
		{
			element = new Node(value,null);	
		}else
		{
			element = new Node(value,Top);
			
		}
		Top = element;
	
	}
	
	
	public Node pop () {
		
		Node returnedVal;
		
		if(Top == null)
		{
			System.out.println("Stack is empty");
			returnedVal = null;
			
		}
		
		if (Top.next!= null)
		{
			returnedVal = Top;
			Top =  Top.next;
		}	   
		else
		{
				returnedVal= Top;
				Top = null;
			
			
		}
		return returnedVal;	
	}

}
