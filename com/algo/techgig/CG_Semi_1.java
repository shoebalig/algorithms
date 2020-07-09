package pack;

import java.util.Scanner;

public class CG_Semi_1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>10)
			return;
		int housesCount =0;
		for(int i=0;i<cases;i++)
	    {
				housesCount = reader.nextInt();
				if(housesCount<1||housesCount>10000)
					return;
					int []ticketArray = new int[housesCount];
					for (int j = 0; j < ticketArray.length; j++) 
					{
						ticketArray[j] = reader.nextInt();
						if(ticketArray[j]<-1000||ticketArray[j]>1000)
							return;
					}
					System.out.println();
	    }
}
}
