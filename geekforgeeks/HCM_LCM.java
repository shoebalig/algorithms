package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 * Least common multiplier and highest common factor of 2 numbers 5 10= 10 5 and for 14 8= 56 2
 */
public class HCM_LCM {

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
				System.out.println(getLCM(numbers[i],numbers[i+1])+" "+getHCF(numbers[i],numbers[i+1]));
	    }
	}

	private static int getLCM(int input1, int input2) 
	{
		int count=2;
		int startMinValue=input1;
		if(input1>input2)
			startMinValue=input2;
		int tmp= startMinValue;
		while(startMinValue<=input1*input2)
		{
			if(startMinValue%input1==0 && startMinValue%input2==0)
				return startMinValue;
			startMinValue=tmp*count;
			count++;
		}
		return 1;
	}

	private static int getHCF(int input1, int input2) {
		if(input2==1||input1==1)
			return 1;
		int count=2;
		while(count<=input1 && count<=input2)
		{
			if(input1%count==0 && input2%count==0)
				return count;
			count++;
		}
		return 1;
	}

}
