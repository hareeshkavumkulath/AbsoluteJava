package com.hareesh.absolutejava.flowofcontrol;

import java.util.Scanner;

public class Programming07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for n");
		int n = in.nextInt();
		System.out.println("Enter value for x");
		int x = in.nextInt();
		double eOfx = 1 + x;
		for(int i=2;i<=n;i++) {
			eOfx = eOfx + powerOf(i, x)/factorial(i);
		}
		System.out.println(eOfx);
	}
	
	public static double factorial(int n) {
		double factorial = 1;
		for(int i=2;i<=n;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	public static double powerOf(int n, int x) {
		double power = x;
		for(int i=2;i<=n;i++) {
			power = power * x;
		}
		return power;
	}

}
