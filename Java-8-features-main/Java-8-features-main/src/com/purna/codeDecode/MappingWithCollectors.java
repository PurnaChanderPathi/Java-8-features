package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingWithCollectors {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Purna","Swathi");
		
		List<Integer> lengths = names.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
		System.out.println(lengths);
	}
}
