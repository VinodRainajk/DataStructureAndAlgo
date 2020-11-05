package com.datastructure.stack;

import java.util.Stack;

public class BracketProblem {
	
	
	public static void main(String[] args) {
		
		String inputstring = "()()())";
		boolean status = true;
		
		Stack<String> StringStack = new Stack<String>();
		
		
				if (inputstring.length()== 0)
				{
					//System.out.println("No Values");
				}else if(inputstring.length()==1){
					//System.out.println("not matching only single value");
				}else
				{
				
					for(int idx=0; idx < inputstring.length(); idx++)
					{
						//System.out.println("value is "+ inputstring.charAt(idx));
						if(String.valueOf(inputstring.charAt(idx)).equals("("))
						{
						//	System.out.println("pushing in stack");
							StringStack.push("(");	
						}else
						{
							if(!StringStack.isEmpty())
							{
								String Output = StringStack.pop();							
								if (Output!="(")
								{
									status = false;
									break;
								}
							}else
							{
								status = false;
								break;
							}
						}
						
						
					}
					
					if(StringStack.isEmpty() && status)
					{
						System.out.println("Bracket are matching");
					}else
					{
						System.out.println("Not matching");
					}
					
					
					
				}
		
		
		
		
	}

}
