package com.eanurag.scratch;

import java.util.Arrays;

public class SumInArray {

	public static void main(String[] args) {

		int[] a = { 0, 1, 36, 42, 17, 24, 18, 89, 90 };

		Arrays.sort(a);

		for (int i : a) {
			System.out.println(i);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				for (int k = 0; k < a.length; k++) {
					if (a[i] == a[j] + a[k]) {
						System.out.print("true");
						System.out.println("(" + a[j] + "," + a[k] + ")");
					}

				}
			}
		}

	}

}
