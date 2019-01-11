package com.hareesh.absolutejava.pct;

import java.util.Scanner;

public class HorizontalVertical {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = Integer.parseInt(in.next());
		int H = Integer.parseInt(in.next());
		String[] vLines = new String[V];
		String[] hLines = new String[H];
		in.nextLine();
		for(int i=0;i<V;i++) {
			vLines[i] = in.nextLine();
		}
		for(int i=0;i<H;i++) {
			hLines[i] = in.nextLine();
		}
		int count = 0;
		for(int i=0;i<V;i++) {
			String[] vLinesString = vLines[i].split(" ");
			int VX = Integer.parseInt(vLinesString[0]);
			int VY1 = Integer.parseInt(vLinesString[1]);
			int VY2 = Integer.parseInt(vLinesString[2]);
			for(int j=0;j<H;j++) {
				String[] hLinesString = hLines[j].split(" ");
				int HY = Integer.parseInt(hLinesString[0]);
				int HX1 = Integer.parseInt(hLinesString[1]);
				int HX2 = Integer.parseInt(hLinesString[2]);
				if(HX1 <= VX && VX <= HX2 && VY1 <= HY && HY <= VY2) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
