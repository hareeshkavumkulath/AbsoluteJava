package com.hareesh.absolutejava.pct;

import java.util.Scanner;

public class GameOfLife {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = Integer.parseInt(in.next());
		int C = Integer.parseInt(in.next());
		in.nextLine();
		char[][] organisms = new char[R][C];
		for(int i=0;i<R;i++) {
			String input = in.nextLine();
			organisms[i] = input.toCharArray();
			//System.out.println(input.toCharArray());
		}
		//System.out.println(organisms.length);
		int N = in.nextInt();
		
		for(int i=0;i<N;i++) {
			organisms = processGame(R, C, organisms);
		}
		
		System.out.println(countLives(R, C, organisms));
		
		
		/*for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(organisms[i][j] + " ");
			}
			System.out.println();
		}*/
		
		
	}
	
	private static int countLives(int R, int C, char[][] organisms) {
		int count = 0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(organisms[i][j] == '@') {
					count++;
				}
			}
		}
		return count;
	}

	public static char[][] processGame(int R, int C, char[][] organisms) {
		char[][] newOrganisms = new char[R][C];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				int count = 0;
				if(i - 1 >= 0 && j - 1 >= 0) {
					if(organisms[i - 1][j - 1] == '@') {
						count++;
					}
				}
				if(i - 1 >= 0) {
					if(organisms[i - 1][j] == '@') {
						count++;
					}
				}
				if(i - 1 >= 0 && j + 1 < C) {
					if(organisms[i - 1][j + 1] == '@') {
						count++;
					}
				}
				if(i + 1 < R && j - 1 >= 0) {
					if(organisms[i + 1][j - 1] == '@') {
						count++;
					}
				}
				if(i + 1 < R) {
					if(organisms[i + 1][j] == '@') {
						count++;
					}
				}
				if(i + 1 < R && j + 1 < C) {
					if(organisms[i + 1][j + 1] == '@') {
						count++;
					}
				}
				if(j - 1 >= 0) {
					if(organisms[i][j-1] == '@') {
						count++;
					}
				}
				if(j + 1 < C) {
					if(organisms[i][j+1] == '@') {
						count++;
					}
				}
				if(organisms[i][j] == '#') {
					if(count == 3) {
						newOrganisms[i][j] = '@';
					}else {
						newOrganisms[i][j] = '#';
					}
				}else {
					if(count < 2) {
						newOrganisms[i][j] = '#';
					}else if(count < 4) {
						newOrganisms[i][j] = '@';
					}else if(count >= 4) {
						newOrganisms[i][j] = '#';
					}else {
						newOrganisms[i][j] = '#';
					}
				}
			}
		}
		return newOrganisms;		
	}

}
