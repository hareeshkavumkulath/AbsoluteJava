package com.hareesh.absolutejava.pct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompHourtons {
	
	public static ArrayList<Customer> customers = new ArrayList<Customer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit1 = Integer.parseInt(in.next());
		int limit2 = Integer.parseInt(in.next());
		int limit3 = Integer.parseInt(in.next());
		int numCustomers = in.nextInt();
		/*System.out.println(limit1 + ", " + limit2 + ", " + limit3);
		System.out.println(numCustomers);*/
		
		for(int i=0;i<numCustomers;i++) {
			String name = in.next();
			int age = Integer.parseInt(in.next());
			int heightInFeets = Integer.parseInt(in.next());
			int heightInInches = Integer.parseInt(in.next());
			Customer cust = new Customer(name, age, heightInFeets, heightInInches);
			customers.add(cust);
		}
		
		processBeverage(limit1, limit2, limit3);
		NameComparator nameComparator = new NameComparator();
		Collections.sort(customers, nameComparator);
		printCustomers();
		
		AgeComparator ageComparator = new AgeComparator();
		Collections.sort(customers, ageComparator);
		printCustomers();
		
		HeightComparator heightComparator = new HeightComparator();
		Collections.sort(customers, heightComparator);
		printCustomers();
		
	}

	private static void printCustomers() {
		for(int i=0;i<customers.size();i++) {
			Customer cust = customers.get(i);
			System.out.println(cust.getName() + " " 
					+ cust.getBeverage() + " "
					+ cust.getCupSize() + " "
					+ cust.getAge() + " "
					+ cust.getHeightInFeets() + " "
					+ cust.getHeightInInches());
		}
	}

	private static void processBeverage(int limit1, int limit2, int limit3) {
		for(int i=0;i<customers.size();i++) {
			Customer cust = customers.get(i);
			if(cust.getAge() < 18) {
				cust.setBeverage("Water");
			}else {
				cust.setBeverage("Beer");
			}
			int size;
			if(cust.getHeightInFeets() > 5) {
				size = (cust.getHeightInFeets() * 10) + ((cust.getHeightInFeets() - 5) * 8);
			}else {
				size = cust.getHeightInFeets() * 10;
			}
			if(size <= limit1) {
				cust.setCupSize("ExtraSmall");
			}else if(size > limit1 && size <= limit2) {
				cust.setCupSize("Small");
			}else if(size > limit2 && size <= limit3) {
				cust.setCupSize("Medium");
			}else if(size > limit3){
				cust.setCupSize("Large");
			}
		}
	}
	
	

}
