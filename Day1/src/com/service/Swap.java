package com.service;

public class Swap {
	public int[] doSwap(int[] values) {
		int temp = values[0];
		values[0] = values[1];
		values[1] = temp;
		return values;

	}
}
