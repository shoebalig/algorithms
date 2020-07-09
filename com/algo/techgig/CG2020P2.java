package pack;

import java.util.Arrays;
import java.util.Scanner;



public class CG2020P2 {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	try {
		int cases = reader.nextInt();
		if(cases<1||cases>10000000)
			return;
		for (int i = 0; i < cases; i++) 
		{
			int teamSize = reader.nextInt();
			if(teamSize<1||teamSize>Long.MAX_VALUE)
			{
				return;
			}
			long [] teamA = new long[teamSize];
			long [] teamB = new long[teamSize];
			for(int j=0;j<teamA.length;j++)
		    {
				teamA[j]=reader.nextInt();
		    }
			for(int j=0;j<teamB.length;j++)
		    {
				teamB[j]=reader.nextInt();
		    }
			Arrays.parallelSort(teamA);
			Arrays.parallelSort(teamB);
			System.out.println(getMaxWins(teamA, teamB));
		}
	}
	finally {
		reader.close();
	}
		
	}

	private static long getMaxWins(long[] teamA, long[] teamB) 
	{
		long count = 0;
		int i=0,j=0;
		for ( ;i < teamA.length && j<teamB.length;) {
			if(teamA[i]>teamB[j])
			{
				count++;
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		return count;
	}
}
