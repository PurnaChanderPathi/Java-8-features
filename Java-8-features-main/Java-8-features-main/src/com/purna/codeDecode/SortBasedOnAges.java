package com.purna.codeDecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortBasedOnAges {


	
	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(new Employee(1, "Purna", 20),
				new Employee(2, "Raghu", 30),
				new Employee(3, "krishna", 28),
				new Employee(4, "Swathi", 25),
				new Employee(5, "Swarna", 21));
//		List<Employee> sortByAge = emp.stream().sorted((o1,o2) -> (o2.getAge()-o1.getAge())).skip(2).collect(Collectors.toList());
//		System.out.println(sortByAge);
		
//		List<Employee> sortByAge = emp.stream().sorted((o1,o2) -> (o2.getAge()-o1.getAge())).limit(2).collect(Collectors.toList());
//		System.out.println(sortByAge);
		
//		Employee sortByAge = emp.stream().filter(e -> e.getName().contains("Ra")).findFirst().get();
//		System.out.println(sortByAge);
		
//		Employee sortByAge = emp.stream().parallel().filter(e -> e.getName().contains("Swa")).findAny().get();
//		System.out.println(sortByAge);
//		
//		Boolean itContains = emp.stream().anyMatch(e -> e.getName().contains("Swa"));
		
//		System.out.println(itContains);
//		List<Employee> filter = emp.stream().filter(e -> e.getName().contains("Swa")).collect(Collectors.toList()).stream().sorted((o1,o2) -> (o2.getAge() -o1.getAge())).collect(Collectors.toList());
//		System.out.println(filter);
		
//		Employee sortByAge = emp.stream().parallel().filter(e -> e.getName().contains("Swa")).findAny().get();
//		System.out.println(sortByAge);
		
//		Boolean itContains = emp.stream().allMatch(e -> e.getName().contains("a"));
//		System.out.println(itContains);
		
		Boolean itContains = emp.stream().noneMatch(e -> e.getName().contains("Swai"));
		System.out.println(itContains);
		
		
		
	}
	

	
	
}
