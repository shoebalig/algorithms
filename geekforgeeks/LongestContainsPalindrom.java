package geekforgeeks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Raja loves Strings especially palindromes. Palindromes are strings that read
 * the same when read forward or backwards. Here only the palindromes of even
 * length (maybe 0) will be considered. His teacher gave him a long string
 * consisting of only digits as a gift on his birthday. Now Raja wants to know
 * the longest sub-array whose elements (i.e digits) can be rearranged to form a
 * palindrome of even length. Raja is unable to figure out the solution to the
 * problem so he asks for your help.
 * 
 * 
 * Input Format You need to read first and only line of input consists of S.
 * 
 * 
 * Constraints 1 <= |S| <= 100000
 * 
 * Output Format You must print a single integer denoting the length of longest
 * sub-array whose elements (digits) can be rearranged to form a palindrome of
 * even length. If no such sub-array can be found return 0.
 * 
 * 
 * Sample TestCase 1 Input 12345354987 Output 6 Explanation Here the longest
 * sub-array is 345354 which can be rearranged to form 345543 which is a
 * palindrome of even length 6. Hence the answer is 6. Sample TestCase 2 Input
 * 12345 Output 0
 * 
 * @author shoekhan
 *
 */
public class LongestContainsPalindrom {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String numbers = reader.next();
		System.out.print(getLenth(numbers));
	}


	private static int getLenth(String number) {
		Map<Character, Integer> map = new LinkedHashMap <Character, Integer>(); 
		char[] digits = number.toCharArray();
		int currentIndex = -1;
		int startIndex = -1;
		int lastMax = 0;
		for (int i = 0; i < digits.length; i++) 
		{
			if(map.containsKey(digits[i]))
			{
				map.put(digits[i],map.get(digits[i])+1);
				if(startIndex >= 0)
				{
					currentIndex =i;
					int tmp=(currentIndex-startIndex)+1;
					if(lastMax<tmp)
						lastMax = tmp;
				}
				else
				{
					startIndex =i;
				}
			}
			else
			{
				map.put(digits[i],1);
				if(currentIndex >=0)
				{
					currentIndex =0;
				}
			}
		}
		return lastMax*2;
	}
}
