package geekforgeeks;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>19)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<0||numbers[i]>18)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(factorial(numbers[i]));
	    }
	}

	private static long factorial(int input) 
	{
		if(input==0)
			return 1;
		long fact = 1;
		while(input>0)
		{
			fact=fact*input;
			input=input-1;
		}
		return fact;
	}

}
