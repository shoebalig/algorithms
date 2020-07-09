package com.algo.dynamic;

public class Smallestdivnumber {
	public static void main(String[] args) {
		boolean isGood = true;
		int x=10;
		for (int i = 1; i <= x; i++) {
		    if (x % i != 0) {
		        isGood = false;
		        break;
		    }
		}
		if (isGood) {
		    System.out.println(x);
		}
	}

}
