package com.eanurag.scratch;

public class WordSwap {

	public static void main(String[] args) {
		String encoded = encoding("hackerearth", 3);
		decoding(encoded, 3);
	}

	public static String encoding(String str, int k) {
		String encodedStr = "";
		char[] charArray = new char[str.length()];
		for (int i = 1; i <= k; i++) {

			int backIndex = str.length() - 1;
			int forwardIndex = 1;
			int strIndex = 0;
			int newStrIndex = 0;

			for (int j = 1; j <= (str.length() / 2); j++) {
				charArray[forwardIndex] = str.charAt(backIndex);
				backIndex--;
				forwardIndex += 2;
			}

			for (int j = 1; j <= (str.length() / 2) + 1; j++) {
				charArray[newStrIndex] = str.charAt(strIndex);
				strIndex++;
				newStrIndex += 2;

			}

			System.out.println("encoding:" + String.valueOf(charArray));
			str = String.valueOf(charArray);

		}
		encodedStr = String.valueOf(charArray);
		return encodedStr;
	}

	public static String decoding(String str, int k) {
		String decodedStr = "";
		char[] charArray = new char[str.length()];
		for (int i = 1; i <= k; i++) {

			int backIndex = 1;
			int forwardIndex = str.length() - 1;
			int strIndex = 0;
			int newStrIndex = 0;

			for (int j = 1; j <= (str.length() / 2); j++) {
				charArray[forwardIndex] = str.charAt(backIndex);
				backIndex += 2;
				forwardIndex--;
			}

			for (int j = 1; j <= (str.length() / 2) + 1; j++) {
				charArray[newStrIndex] = str.charAt(strIndex);
				strIndex += 2;
				newStrIndex++;

			}

			System.out.println("decoding:" + String.valueOf(charArray));
			str = String.valueOf(charArray);

		}
		decodedStr = String.valueOf(charArray);
		return decodedStr;
	}
}
