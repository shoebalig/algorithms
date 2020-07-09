package geekforgeeks;

public class GCD_Recursion {

	public static void main(String[] args) {
		System.out.println(getGcd(12,18));
	}

	private static int getGcd(int a, int b) {
		if(a==0)
		return b; 
		return getGcd(b%a,a);
	}

}
