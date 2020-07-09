package com.algo.dynamic;

import java.util.HashSet;
import java.util.Set;

public class HackerRankZeroIndex {

	static Set<Integer> sets = new HashSet<Integer>();
	public static void main(String[] args) {
		int test[] = {5,4,0,3,1,6,2};
		
		System.out.println(doit(test));
	}
	
	 public static int doit(int[] input) {
		 if(input.length<1)
			 return 0;
		int input_size=0;
		
		for (int i = 0; i < input.length; i++) 
		{
			sets.clear();
			int tmp = i;
			for (int j = 0; j <= i+1; j++) 
			{
				
				sets.add(input[tmp]);
				tmp = input[tmp];
			}
			if(sets.size()>input_size)
			{
				input_size = sets.size();
			}
		}
		return input_size;
	}
}
