package com.hareesh.absolutejava.datastructures;

public class LinkedList1 {

	private Node1 head;
	
	public LinkedList1() {
		head = null;
	}
	
	public void addToStart(String itemName, int itemCount) {
		head = new Node1(itemName, itemCount, head);
	}
	
	public boolean deleteHeadNode() {
		if(head != null) {
			head = head.getLink();
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		int count = 0;
		Node1 position = head;
		while(position != null) {
			count++;
			position = position.getLink();
		}
		return count;
	}
	
	public boolean contains(String itemName) {
		boolean contains = false;
		Node1 item = null;
		Node1 position = head;
		while(position != null) {
			if(position.getItem().equals(itemName)) {
				contains = true;
				item = position;
			}
			position = position.getLink();
		}
		return contains;
	}
	
	public void outputList() {
		Node1 position = head;
		while(position != null) {
			System.out.println(position.getItem() + "-" + position.getCount());
			position = position.getLink();
		}
	}
	
	public boolean clear() {
		Node1 position = head;
		while(position != null) {
			System.out.println(position.getItem() + "-" + position.getCount());
			position = position.getLink();
		}
		return false;
	}
	
}
