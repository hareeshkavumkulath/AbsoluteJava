package com.hareesh.absolutejava.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(powerOf(2, 3));
		System.out.println(powerOf(2, -3));
	}
	
	public static double powerOf(double m, double n) {
		if(n >= 0) {
			if(n == 0) {
				return 1;
			}else {
				return m * powerOf(m, n - 1);
			}
		}else {
			if(n == -1) {
				return (1/m);
			}else {
				return (1/m) * powerOf(m, (n+1));
			}
		}
	}

}
