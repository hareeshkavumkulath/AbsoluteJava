package com.hareesh.absolutejava.flowofcontrol;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the gender of the child(Enter M or m for Male, F or f for Female");
		String gender = in.nextLine();
		System.out.println("Enter height of the father(in inches):");
		int heightF = in.nextInt();
		System.out.println("Enter height of the mother(in inches):");
		int heightM = in.nextInt();
		int heightC;
		if(gender.equalsIgnoreCase("M")) {
			heightC = (heightM * 13/12 + heightF) / 2;
		}else {
			heightC = (heightF * 12/13 + heightM) / 2;
		}
		System.out.println("Height of the child is " + heightC);
	}

}
