package com.main;

import java.util.Scanner;

import com.service.Prime;

/**
 *
 * Write a java program, which will take a number variable and check whether the
 * number is prime or not.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class PrimeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int value = scanner.nextInt();
		Prime prime = new Prime();
		System.out.println(prime.primeCheck(value));

	}

}
