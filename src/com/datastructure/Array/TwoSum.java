package com.datastructure.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {
	
	public static void main(String[] args) {
		//Input: nums = [2,7,11,15], target = 9
		
		int[] nums = {4,4,11,15};
		int target = 8;
		
		HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    
	    
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            System.out.println("i "+ i +"  "+ map.get(complement));
	            return;
	        }
	    }
	
		
	}

}
