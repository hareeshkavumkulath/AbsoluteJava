package com.hareesh.absolutejava.trees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeDemo {
	
	public static BinaryTreeNode root = null;
	public static ArrayList<BinaryTreeNode> nodes = new ArrayList<BinaryTreeNode>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numLines = in.nextInt();
		in.nextLine();
		ArrayList<String> lines = new ArrayList<String>();
		for(int i=0;i<numLines;i++) {
			lines.add(in.nextLine());
		}
		for(int i=0;i<lines.size();i++) {
			String[] nodeNames = lines.get(i).split(" ");
			if(nodes.isEmpty()) {
				root = new BinaryTreeNode(nodeNames[0]);
				BinaryTreeNode leftNode = new BinaryTreeNode(nodeNames[1]);
				root.setLeftNode(leftNode);
				nodes.add(root);
				nodes.add(leftNode);
			}else {
				BinaryTreeNode parent = findNode(nodeNames[0]);
				if(parent != null) {
					BinaryTreeNode child = new BinaryTreeNode(nodeNames[1]);
					if(parent.getLeftNode() == null) {
						parent.setLeftNode(child);
					}else {
						parent.setRightNode(child);
					}
					nodes.add(child);
				}
			}
		}
		printPreOrder(root);
		System.out.println();
		printInOrder(root);
		System.out.println();
		printPostOrder(root);
		System.out.println();
		
		System.out.println(size(root));
	}	
	
	private static int size(BinaryTreeNode node) {
		if(node == null)
			return 0;
		else {
			return size(node.getLeftNode()) + 1 + size(node.getRightNode());
		}
	}

	private static void printInOrder(BinaryTreeNode node) {
		if(node == null)
			return;
		else {
			printInOrder(node.getLeftNode());
			System.out.print(node.getName() + " ");
			printInOrder(node.getRightNode());
		}
		
	}
	
	private static void printPostOrder(BinaryTreeNode node) {
		if(node == null) {
			return;
		}else {
			printPostOrder(node.getLeftNode());
			printPostOrder(node.getRightNode());
			System.out.print(node.getName() + " ");
		}
	}
		
	private static void printPreOrder(BinaryTreeNode node) {
		if(node == null) {
			return;
		}else {
			System.out.print(node.getName() + " ");
			printPreOrder(node.getLeftNode());
			printPreOrder(node.getRightNode());
		}
	}

	private static BinaryTreeNode findNode(String string) {
		BinaryTreeNode node = null;
		for(int i=0;i<nodes.size();i++) {
			if(nodes.get(i).getName().equals(string)){
				node = nodes.get(i);
			}
		}
		return node;
	}

}
