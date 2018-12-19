package com.hareesh.absolutejava.classes;

import java.util.Scanner;

public class Fraction {
	
	public static int numerator;
	public static int denominator;
	
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int denom = in.nextInt();
		Fraction fraction = new Fraction(num, denom);
		System.out.println(fraction.getFraction());
		System.out.println(fraction.leastTerms());
	}
	
	private String leastTerms() {
		String leastTerms = null;
		leastTerms = numerator/HCF() + "/" + denominator/HCF();
		return leastTerms;
	}

	private double getFraction() {
		double fract = new Double(numerator) / new Double(denominator);
		return fract;
	}
	
	private int HCF() {
		int hcf = 1;
		int leastNumber;
		if(numerator > denominator)
			leastNumber = denominator;
		else
			leastNumber = numerator;
		for(int i=2;i<=leastNumber;i++) {
			if((numerator%i == 0) && (denominator%i==0))
				hcf = i;
		}
		return hcf;
	}

}
