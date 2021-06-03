package com.datastructure.Array;
/*
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetCode".
 * Only the first letter in this word is capital, like "Google".
 * 
 * A-Z = 65-90
 * a-z = 97-122
 * space = 32
 */

public class DetectCapital {

	public static void main(String[] args) {
		
		String inputString = "FlaG";
		boolean firstcontainsCapital = false;
		boolean misCapital = false;
		for(int idx = 0; idx < inputString.length() ; idx++)
		{
			System.out.println(inputString.charAt(idx));
			System.out.println((int)inputString.charAt(idx));
			if((inputString.charAt(idx) >= 65) && (inputString.charAt(idx) <= 90))
			{
				System.out.println("here123");
				if(idx == 0)
				{
					firstcontainsCapital = true;	
				}
				else if((firstcontainsCapital==false)  && (idx>0))
					{
					System.out.println("mixed");
					break;
					}
				else if(idx > 0)
				{
					misCapital = true;
				}
					
			}else
			{  
				System.out.println("here");
				if(misCapital)
				{
					System.out.println("mixed");
					break;
				}
				
				
				if(idx > 0)
				{
					firstcontainsCapital = false;
				}
				
			}
			
		}
		
	}
	
	
}
