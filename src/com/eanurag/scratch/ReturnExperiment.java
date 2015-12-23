package com.eanurag.scratch;

public class ReturnExperiment {
	public static void main(String[] args) {
		int number = 0;

		incrementNumber(number);

		System.out.println(number);
	}

	public static void incrementNumber(int number) {

		if (number == 10) {
			System.out.println(number);
			return;
		}
		for (int i = 1; i <= 4; i++) {
			number++;
			incrementNumber(number+1);
		}
	}
}
