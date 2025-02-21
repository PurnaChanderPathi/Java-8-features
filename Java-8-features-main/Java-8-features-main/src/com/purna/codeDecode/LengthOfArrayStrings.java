package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfArrayStrings {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple","Banana","Avocado","Apricot","Grapes"};
		FindLengthOfEarchFruit(fruits);
	}

	private static void FindLengthOfEarchFruit(String[] fruits) {
		
		List<Integer> lengthOfFruits = Arrays.stream(fruits).mapToInt(string -> string.length()).boxed().collect(Collectors.toList());
		
		System.out.println(lengthOfFruits);
		
		Integer res = Arrays.stream(fruits).mapToInt(String::length).max().orElse(0);
		System.out.println(res);
	}
}
