package com.algo.dynamic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringDistance {

	public static void main(String[] args) 
	{
		String input1="aaaabb";
		String input2="abbbcc";
		equalOrNot(input1,input2);
		
	}

	private static void equalOrNot(String input1, String input2) 
	{
		if(input1.length()!=input2.length())
		{
			System.out.println("NO");
			return;
		}
		int charArray[]= new int[258];
		int charArray2[]= new int[258];
		List<Character> list = new ArrayList();
		for (int i = 0; i < input1.length(); i++) 
		{
			charArray[input1.charAt(i)]++;
			charArray2[input2.charAt(i)]++;
			if(!list.contains(input1.charAt(i)))
				list.add(input1.charAt(i));
			if(!list.contains(input2.charAt(i)))
				list.add(input2.charAt(i));
		}
		for (int character :list) {
			if(Math.abs(charArray[character]-charArray2[character])>3)
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
