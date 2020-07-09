package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 * reverse a number eg 2001= 1002, 200=2 , 26501 = 10562
 */
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		long []numbers = new long[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextLong();
				if(numbers[i]<1||numbers[i]>1000000000)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(reverseNumber(numbers[i]));
	    }
	}

	private static String reverseNumber(long input) {
		String output="";
		while(input>0)
		{
			long digit=input%10;
			if(digit!=0||(digit==0 && output.length()>=1))
				output = output+digit;
			input = input/10;
		}
		if(output.length()<1)
			return output+input;
		else
			return output;
	}

}
