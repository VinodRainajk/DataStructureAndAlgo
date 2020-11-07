package com.java.colections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Priority queue is different from queue, here the records are not saved in queue as FIFO
 * But based on the priority
 * In Case of Class or custom class=, you have to implement comparable interface 
 * as priority queue compares vales. for interger it know which is small and what is big
 */

public class PriorityQueueImpli {
	
	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
		//PriorityQueue<Student> pq = new PriorityQueue<Student>(Collections.reverseOrder()); to reverse the order
		
		
		
		pq.add(new Student("Vinod",31));
		pq.add(new Student("Amit",30));
		pq.add(new Student("Kallol",35));
		pq.add(new Student("Tulshyan",12));
		pq.add(new Student("Chandu",12));
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		
		
	}

}
