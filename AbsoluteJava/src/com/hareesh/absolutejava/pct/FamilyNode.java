package com.hareesh.absolutejava.pct;

public class FamilyNode {
	
	public String name;
	public FamilyNode left;
	public FamilyNode right;
	public FamilyNode parent;
	
	public FamilyNode(String name, FamilyNode parent) {
		this.name = name;
		this.parent = parent;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the left
	 */
	public FamilyNode getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(FamilyNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public FamilyNode getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(FamilyNode right) {
		this.right = right;
	}
	
	public boolean addChild(FamilyNode child) {
		if(this.getLeft() == null) {
			this.setLeft(child);
			return true;
		}else if(this.getRight() == null) {
			this.setRight(child);
			return true;
		}else {
			return false;
		}
	}

	/**
	 * @return the parent
	 */
	public FamilyNode getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(FamilyNode parent) {
		this.parent = parent;
	}
	

}
