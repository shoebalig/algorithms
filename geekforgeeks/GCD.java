package geekforgeeks;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>30)
			return;
		int []numbers = new int[cases*2];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<1||numbers[i]>1000)
					return;
	    }
		for(int i=0;i<numbers.length;i=i+2)
	    {
				System.out.println(getGCD(numbers[i],numbers[i+1]));
	    }
	}

	private static int getGCD(int input1, int input2) {
		int lastGCD=1;
		int count=2;
		int startMinValue=input1;
		if(input1>input2)
			startMinValue=input2;
		while(count<=startMinValue)
		{
			if(input1%count==0 && input2%count==0)
				lastGCD=count;
			count++;
		}
		return lastGCD;
	}
}
