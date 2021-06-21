package com.algoexper.ceasercipher;

class Program {
	  public static String caesarCypherEncryptor(String str, int key) {
	    // Write your code here.
		  String strVal = "";
		 for(int idx =0 ; idx< str.length(); idx++ )
		 {
			 int val = (int)str.charAt(idx);
			 int mod =  key%26;
			 int sum = val+mod;
			
			
			 if(  (sum) <= 122 )
			 {
				 strVal =  strVal+((char)(sum));
			 }
			 else
			 {
				 
				
				 System.out.println(mod);
				 if(mod > 26 )
				 {
					mod =  mod- 26;
					
				 }
				 strVal =  strVal+((char)(mod));
			 }
			 
			 
			 
		 }
		  
	    return strVal;
	  }
	}
