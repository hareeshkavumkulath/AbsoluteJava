package com.hareesh.absolutejava.flowofcontrol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the price of the item:");
		double price = in.nextDouble();
		System.out.println("Enter the inflation(percent)");
		double inflation = in.nextDouble();
		System.out.println("Enter how many years:");
		int years = in.nextInt();
		double newPrice = price;
		for(int i=1;i<=years;i++) {
			System.out.print("After " + i + " years is ");
			newPrice = newPrice + (newPrice * (inflation/100));
			DecimalFormat format = new DecimalFormat("$0.00");
			System.out.println(format.format(newPrice));
		}
	}

}
