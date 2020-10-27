package com.datastructure.questions.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedListImpli lm = new LinkedListImpli();
		lm.addNode(10);
		lm.addNode(20);
		lm.addNode(30);
		lm.addNode(40);
		lm.addNode(50);
		lm.addNode(60);
		lm.addNode(70);
		lm.addNode(80);
		lm.addNode(90);		
		//lm.displayvalues();
		System.out.println("+++++++++++++");
	    //lm.removeNode();
		
		lm.head= deletelement(lm.head,9);
		System.out.println(lm.head.value);
		
		lm.displayvalues();
		
	}
	
	public static Node deletelement(Node head, int k)
	{
		Node fastPointer = head;
		Node slowPointer =  head;
	
		  while(k>0)
				{
		
			  			System.out.println(fastPointer.value);	
						fastPointer = fastPointer.next;
						k--;
						
			
				}

		
  		
	if (fastPointer!= null)
	{
		while(fastPointer.next != null)
		{
			
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		
		slowPointer.next =  slowPointer.next.next;
		
		
	}else
	{
		head = slowPointer.next;

	}
	
	return head;	
		
		
	}
	
	
}
