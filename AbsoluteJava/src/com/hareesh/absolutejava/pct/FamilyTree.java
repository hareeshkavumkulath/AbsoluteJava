package com.hareesh.absolutejava.pct;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyTree {
	
	public static ArrayList<FamilyNode> familyNodes = new ArrayList<FamilyNode>();
	public static FamilyNode root = null;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<String>();
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0;i<n;i++) {
			lines.add(in.nextLine());
		}
		int c = in.nextInt();
		in.nextLine();
		ArrayList<String> relations = new ArrayList<String>();
		for(int i = 0;i<c;i++) {
			relations.add(in.nextLine());
		}
		/*for(int i=0;i<lines.size();i++) {
			System.out.println(lines.get(i));
		}
		for(int i=0;i<relations.size();i++) {
			System.out.println(relations.get(i));
		}*/
		
		setRootNode(lines.get(0));
		setNodes(lines);
		
		/*for(int i=0;i<familyNodes.size();i++) {
			System.out.println(familyNodes.get(i).getName());
			if(familyNodes.get(i).getLeft() != null)
				System.out.println("--" + familyNodes.get(i).getLeft().getName()); 
			if(familyNodes.get(i).getRight() != null)
				System.out.println("--" + familyNodes.get(i).getRight().getName());
		}*/
		
		for(int i=0;i<relations.size();i++) {
			String[] line = relations.get(i).split(" ");
			String node1 = line[0];
			String node2 = line[2];
			String relation = line[1];
			if(relation.equalsIgnoreCase("child")) {
				checkChild(node1, node2);
			}else if(relation.equalsIgnoreCase("descendant")) {
				FamilyNode familyNode1 = getNode(node1);
				FamilyNode familyNode2 = getNode(node2);
				if(checkDescendant(familyNode1, familyNode2)) {
					System.out.print("T ");
				}else {
					System.out.print("F ");
				}
			}else if(relation.equalsIgnoreCase("sibling")) {
				FamilyNode familyNode1 = getNode(node1);
				FamilyNode familyNode2 = getNode(node2);
				FamilyNode parent = familyNode1.getParent();
				if((parent.getLeft() == familyNode1 && parent.getRight() == familyNode2) || 
						(parent.getLeft() == familyNode1 && parent.getRight() == familyNode2)) {
					System.out.print("T ");
				}else {
					System.out.print("F ");
				}
			}else if(relation.equalsIgnoreCase("ancestor")) {
				FamilyNode familyNode1 = getNode(node1);
				FamilyNode familyNode2 = getNode(node2);
				if(checkAncestor(familyNode1, familyNode2)) {
					System.out.print("T ");
				}else {
					System.out.print("F ");
				}
			}
		}
		System.out.println();
		printPreOrder(root);
		
	}

	private static boolean checkAncestor(FamilyNode familyNode1, FamilyNode familyNode2) {
		boolean isAncestor = false;
		if(familyNode2.getParent() == familyNode1) {
			isAncestor = true;
		}else {
			if(familyNode2.getParent() != null) {
				isAncestor = checkAncestor(familyNode1, familyNode2.getParent());
			}
		}
		return isAncestor;
	}

	private static boolean checkDescendant(FamilyNode familyNode1, FamilyNode familyNode2) {
		boolean isDescendant = false;
		if(familyNode1.getParent() != null) {
			if(familyNode1.getParent() == familyNode2) {
				isDescendant = true;
			}else {
				isDescendant = checkDescendant(familyNode1.getParent(), familyNode2);
			}
		}
		return isDescendant;
	}

	private static void checkChild(String node1, String node2) {
		FamilyNode familyNode1 = getNode(node1);
		FamilyNode familyNode2 = getNode(node2);
		if(familyNode2.getLeft() == familyNode1 || familyNode2.getRight() == familyNode2) {
			System.out.print("T ");
		}else {
			System.out.print("F ");
		}
	}

	private static void printPreOrder(FamilyNode node) {
		System.out.print(node.getName() + " ");
		if(node.getLeft() != null)
			printPreOrder(node.getLeft());
		if(node.getRight() != null)
			printPreOrder(node.getRight());
	}

	private static void setNodes(ArrayList<String> lines) {
		for(int i=1;i<lines.size();i++) {
			String[] relation = lines.get(i).split(" ");
			String parent = relation[0];
			String child = relation[1];
			FamilyNode parentNode = getNode(parent);
			if(parentNode != null) {
				FamilyNode childNode = new FamilyNode(child, parentNode); 
				parentNode.addChild(childNode);
				familyNodes.add(childNode);
			}
		}
	}

	private static FamilyNode getNode(String parent) {
		FamilyNode node = null;
		for(int i=0;i<familyNodes.size();i++) {
			if(parent.equals(familyNodes.get(i).getName())) {
				node = familyNodes.get(i);
			}
		}
		return node;
	}

	private static void setRootNode(String firstLine) {
		String[] relation = firstLine.split(" ");
		String parent = relation[0];
		String child = relation[1];
		root = new FamilyNode(parent, null);
		FamilyNode childNode = new FamilyNode(child, root); 
		root.addChild(childNode);
		familyNodes.add(root);
		familyNodes.add(childNode);
	}

}
