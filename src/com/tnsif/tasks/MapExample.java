package com.tnsif.tasks;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(6,7,4,5,2,3,1);
		l.stream().
		sorted().
		map(n->n*10).
		forEach(System.out::println);
		

	}

}
