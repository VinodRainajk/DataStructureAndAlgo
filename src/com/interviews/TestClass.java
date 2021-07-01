package com.interviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

public class TestClass {
	
    static int[] elements(int Q, int[][] query){
        // write your code here
        
      
         
    	 List<Integer> returnlist = new ArrayList<Integer>();
    	 List<Integer> listedvalue = new ArrayList<Integer>(); 
    	 HashMap<Integer, Integer> mapedCounter = new  HashMap<Integer, Integer>();
    	 
         Integer maxcountervalue =  1;
         Integer maxcounterkey = query[0][0];

         
         for(int index = 0 ; index< Q; index++ )
         {
        	 
        	
	        	 if(query[index][0]==1)
	        	 {
	        		 
	        		 listedvalue.add(query[index][1]);
	        		 
	        		 if(mapedCounter.containsKey(query[index][1]))
	        		 {
	        			 Integer val =  mapedCounter.get(query[index][1]);
	        			 val = val+1;
	        			 mapedCounter.put(query[index][1],val);
	        			 
	        			 if(maxcountervalue<=val)
	        			  {
	        				 maxcountervalue =  val;
	        				 maxcounterkey = query[index][1];
	        			  }	 
	        			
	        		 }else
	        		 {
	        			 mapedCounter.put(query[index][1],1);
	        			 
	        			 if(maxcountervalue==1)
	        			 {
	        				 
	        			 }
	        		 }
	        		 
	        	 }else if((query[index][0]==2)) 
	        	 {
	        		 
	        		 
	        		 if(mapedCounter.containsKey(maxcounterkey))
	        		 {
	        			 for(int indx = listedvalue.size()-1; indx>=0;  indx--)
	        			 {
	        				if(listedvalue.get(indx) == maxcounterkey) 
	        				{
	        					returnlist.add( listedvalue.remove(indx));
	        					break ;
	        				}
	        			 }
	        	
	        			 int value = mapedCounter.get(maxcounterkey);
	        			 value = value-1;
	        			 mapedCounter.put(maxcounterkey,value);
	        			 
	        			 maxcountervalue = 0;
	        			 
	        			 for(int i = 0 ; i< listedvalue.size(); i++)
	        			 {
	        				int temp = mapedCounter.get(listedvalue.get(i));
	        				
	        				if(temp>=maxcountervalue)
	        				{
	        					 maxcountervalue = temp;
	        					 maxcounterkey = listedvalue.get(i);
	        				}
	        			 }
	        			 
	        		 }
	        		 
	        		
	        	 }
        	 
        	 
         }
         
         int[] result = new int[returnlist.size()];
         for(int index =0 ; index< returnlist.size() ; index++)
         {
        	 result[index] = returnlist.get(index);
         }
         
     
         return result;
     }

}
