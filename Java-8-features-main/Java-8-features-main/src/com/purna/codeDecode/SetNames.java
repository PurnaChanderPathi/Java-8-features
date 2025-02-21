package com.purna.codeDecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetNames {

	public static void main(String[] args) {
		
		List<Employee> emps = Arrays.asList( new Employee(1, "Purna", 20),
												new Employee(2, "Raghu", 21),
												new Employee(3, "Krishna", 22),
												new Employee(4, "Swathi", 24));
		
		List<String> names = Arrays.asList("Purna","Swathi","Krishna","Raghu");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		Integer lengthOfNames = names.stream().collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));
		
		System.out.println(lengthOfNames);
		
		Integer lengthNames = names.stream().map(String::length).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(lengthNames);
		
		Integer concatnumbers = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(concatnumbers);
		
		IntSummaryStatistics result = numbers.stream().collect(Collectors.toList()).stream().mapToInt(i -> i).summaryStatistics();
		System.out.println(result.getMax());
		
		Integer EmpAge = emps.stream().map(i -> i.getAge()).collect(Collectors.toList()).stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(EmpAge);
		
		IntSummaryStatistics summaryStatestics = emps.stream().map(i -> i.getAge()).collect(Collectors.toList()).stream().mapToInt(i -> i).summaryStatistics();	
		System.out.println(summaryStatestics.getAverage());
		
		String concatEmpNames = emps.stream().map(emp -> emp.getName()).collect(Collectors.joining(", ")); 
		System.out.println(concatEmpNames);
		
		String concatNames = names.stream().collect(Collectors.joining(", "));
		System.out.println(concatNames);
		
		Map<Long, String> empResult = emps.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(empResult);
		
		Map<String, Integer> namesResult = names.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(namesResult);
		
		Long totalReasult = numbers.stream().mapToInt(i -> i).summaryStatistics().getSum();
		System.out.println(totalReasult);
		
		int totalReducer = emps.stream().map(emp -> emp.getAge()).collect(Collectors.reducing(0,Integer::sum));
		System.out.println(totalReducer);
		
		 emps.stream().map(emp -> emp.getAge()).sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	}
}
