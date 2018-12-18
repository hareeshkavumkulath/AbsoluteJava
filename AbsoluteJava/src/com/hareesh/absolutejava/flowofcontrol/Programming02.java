package com.hareesh.absolutejava.flowofcontrol;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Programming02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		boolean isWin = false;
		int win = 0;
		int lose = 0;
		String player1 = in.nextLine();
		System.out.println("Player: " + player1);
		for(int i=0;i<10000;i++) {
			isWin = false;
			System.out.println("Player's come out roll results");
			int dice11 = rand.nextInt(6) + 1;
			int dice12 = rand.nextInt(6) + 1;
			System.out.println("Dice1: " + dice11 + ", Dice2: " + dice12);
			int comeOutRoll1 = dice11 + dice12;
			System.out.println("Come out rule: " + comeOutRoll1);
			if(comeOutRoll1 == 7 || comeOutRoll1 == 11) {
				System.out.println(player1 + " wins");
				win++;
				isWin = true;
			}else {
				while(!isWin) {
					dice11 = rand.nextInt(6) + 1;
					dice12 = rand.nextInt(6) + 1;
					int newComeOutRoll = dice11 + dice12;
					if(newComeOutRoll == comeOutRoll1) {
						System.out.println(player1 + " wins");
						isWin = true;
						win++;
					}else if(newComeOutRoll == 7){
						System.out.println(player1 + " loses");
						isWin = true;
						lose++;
					}
				}
			}
		}
		double percentage = new Double(win) / new Double(10000);
		DecimalFormat format = new DecimalFormat("0.00%");
		System.out.println("Result is " + format.format(percentage));
	}

}
