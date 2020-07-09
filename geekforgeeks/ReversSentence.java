package geekforgeeks;

/**
 * Reverse words in a sentence Input: quick brown fox jumps over lazy dog
 * Output: kciuq nworb xof spmuj revo yzal god
 * 
 * @author shoekhan
 *
 */
public class ReversSentence {

	public static void main(String[] args) {

		//System.out.println(3 & 2);
		System.out.println(reverseWord("quick brown fox jumps over lazy dog"));

	}

public static String reverseWord(String sentence) 
{
	StringBuffer output=new StringBuffer();
	String [] words = sentence.split(" ");
	for (String word: words) 
	{
		output.append(new StringBuffer(word).reverse()).append(" ");
	}
	return  output.toString().trim();
}
}
