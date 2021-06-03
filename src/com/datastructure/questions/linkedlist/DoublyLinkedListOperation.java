package com.datastructure.questions.linkedlist;

public class DoublyLinkedListOperation {
	
	DoublyNode front;
	DoublyNode back;
	
	public void add(int Value)
	{
		DoublyNode newelement =  new DoublyNode(Value, null, null);
		
		if(front==null)
		{
			
			System.out.println("front element");
			front= newelement;
			front.next= null;
			front.prev= null;
		}else
		{
			//System.out.println("next element");
			DoublyNode temp = front;
			while(temp.next!= null)
			{
				//System.out.println("Value "+temp.value);
				temp = temp.next;
			}
			temp.next = newelement;
			newelement.prev= temp;
			back =newelement;
		}
		
	}
	
	public void remove(int Value)
	{
		
		
	}
	
	
	public void frontdisplay()
	{
		DoublyNode temp = front;
		while(temp!= null)
		{
			System.out.println("Value is"+temp.value);
			temp = temp.next;
		}
		
	}
	
	
	public void backdisplay()
	{
		DoublyNode temp = back;
		while(temp!= null)
		{
			System.out.println("prev Value is"+temp.value);
			temp = temp.prev;
		}
		
	}
	

}
