package com.datastructure.Array;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int numb = 121352;
		int rev = 0;
		
		while(numb!=0) {
			rev = rev*10 + numb%10;
			numb= numb/10;
			System.out.println("rev "+rev);
			System.out.println("numb "+numb);
		}
		System.out.println("reversed number is "+rev);
	}

}
