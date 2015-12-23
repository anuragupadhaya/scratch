package com.eanurag.jollybeeoj;

import java.util.HashMap;
import java.util.Map;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words;
		Map<Integer, Integer> wordsMap = new HashMap<Integer, Integer>();

		int numberOfCases = Integer.valueOf(args[0]);
		for (int i = 0; i < numberOfCases; i++) {
			int numberOfWords = Integer.valueOf(args[i + 1]);
			words = new String[numberOfWords];
			i = i + numberOfWords;
			for (int j = 0; j < numberOfWords; j++) {
				words[j] = args[j + 2];
			}

			for (String s : words) {
				if (wordsMap.containsKey(s.length()))
					wordsMap.put(s.length(), wordsMap.get(s.length()) + 1);
				else
					wordsMap.put(s.length(), 1);
			}

			System.out.println("Case #" + i + " ");
			for (Integer in : wordsMap.keySet())
				System.out.print(wordsMap.get(in));

		}
	}
}
