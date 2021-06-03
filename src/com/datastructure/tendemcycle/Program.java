package com.datastructure.tendemcycle;

import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

	  //fastest ascending blueShirtSpeeds
	  //Slowest  descending blueShirtSpeeds
	  
	  //redShirtSpeeds always ascending
	  

	  
	  Arrays.sort(redShirtSpeeds);
	  Arrays.sort(blueShirtSpeeds);
	  
	  int returnval = 0;
	  
	for(int idx = 0; idx < redShirtSpeeds.length ; idx ++ )
	{
	  	int blueval =  0;
		if(fastest)
		{
			blueval = blueShirtSpeeds[(blueShirtSpeeds.length-1)-idx];
			
		}else
		{
			blueval = blueShirtSpeeds[idx];
		}
	
		returnval =  returnval + Math.max(redShirtSpeeds[idx], blueval);
		
	}
	  
	  
	  
    return returnval;
  }
}
