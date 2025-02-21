package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExp {

	public static void main(String[] args) {
		
		List<Employee> employee = Arrays.asList(
				new Employee(1, "Purna", 20),
				new Employee(2, "Swathi", 21),
				new Employee(3, "Raghu", 22),
				new Employee(4, "Krishna", 23),
				new Employee(5,"Swathi",24)
				);
		
		Map<String, List<Employee>> result = employee.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(result);
	}
}
