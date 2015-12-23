package com.eanurag.scratch;

public class StringPermutationWithRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dictionary = "abc";
		printPermutation(dictionary, "");

	}

	public static void printPermutation(String str, String stringToPrint) {
		System.out.println("The permutation now is: "+stringToPrint);
		
		if (str.length() == stringToPrint.length()) {
			System.out.println(stringToPrint);
			return;
		}
		
		if(stringToPrint.equals("b")){
			System.exit(0);
		}

		for (int i = 0; i < str.length(); i++) {
			printPermutation(str, stringToPrint + str.charAt(i));
		}
	}

}
