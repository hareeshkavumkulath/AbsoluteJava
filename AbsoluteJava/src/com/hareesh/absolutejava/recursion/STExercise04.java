package com.hareesh.absolutejava.recursion;

public class STExercise04 {

	public static void main(String[] args) {
		printNumbers(5);
	}
	
	public static void printNumbers(int n) {
		if(n == 1) {
			System.out.print(n);
		}else {
			System.out.print(n+ ", ");
			printNumbers(n - 1);
		}
	}

}
