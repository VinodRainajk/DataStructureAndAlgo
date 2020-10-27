package com.datastructure.HashMapLA;

public class HasMapImpli {
	
	private Node[] NodeArray;
	private int size;
	
	public HasMapImpli(int size)
	{
		this.size = size;
		NodeArray = new Node[size];
		
		for(int idx= 0; idx<size; idx++)
		{
			NodeArray[idx] = new Node();
		}
	}
	
	public int getHashValue(int Key)
	{
		return Key%size;
	}
	
	
	public void addelement(int Key, String Value)
	{
		Node newelement =  new Node(Key,Value);
		int hashedValue = getHashValue(Key);
		System.out.println("hashedValue ==="+hashedValue);
		Node TempNode  = NodeArray[hashedValue].next;
		if(TempNode!=null)
		System.out.println("TempNode ==="+TempNode.value);
		NodeArray[hashedValue].next = newelement;
		newelement.next = TempNode;
	}
	
	
	public void Display()
	{
		for(int idx= 0; idx<size; idx++)
		{
			Node TempNode = NodeArray[idx].next;
			System.out.println("idx is "+idx);
			System.out.println("+++++++++++++++++++++");
			while(TempNode!=null)
			{
				System.out.println("Key is "+TempNode.key+" and value is "+TempNode.value);
				TempNode= TempNode.next;
			}
			
		}
	}

}
