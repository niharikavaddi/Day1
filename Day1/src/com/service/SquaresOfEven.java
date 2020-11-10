package com.service;

public class SquaresOfEven {
	public static int sumOfSquaresOfEvenDigits(int number) {
		int sum = 0;
		String[] values = (String.valueOf(number)).split("");
		for (int i = 0; i < values.length; i++) {
			if (Integer.parseInt(values[i]) % 2 == 0) {
				sum += (Integer.parseInt(values[i]) * Integer.parseInt(values[i]));
			}
		}
		return sum;
	}
}
