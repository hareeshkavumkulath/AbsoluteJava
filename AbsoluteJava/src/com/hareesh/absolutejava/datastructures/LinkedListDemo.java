package com.hareesh.absolutejava.datastructures;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		/*LinkedList<Node1> list = new LinkedList<Node1>();
		list.*/
		LinkedList1 list = new LinkedList1();
		list.addToStart("Apples", 1);
		list.addToStart("Banana", 2);
		list.addToStart("Cantaloupe", 3);
		System.out.println("List has " + list.size() + " nodes");
		list.outputList();
		if(list.contains("Cantaloupe")) {
			System.out.println("Cantaloupe is on the list");
		}else {
			System.out.println("Cantaloupe is NOT on the list");
		}
		list.deleteHeadNode();
		if(list.contains("Cantaloupe")) {
			System.out.println("Cantaloupe is on the list");
		}else {
			System.out.println("Cantaloupe is NOT on the list");
		}
	}

}
