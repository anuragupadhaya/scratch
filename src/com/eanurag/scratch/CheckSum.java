package com.eanurag.scratch;

import java.util.ArrayList;
import java.util.List;

public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfFibs(1000, 100));

	}

	public static List<Integer> sumOfFibs(int limit, int num) {
		int fib1 = 1;
		int fib2 = 2;

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(fib1);
		numbers.add(fib2);

		for (int i = 3; i < 1000; i++) {
			int fib = fib1 + fib2;
			System.out.println((fib));
			numbers.add(fib);
			fib1 = fib2;
			fib2 = fib;
			
			int sum = 0;
			for (Integer n : numbers) {
				sum = sum + n;
			}
			System.out.println("sum=" + sum);
			if (sum == num) {
				break;
			}
		}

		return numbers;
	}

}
