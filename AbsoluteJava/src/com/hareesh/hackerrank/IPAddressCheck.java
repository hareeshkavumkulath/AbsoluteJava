package com.hareesh.hackerrank;

import java.util.Scanner;

public class IPAddressCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ipAddress = in.nextLine();
		System.out.println(checkIPAddress(ipAddress));
	}

	private static boolean checkIPAddress(String ipAddress) {
		boolean isIPAddress = true;
		System.out.println(ipAddress.endsWith("."));
		if(ipAddress.startsWith(".") || ipAddress.endsWith(".")){
			isIPAddress = false;
		}else {
			String[] points = ipAddress.split("\\.");
			if(points.length != 4) {
				System.out.println("length is not 4");
				isIPAddress = false;
			}else {
				System.out.println("length is 4");
				for(int i = 0;i<points.length;i++) {
					try {
						int temp = Integer.parseInt(points[i]);
						if(temp < 0 || temp > 255) {
							isIPAddress = false;
						}
					}catch(Exception e) {
						isIPAddress = false;
					}
				}
			}
		}
		return isIPAddress;
	}

}
