package com.hareesh.absolutejava.arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Programming02 {
	
	public static int[][] memory = new int[4][4];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Programming02 obj = new Programming02();
		obj.shuffle();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(memory[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void shuffle() {
		
	}

}
