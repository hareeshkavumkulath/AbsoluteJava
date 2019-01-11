package com.hareesh.absolutejava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(57);
		list.add(42);
		for(int i : list) {
			System.out.println(i);
		}
		Collections.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
	}

}
