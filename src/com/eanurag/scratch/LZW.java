package com.eanurag.scratch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LZW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lzwEncoding("TOBEORNOTTOBEORTOBEORNOT"));

	}

	public static List<Integer> lzwEncoding(String uncompressed) {
		int MAX_LENGTH = 256;

		Map<String, Integer> dictionary = new HashMap<String, Integer>();

		for (int i = 0; i < MAX_LENGTH; i++) {
			dictionary.put("" + (char) i, i);
		}

		List<Integer> result = new ArrayList<Integer>();

		String w = "";
		for (char c : uncompressed.toCharArray()) {
			String wc = w + c;
			if (dictionary.containsKey(wc)) {
				w = wc;
			} else {
				result.add(dictionary.get(w));
				dictionary.put(wc, MAX_LENGTH++);
				w = "" + c;

			}
		}

		if (!w.equals("")) {
			result.add(dictionary.get(w));
		}

		return result;
	}

}
