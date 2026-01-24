package com.tnsif.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCustomObjectComparator {

	public static void main(String[] args) {
		Map<Integer,Employee> map=new HashMap<>();
		map.put(101, new Employee(101, "Deepthi",55000));
		map.put(102, new Employee(102, "Sreeja",52000));
		map.put(103, new Employee(103, "Pavan",55000));
		map.put(104, new Employee(104, "Bhavya",45000));
		
		List<Map.Entry<Integer,Employee>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list,new Salary());
		System.out.println("Map sorted by Employee Salary:");
		for(Map.Entry<Integer, Employee>entry:list) {
			Employee e=entry.getValue();
			System.out.println(entry.getKey()+" -> "+e.id+" "+e.name+" "+e.salary);
		}
		
		
	}

}
