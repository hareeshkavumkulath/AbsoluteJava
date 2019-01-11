package com.hareesh.absolutejava.pct;

import java.util.Scanner;

public class TranscriptName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		String[] names = name.split(" ");
		if(names.length == 3) {
			System.out.println(names[2] + " " + names [0] + " " + names[1]);
		}else if(names.length == 2) {
			System.out.println(checkSurname(names));
		}else if(names.length == 1) {
			System.out.println(name);
		}
	}

	private static String checkSurname(String[] names) {
		String surname = names[0];
		String firstName = names[1];
		if(names[1].endsWith("a") || names[1].endsWith("e") || names[1].endsWith("i") ||
				names[1].endsWith("o") || names[1].endsWith("u")) {
			surname = names[1];
			firstName = names[0];
		}
		return surname + " " + firstName;
	}

}
