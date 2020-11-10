package com.main;

/**
 *
 * Write a Program which finds the longest word from a sentence. Your program should read a sentence as input from user and return the longest word. In case there are two words of maximum length return the word which comes first in the sentence. 
 * @author Lakshmi Neeharika
 */
import java.util.Scanner;
import com.service.LongestWord;

public class LongestWordMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sentence");
		String value = scanner.nextLine();
		System.out.println(LongestWord.getLargestWord(value));
	}

}
