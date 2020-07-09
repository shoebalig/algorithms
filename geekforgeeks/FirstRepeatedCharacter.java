package geekforgeeks;

import java.util.Scanner;

/**
 * Given a string S. The task is to find the first repeated character in it. We
 * need to find the character that occurs more than once and whose index of
 * first occurrence is smallest. S contains only lowercase letters. Input: The
 * first line of input contains an integer T denoting the no of test cases. Then
 * T test cases follow. Each test case contains a string S.
 * 
 * Output: For each test case in a new line print the first repeating character
 * in the string. If no such character exist print -1.
 * 
 * Constraints: 1 <= T <= 100 1 <= |S| <=104
 * 
 * Example: Input: 2 geeksforgeeks hellogeeks
 * 
 * Output: e l
 * 
 * @author shoekhan
 *
 */
public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		int cases = reader.nextInt();
		if (cases < 1 || cases > 100)
			return;
		String[] numbers = new String[cases];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = reader.next();
			if (numbers[i].length() < 0 || numbers[i].length() > 10000)
				return;
		}
		for (int i = 0; i < numbers.length; i++) {
			char c =returnRepeated(numbers[i]);
			if(c!='0')
				System.out.println(c);
			else
				System.out.println("-1");
		}
	}

	private static char returnRepeated(String s) {
		boolean[] bool =  new boolean[20000];
		for (int i = 0; i < s.length(); i++) {
			int index = (int)s.charAt(i);
			if(!bool[index])
				bool[index] =  true;
			else
			{
				return s.charAt(i);
			}
		}
		return '0';
	}
}
