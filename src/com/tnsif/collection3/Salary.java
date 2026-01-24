package com.tnsif.collection3;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Salary implements Comparator<Map.Entry<Integer,Employee>> {

	@Override
	public int compare(Entry<Integer, Employee> e1, Entry<Integer, Employee> e2) {
		
		return Double.compare(e1.getValue().salary, e2.getValue().salary);
	}

   
    
}

