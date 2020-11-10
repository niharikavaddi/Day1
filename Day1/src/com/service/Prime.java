package com.service;

public class Prime {
	public String primeCheck(int value) {
		String result = "PRIME NUMBER";
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				result = "NOT A PRIME NUMBER";
				break;
			}
		}
		return result;
	}
}
