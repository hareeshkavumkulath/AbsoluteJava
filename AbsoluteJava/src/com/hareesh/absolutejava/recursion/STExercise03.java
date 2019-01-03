package com.hareesh.absolutejava.recursion;

public class STExercise03 {

	public static void main(String[] args) {
		reverseNumber(1234);
	}
	
	public static void reverseNumber(int n) {
		if(n < 10) {
			System.out.print(n);
		}else {
			System.out.print(n%10);
			reverseNumber(n/10);
		}
	}

}
