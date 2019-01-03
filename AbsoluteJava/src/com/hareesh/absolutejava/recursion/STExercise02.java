package com.hareesh.absolutejava.recursion;

public class STExercise02 {

	public static void main(String[] args) {
		printAsterik(5);
	}
	
	public static void printAsterik(int n) {
		if(n == 1) {
			System.out.print("*");
		}else {
			printAsterik(n-1);
			System.out.print("*");
		}
	}

}
