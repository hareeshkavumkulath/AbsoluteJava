package com.hareesh.absolutejava.trees;

import java.util.ArrayList;
import java.util.Scanner;

public class AVLTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		do {
			n = in.nextInt();
			if(n > 0)
				numbers.add(n);
		}while(n >= 0);
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
	}

}
