package com.hareesh.absolutejava.pct;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Hashing {
	
	public static Hashtable<Integer, Integer> hashT = new Hashtable<Integer, Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		boolean cont = true;
		while(cont) {
			int temp = Integer.parseInt(in.next());
			if(temp == -1) {
				cont = false;
			}
			else {
				numbers.add(temp);
			}
		}
		for(int i=0;i<numbers.size();i++) {
			int j = computeJ(numbers.get(i), N);
			System.out.println();
			hashT.put(j, numbers.get(i));
		}
	}

	private static int computeJ(int number, int n) {
		boolean occupied = true;
		int j = 0;
		while(occupied) {
			j = number % n;
			if(hashT.containsKey(j)) {
				System.out.print(j + " ");
				while(hashT.containsKey(j)) {
					int right = number % 10;
					number = number / 10;
					j = number % n;
					if(right % 2 == 0) {
						j = j - right;
						if(j < 0) {
							j = number - j;
						}
						System.out.print(j + " ");
					}else {
						j = j + right;
						if(j >= number) {
							j = j - number;
						}
						System.out.print(j + " ");
					}
					if(!hashT.containsKey(j)) {
						occupied = false;
					}
				}
			}else {
				System.out.print(j + " ");
				occupied = false;
			}
		}
		return j;
	}

}
