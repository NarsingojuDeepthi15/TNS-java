package com.tnsif.tasks;

import java.util.Arrays;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(8,4,7,5,9,3,6,1,4);
		l.stream().
		sorted().
		forEach(System.out::println);
		

	}

}
