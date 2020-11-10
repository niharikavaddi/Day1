package com.main;

import com.service.Swap;
import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 *
 * @author Lakshmi Neeharika
 *
 */
public class SwapMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int[] values = new int[2];
		for (int i = 0; i < values.length; i++)
			values[i] = scanner.nextInt();
		Swap swap = new Swap();
		values = swap.doSwap(values);
		System.out.println(values[0]);
		System.out.println(values[1]);
	}

}
