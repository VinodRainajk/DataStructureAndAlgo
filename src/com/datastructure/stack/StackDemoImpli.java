package com.datastructure.stack;

public class StackDemoImpli {
	
	public static void main(String[] args) {
		StackImpli<Integer> VarstackImpli =  new StackImpli(5);
		VarstackImpli.push(10);
		VarstackImpli.push(20);
		VarstackImpli.push(30);
		VarstackImpli.push(40);
		VarstackImpli.push(50);
		
		while(!VarstackImpli.isempty())
		{
			Integer returnedint  =  (Integer)VarstackImpli.pop();
			System.out.println(returnedint);
		}

		
	}

}
