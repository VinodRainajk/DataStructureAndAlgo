package com.datastructure.stack;

public class StackLinkedListDemo {
	
	public static void main(String[] args) {
		StackUsingLinkedListImpli stack = new StackUsingLinkedListImpli();
		stack.push(10);
		stack.push(20);
		stack.push(300);
	
	System.out.println(stack.pop().value);
	System.out.println(stack.pop().value);
	System.out.println(stack.pop().value);
	//System.out.println(stack.pop().value);
	}

}
