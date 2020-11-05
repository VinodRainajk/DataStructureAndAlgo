package com.datastructure.queue;

public class ArrayQueue<T> {
	
	int size;
	int front = -1;
	int rear = -1;
	Object[] inputqueue;
	
	ArrayQueue(int size)
	{
		inputqueue =  new Object[size];
		this.size = size;
		front = 0;
	}
	
	
	public void Enqueue(Object input )
	{
		if(isfull())
		{
			System.out.println("Queue is full");
			return;
		}
		
		rear = rear+1;
		inputqueue[rear] = input;
	}
	
	
	public T Dequeue()
	{

		if(isempty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		Object returnqueue = inputqueue[front];
		front = front+1;
		return (T)returnqueue;
	}
	
	
	public boolean isempty()
	{
		
		
		if(rear==0||front>rear)
		{
			return true;
		}
		
		return false;
	}
	
	
	public boolean isfull()
	{
		if(rear==size-1)
		{
			return true;
		}
		
		return false;
	}
	

}
