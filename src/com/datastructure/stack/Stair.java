package com.datastructure.stack;

import java.util.ArrayList;

public class Stair {
	int Stairnumber;
	ArrayList<Integer> visited =  new ArrayList<Integer>();
	
	public Stair(int stairnumber, ArrayList<Integer> visited) {
		super();
		this.Stairnumber = stairnumber;
		this.visited.addAll(visited);
		this.visited.add(stairnumber);
	}
	
	

}
