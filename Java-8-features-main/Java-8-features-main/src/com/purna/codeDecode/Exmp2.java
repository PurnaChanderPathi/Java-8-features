package com.purna.codeDecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class Exmp2 {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(new Employee(1, "Purna", 20),
				new Employee(2, "Raghu", 30),
				new Employee(3, "krishna", 28),
				new Employee(4, "Swathi", 25),
				new Employee(5, "Manohar", 21));
		
		List<Integer> salary = Arrays.asList(20000,25000,40000,15000);
		
		System.out.println("Find Avg of Salary");
		
		OptionalDouble avgSalary = salary.stream().mapToInt(s -> s).average();
		System.out.println(avgSalary);
		
		System.out.println("Concat Names separate then with ,");
		List<String> names = emp.stream().map(e -> e.getName()).collect(Collectors.toList());
		String concatNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(",  "));
		String conNames = emp.stream().map(name -> name.getName()).sorted().collect(Collectors.toList()).stream().map(name -> name.toUpperCase()).collect(Collectors.joining(",  "));
		System.out.println(conNames);
		
		List<Integer> ages = emp.stream().map(age -> age.getAge()).collect(Collectors.toList());
		IntSummaryStatistics sum = emp.stream().map(age -> age.getAge()).collect(Collectors.toList()).stream().mapToInt(x -> x).summaryStatistics();
		double avg = emp.stream().map(age -> age.getAge()).collect(Collectors.toList()).stream().mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println("Avg in single query : "+avg);
		
		IntSummaryStatistics summay = ages.stream().mapToInt(x -> x).summaryStatistics();
		int getAvg = (int) ages.stream().mapToInt(x -> x).summaryStatistics().getAverage();
		int getMax = (int) ages.stream().mapToInt(x -> x).summaryStatistics().getMax();
		int getMin = (int) ages.stream().mapToInt(x -> x).summaryStatistics().getMin();
		System.out.println("Avg : "+getAvg);
		System.out.println("Max : "+getMax);
		System.out.println("min : "+getMin);
		System.out.println("Sum : "+summay.getSum());
		
		List<Integer> assendingOrder = emp.stream().map( e -> e.getAge()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Sorted Age : "+assendingOrder);
		
		System.out.println("Second Highest Age");
		 emp.stream().map(e -> e.getAge()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
		//list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().ifPresent(System.out::println);
		
//		Optional<Integer> secondHighAge = emp.stream().map(e -> e.getAge()).distinct().sorted().skip(1).findFirst();
//		System.out.println(secondHighAge);
				
	}
}
