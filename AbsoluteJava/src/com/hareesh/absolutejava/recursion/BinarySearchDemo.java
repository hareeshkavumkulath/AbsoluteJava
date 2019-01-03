package com.hareesh.absolutejava.recursion;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] a = { 15, 20, 35, 41, 57, 63, 75, 80, 85, 90, 32};
		int key = 10;
		int firstIndex = 0;
		int finalIndex = a.length - 1;
		Arrays.sort(a);
		System.out.println(search(a, key, firstIndex, finalIndex));
	}

	private static int search(int[] a, int key, int firstIndex, int finalIndex) {
		int mid = firstIndex + ((finalIndex - firstIndex) / 2);
		if(finalIndex >= firstIndex) {
			if(a[mid] == key) {
				return mid;
			}else {
				if(a[mid] < key) {
					firstIndex = mid + 1;
				}else {
					finalIndex = mid - 1;
				}
				return search(a, key, firstIndex, finalIndex);
			}
		}else {
			return -1;
		}
	}

}
