package com.algoexpert.insertionsort;

class Program {
	  public static int[] insertionSort(int[] array) {
	   

		 int sortedlength = 1;
		 int totallength = array.length;
		 boolean issorted= false;
		 
		 for(int indx = 1; indx < totallength; indx++)
		 {
			 int intinnerloop = indx;
			 issorted = false;
		
			 System.out.println("intinnerloop"+intinnerloop);
			 while((intinnerloop == 0) ||issorted )
			 {
				 
				 if(array[intinnerloop] < array[intinnerloop-1])
				 {
					 System.out.println("swap");
					 int temp = array[intinnerloop];
					 array[intinnerloop] = array[intinnerloop-1];
					 array[intinnerloop-1] = temp;
					 intinnerloop--;
					 issorted= false;
				 }else
				 {
					 issorted = true;
				 }
				 
				 
			 }
				 
			 
			 
		 }
		 
	    return array;
	  }
	}