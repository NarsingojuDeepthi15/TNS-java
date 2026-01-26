package com.tnsif.stream;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,5);
		li.stream().
		filter(n->n%2==0).
		forEach(System.out::println); 
		
		

	}

}
