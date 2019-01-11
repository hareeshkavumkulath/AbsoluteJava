package com.hareesh.absolutejava.trees;

public class BinaryTreeNode {
	
	public String name;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
	public BinaryTreeNode parent;
	
	public BinaryTreeNode(String name) {
		this.name = name;
		this.leftNode = null;
		this.rightNode = null;
		this.parent = null;
	}

	public BinaryTreeNode getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}

}
