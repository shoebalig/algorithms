package com.algo.dynamic;

import java.util.Stack;

public class ReveresePartsOfNumber {

	/**
	 * Provided input Number eg 1234546789 and an integer splitter
	 * you have to split the number into the parts based on split value.
	 * Then reverse each part and combine each part as full number.
	 * eg Input = 123456789, split = 3, the total parts are 9/3= 3 so 123 | 456 | 789| these are three parts
	 * now output should be 321654987  
	 *
	 */
	public static String output="";
	public static Stack<Integer> stack= new Stack<Integer>();
	public static void main(String[] args) 
	{
		Integer input= 123456789;
		int split= 3;
		reverseParts(input, split);
		System.out.println(output);
	}

	private static void reverseParts(Integer input, int split) 
	{
		int size = input.toString().length();
		int parts= size/split;
		long devisor = getDevisor(size);
		for (int i = 1; i <= size; i++) 
		{
			int numberStack = (int) (input/devisor);
			stack.push(numberStack);
			input = (int) (input%devisor);
			devisor = devisor/10;
			if(stack.size()==parts)
			{
				int len = stack.size();
				for (int j = 1; j <= len; j++)  
				{
					output=output+stack.pop();
				}
				stack.clear();
			}
		}
	}

	private static int getDevisor(int size) {
		int tmp = 1;
		for (int i = 1; i < size; i++) 
		{
			tmp=tmp*10;
		}
		return tmp;
	}

}
