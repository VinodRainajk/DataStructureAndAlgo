import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

	int tempvalue = linkedList.value;
	
	    LinkedList headlist = linkedList;
		linkedList = linkedList.next;
		
	  
   while (linkedList.next != null)
   {
		    System.out.println("linkedList.value "+ linkedList.value);
		 	System.out.println("tempvalue "+ tempvalue);
	   if(linkedList.value ==  tempvalue)
	   {
		   if(linkedList.next.next!= null)
		   {
				 System.out.println("equals  "+ linkedList.next.value);
				 LinkedList tempval = new LinkedList(linkedList.next.value);
				 tempval.next = linkedList.next.next;
		         linkedList.next = tempval;
		   }else
		   {
			   linkedList.next = null; 
		   }
		   
	   }else
	   {
		      tempvalue = linkedList.value;
			  linkedList = linkedList.next;
	   }
	   
	   
   }
	 System.out.println("second   "); 
		linkedList  = headlist;
			  
   while (linkedList.next != null)
   {
		  System.out.println("linkedList.value "+ linkedList.value);

	   linkedList = linkedList.next;
   }
	  
	  
    return headlist;
  }
}
