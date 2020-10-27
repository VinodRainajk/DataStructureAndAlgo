package com.datastructure.HashMapLA;

public class Node {
	
	String value;
	int key;
	Node next;
	
	public Node(int key,String value) {
		super();
		this.value = value;
		this.key = key;
	}
	
	public Node()
	{}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	
	

}
