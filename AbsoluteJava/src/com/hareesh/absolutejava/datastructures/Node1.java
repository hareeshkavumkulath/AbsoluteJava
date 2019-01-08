package com.hareesh.absolutejava.datastructures;

public class Node1 {

	public String item;
	public int count;
	public Node1 link;
	
	public Node1() {
		link = null;
		item = null;
		count = 0;
	}
	
	public Node1(String item, int count, Node1 link) {
		setData(item, count);
		this.link = link;
	}

	public void setData(String item, int count) {
		this.item = item;
		this.count = count;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the link
	 */
	public Node1 getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(Node1 link) {
		this.link = link;
	}
		
}
