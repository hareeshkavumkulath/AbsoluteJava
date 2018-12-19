package com.hareesh.absolutejava.arrays;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[] scores = new float[7];
		System.out.println("Enter Degree of difficulty:");
		float degreeOfDifficulty = in.nextFloat();
		System.out.println("Enter judge's scores");
		for(int i=0;i<7;i++) {
			scores[i] = in.nextFloat();
		}
		System.out.println("Entered scores are, ");
		for(int i=0;i<7;i++) {
			System.out.println(scores[i]);
		}		
	}

}
