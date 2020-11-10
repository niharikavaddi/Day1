package com.service;

public class LongestWord {
	public static String getLargestWord(String value) {
		String[] values = value.split(" ");
		String word = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].length() > word.length())
				word = values[i];
		}
		return word;
	}
}
