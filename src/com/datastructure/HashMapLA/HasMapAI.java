package com.datastructure.HashMapLA;
/*
 * Here we are searching the common characters that appear in string
 * 
*/


import java.util.ArrayList;
import java.util.HashMap;

public class HasMapAI {
	
	public static void main(String[] args) {
		
		//Given a Sentence, print the words that are of highest importance/ words repeated most.
		
		String inputString = "A paragraph is a series of sentences organized that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs. ... Regardless of the kind of information they contain, all paragraphs share certain characteristics.";
		String[] arrayInput = inputString.split(" ");
		String[] ignorelements =  {".","a","A","the","The","is","and","to","is","they"};
		ArrayList<String> ignorelement = new ArrayList<>();
		ignorelement.add(".");
		ignorelement.add("a");
		ignorelement.add("A");
		ignorelement.add("the");
		ignorelement.add("The");
		ignorelement.add("of");
		ignorelement.add("and");
		ignorelement.add("to");
		ignorelement.add("is");
		ignorelement.add("they");
		
		int maxvalue = 0;
		
		HashMap<String, Integer> hashedvalues =  new HashMap<String, Integer>();
		
		for (String input : arrayInput) {
			if(ignorelement.contains(input))
			{
				continue;
			}
			
		 if(hashedvalues.containsKey(input))
		 {
			 int count =  hashedvalues.get(input);
			 hashedvalues.put(input, count+1); 
			 maxvalue  =  Math.max(maxvalue, count+1);
		 }else
		 {
			 hashedvalues.put(input, 1);
		 }
			
		}
		
		
		for(String input : hashedvalues.keySet())
		{
			
			
			if(maxvalue == hashedvalues.get(input))
			{
				System.out.println("Vaule is  "+input);
				System.out.println("count is  "+hashedvalues.get(input));
			}
			
		}
		
	}
	

}
