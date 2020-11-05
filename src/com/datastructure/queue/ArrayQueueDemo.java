package com.datastructure.queue;

public class ArrayQueueDemo {
	
	public static void main(String[] args) {
		
		ArrayQueue<Integer> queuedemo = new ArrayQueue<Integer>(5);
		queuedemo.Enqueue(5);
		queuedemo.Enqueue(4);
		queuedemo.Enqueue(3);
		queuedemo.Enqueue(8);

		
		System.out.println(queuedemo.Dequeue());
		System.out.println(queuedemo.Dequeue());
		System.out.println(queuedemo.Dequeue());
		System.out.println(queuedemo.Dequeue());
		System.out.println(queuedemo.Dequeue());

		
	}

}
