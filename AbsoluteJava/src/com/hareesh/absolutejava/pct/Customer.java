package com.hareesh.absolutejava.pct;

public class Customer {
	
	public String name;
	public int age;
	public int heightInFeets;
	public int heightInInches;
	public int height;
	public Customer(String name, int age, int heightInFeets, int heightInInches) {
		this.name = name;
		this.age = age;
		this.heightInFeets = heightInFeets;
		this.heightInInches = heightInInches;
		this.height = this.heightInFeets * 12 + this.heightInInches;
	}
	public String cupSize;
	public String beverage;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the cupSize
	 */
	public String getCupSize() {
		return cupSize;
	}
	/**
	 * @param cupSize the cupSize to set
	 */
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	/**
	 * @return the beverage
	 */
	public String getBeverage() {
		return beverage;
	}
	/**
	 * @param beverage the beverage to set
	 */
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	/**
	 * @return the heightInFeets
	 */
	public int getHeightInFeets() {
		return heightInFeets;
	}
	/**
	 * @param heightInFeets the heightInFeets to set
	 */
	public void setHeightInFeets(int heightInFeets) {
		this.heightInFeets = heightInFeets;
	}
	/**
	 * @return the heightInInches
	 */
	public int getHeightInInches() {
		return heightInInches;
	}
	/**
	 * @param heightInInches the heightInInches to set
	 */
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}	

}
