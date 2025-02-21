package com.purna.codeDecode;

import java.util.function.Predicate;

public class PredicateEmp {

	public static void main(String[] args) {
		
		Predicate<String> name = s -> s.length() > 5;
		System.out.println(name.test("Purna"));
		
		Predicate<String> names = s -> s.length()%2 ==0;
		System.out.println(names.test("Swathi"));
		
		System.out.println(names.and(name).test("Purna"));
		
		System.out.println(names.or(name).test("Swathi"));
		
		System.out.println(names.negate().test("krishna"));
	}
}
