package com.service;

public class Average {
	public float calculate(float[] values, int size) {
		float sum = 0;
		for (int i = 0; i < values.length; i++)
			sum += values[i];
		return (sum / size);
	}
}
