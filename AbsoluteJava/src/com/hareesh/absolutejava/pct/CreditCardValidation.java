package com.hareesh.absolutejava.pct;

import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cardNumber = in.nextLine();
		int sum = 0;
		char[] charNumbers = cardNumber.toCharArray();
		int[] numbers = new int[charNumbers.length];
		for(int i=0;i<charNumbers.length;i++) {
			numbers[i] = Integer.parseInt(""+charNumbers[i]);
		}
		for(int i=0;i<numbers.length;i++) {
			if(i%2 == 0) {
				sum = sum + numbers[i];
			}else {
				int product = numbers[i] * 2;
				sum = sum + (product / 10) + (product % 10);
			}
		}
		if(sum % 10 == 0) {
			System.out.println("VALID");
		}else {
			System.out.println("INVALID");
		}
	}

}
