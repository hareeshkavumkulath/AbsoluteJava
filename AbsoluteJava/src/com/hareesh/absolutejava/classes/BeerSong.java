package com.hareesh.absolutejava.classes;

import java.util.Scanner;

public class BeerSong {
	
	public static int n;
	
	public BeerSong(int n) {
		if(n<0)
			this.n = 0;
		else if(n>99)
			this.n = 99;
		else
			this.n = n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of bottles");
		int n = in.nextInt();
		BeerSong obj = new BeerSong(n);
		System.out.println(obj.printSong());
		//System.out.println(obj.digitToString(n));
	}
	
	private String printSong() {
		String song = "";
		for(int i=n;i>=0;i--) {
			song = song + digitToString(i) + " bottles of beer on the wall\n";
			song = song + digitToString(i) + " bottles of beer\n";
			song = song + "Take one down pass it around\n";
		}
		return song;
	}

	public String digitToString(int n) {
		String number = "zero";
		int tenth = n/10;
		int oneth = n%10;
		String first = null, second = null;
		if(tenth > 1) {
			if(tenth == 2)
				first = "twenty";
			else if(tenth == 3)
				first = "thirty";
			else if(tenth == 4)
				first = "fourty";
			else if(tenth == 5)
				first = "fifty";
			else if(tenth == 6)
				first = "sixty";
			else if(tenth == 7)
				first = "seventy";
			else if(tenth == 8)
				first = "eighty";
			else if(tenth == 9)
				first = "ninety";
		}
		if(oneth > 0) {
			if(oneth == 1)
				second = "one";
			else if(oneth == 2)
				second = "two";
			else if(oneth == 3)
				second = "three";
			else if(oneth == 4)
				second = "four";
			else if(oneth == 5)
				second = "five";
			else if(oneth == 6)
				second = "six";
			else if(oneth == 7)
				second = "seven";
			else if(oneth == 8)
				second = "eight";
			else
				second = "nine";
		}
		if(tenth == 1) {
			if(oneth == 1)
				number = "elevan";
			else if(oneth == 2)
				number = "twelve";
			else if(oneth == 3)
				number = "thirteen";
			else if(oneth == 4)
				number = "fourteen";
			else if(oneth == 5)
				number = "fifteen";
			else if(oneth == 6)
				number = "sixteen";
			else if(oneth == 7)
				number = "seventeen";
			else if(oneth == 8)
				number = "eighteen";
			else if(oneth == 9)
				number = "nineteen";
			else
				number = "ten";
		}
		if(tenth == 0 && oneth > 0) {
			number = second;
		}else if(tenth > 1 && oneth == 0) {
			number = first;
		}else if(tenth > 1 && oneth > 0){
			number = first + "-" + second;
		}
		return number;
	}

}
