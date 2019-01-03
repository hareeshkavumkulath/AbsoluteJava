package com.hareesh.absolutejava.recursion;

public class RecursionDemo1 {

	public static void main(String[] args) {
		System.out.println("writeVertical(3)");
		writeVertical(3);
		
		System.out.println("writeVertical(10)");
		writeVertical(10);
		
		System.out.println("writeVertical(123)");
		writeVertical(123);
	}

	private static void writeVertical(int n) {
		if(n < 10) {
			System.out.println(n);
		}else {
			writeVertical(n/10);
			System.out.println(n%10);
		}
	}

}
