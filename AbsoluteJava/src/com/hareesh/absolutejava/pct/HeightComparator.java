package com.hareesh.absolutejava.pct;

import java.util.Comparator;

public class HeightComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getHeight() - o2.getHeight();
	}

}
