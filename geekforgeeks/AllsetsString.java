package geekforgeeks;

public class AllsetsString {

	public static void main(String[] args) {

		String s ="abcd";
		printSets(s);
	}

	private static void printSets(String input) 
	{
		double total = Math.pow(2, input.length());
		for (int i = 0; i < total; i++) 
		{
			StringBuffer bf = new StringBuffer();
			bf = convertBinary(i, input.length(), bf);
			System.out.print("{");
			for (int j = 0; j < bf.length(); j++) {
				
				if(bf.charAt(j)=='1')
				{
					System.out.print(input.charAt(j));
				}
			}
			System.out.println("}");
		}
	}

	private static StringBuffer convertBinary(int number, int size, StringBuffer output) 
	{
		if(number<1)
		{
			if(output.length()<size)
			{
				int diff= size-output.length();
				for (int i = 0; i < diff; i++) {
					output.append("0");
				}
			}
			return output.reverse(); 
		}
		output.append(number%2);
		number =  number/2;
		return convertBinary(number, size,output);
	}

}
