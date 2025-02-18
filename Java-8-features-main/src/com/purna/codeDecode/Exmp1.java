package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Exmp1 {
	
	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(new Employee(1, "Purna", 20),
				new Employee(2, "Raghu", 30),
				new Employee(3, "krishna", 28),
				new Employee(4, "Swathi", 20),
				new Employee(5, "Swathi", 20));
		
		Map<Object, Set<Employee>> result = emp.stream().collect(Collectors.groupingBy(e -> e.getAge(),TreeMap::new, Collectors.toSet()));
		System.out.println(result);
				
	}

}
