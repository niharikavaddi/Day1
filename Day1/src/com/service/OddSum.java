package com.service;

public class OddSum {
	public static String CheckSum(int number) {
		int sum = 0;
		String[] values = (String.valueOf(number)).split("");
		for (int i = 0; i < values.length; i++) {
			if (Integer.parseInt(values[i]) % 2 != 0)
				sum += Integer.parseInt(values[i]);
		}
		if (sum % 2 == 0)
			return "Sum of the odd digits is even";
		else
			return "Sum of the odd digits is odd";
	}
}
