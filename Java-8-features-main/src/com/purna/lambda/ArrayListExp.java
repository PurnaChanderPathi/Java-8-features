package com.purna.lambda;
//ForEach method printing collections and maps

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListExp {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("purna","Ajeeth","Shiva","Krishna","Sreenath");
		names.forEach(name -> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5);
		numbers.forEach(number -> System.out.println(number));
		
		List<Employee> emps = Arrays.asList(new Employee(1, "purna", 25000),
				new Employee(2, "Ajeeth", 50000),
				new Employee(3, "Shiva", 75000));
		emps.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esalary));
		
		Set<String> colours = Set.of("black","white","blue","red","Green");
		colours.forEach(colour -> System.out.println(" "+colour));
		
		
		Map<String, Integer> wordCount = Map.of("purna",1,"Shiva",2, "Ajeeth",3);
		wordCount.forEach((k,v) -> System.out.println("Key..."+k+" "+"value..."+v));
		
		Map<Integer, Employee> qwerty = Map.of(100,new Employee(1, "purna", 15000),
												200, new Employee(2, "Shiva", 25000));
		qwerty.forEach((k,v) -> System.out.println(k+" "+v.eid+" "+v.ename+" "+v.esalary));
	}
	
	
	
}
