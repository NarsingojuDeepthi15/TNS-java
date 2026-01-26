package com.tnsif.lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		MyInterface myinf=()->System.out.println("This is print method");
		myinf.print();
		
		Predicate<Integer> p=(n)->n%2==0;
		System.out.println(p.test(3));
		 
		Consumer<String> con=(name)->System.out.println(name.toUpperCase());
		con.accept("Hello");
		
		Supplier<Double> s=()->Math.random();
		System.out.println(s.get());
		
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(8));
			
	}

}
