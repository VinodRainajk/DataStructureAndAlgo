package com.datastructure.Array;

public class maximumSubarray {
	
	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};	
		int globalMaxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] = Math.max(nums[i],nums[i-1]+nums[i]);
            globalMaxSum = Math.max(globalMaxSum,nums[i]);
        }
        
        System.out.println(globalMaxSum);
		
	}

}
