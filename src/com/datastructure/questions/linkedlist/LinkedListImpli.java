package com.datastructure.questions.linkedlist;

public class LinkedListImpli {
	
	Node head;
	
	public void addNode(int value){
		
		Node element = null;
		
		if(head==null)
		{
			element = new Node(value,null);	
		}else
		{
			element = new Node(value,head);
			
		}
		head = element;
	
	}
	
	
	public void removeNode () {

		if (head.next!= null)
		{
			head =  head.next;
		}	   
		else
		{
			head = null;
		}
			
	}
	
	
	public void displayvalues() {
		Node temp = head;
		while(temp!= null)
		{
			System.out.println("element value is "+temp.value);
			temp = temp.next;
		}
		
	}
	

}
