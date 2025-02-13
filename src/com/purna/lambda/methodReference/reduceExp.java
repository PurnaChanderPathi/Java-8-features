//reduce example with methodreference
package com.purna.lambda.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class reduceExp {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//by using lambda expression
		System.out.println("by using lambda expression");
		int num= numbers.stream()
		.reduce((x,y)->x+y)
		.get();
		System.out.println(num);
		
		//by using method reference
		System.out.println("by using method reference");
		numbers.stream()
		.reduce(Integer::sum)
		.ifPresent(System.out::println);
		
		//Concat
		System.out.println("Concat");
		List<String> names = Arrays.asList("Pathi","purna","chander");
		names.stream()
		.reduce(String::concat)
		.ifPresent(System.out::println);
		
		//
		List<String> fruits = Arrays.asList("apple","orange","banana","grapes");
		fruits.stream()
		.filter(Predicate.not(String::isEmpty))
		.map(String::length)
		.reduce(Integer::sum)
		.ifPresent(System.out::println);
		
		System.out.println("*******************");
		
		System.out.println("*******************");
		
		List<Emp> employees = Arrays.asList(new Emp(18, "virat", 18),
											new Emp(45, "Rohit", 45),
											new Emp(12, "UV", 12));
		
		System.out.println("Assignment");
		employees.stream()
		.filter(Emp::salaryCheck)
		.map(Emp::newSal)
		.forEach(System.out::println);
		

		
		
	}

}
