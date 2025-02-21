package com.purna.codeDecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		
		List<String> duplicates = Arrays.asList("Purna","Chander","Pathi","Raghu","Krishna","Purna");
		Set<String> setValues = new HashSet<>();
		List<String> result = duplicates.stream().filter(s -> !setValues.add(s)).collect(Collectors.toList());
		System.out.println(result);
		System.out.println(setValues);
		
		List<Integer> Integers = Arrays.asList(1,2,3,4,5,6,7,6,5,4);
		Set<Integer> setIntValues = new HashSet<>();
		List<Integer> duplicatesInInt = Integers.stream().filter(s -> !setIntValues.add(s)).collect(Collectors.toList());
		System.out.println(duplicatesInInt);
		System.out.println(setIntValues);
		
		List<String> findDuplicates = duplicates.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(findDuplicates);
		
		Map<String, Long> mapOfNames = duplicates.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> names = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toSet());	
		System.out.println(names);
		
		duplicates.stream().filter(name -> Collections.frequency(duplicates, name) > 1).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		
	}
}
