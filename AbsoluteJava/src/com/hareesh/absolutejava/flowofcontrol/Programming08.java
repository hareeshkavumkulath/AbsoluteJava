package com.hareesh.absolutejava.flowofcontrol;

public class Programming08 {

	public static void main(String[] args) {
		System.out.println("TOO + TOO + TOO + TOO = GOOD");
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					for(int l=0;l<=9;l++) {
						int left = 4 * (i * 100 + j * 10 + j);
						int right = k * 1000 + j * 100 + j * 10 + l;
						if(left == right) {
							System.out.println("T = " + i + ", O = " + j + ", G = " + k + ", D = " + l);
							break;
						}
					}
				}
			}
		}
	}

}
