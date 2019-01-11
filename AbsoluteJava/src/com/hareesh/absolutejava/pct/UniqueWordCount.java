package com.hareesh.absolutejava.pct;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] words = line.split(" ");
		Set<String> hashSet = new HashSet<String>();
		for(int i=0;i<words.length;i++) {
			if(!words[i].equals("")) {
				hashSet.add(words[i].toUpperCase());
			}
		}
		System.out.println(hashSet.size());
	}

}
