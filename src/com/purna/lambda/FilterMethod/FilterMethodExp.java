// Filter Method
//used to filter the data based on condition
package com.purna.lambda.FilterMethod;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodExp {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,6,7,8,8,9,10);
		//even Numbers
		System.out.println("Filtered the Even data and Printing");
		numbers.stream().filter(i -> i%2==0)
		.forEach(number -> System.out.println(number));
		
		//odd Numbers
		System.out.println("Filtered the odd data and Printing");
		numbers.stream().filter(i -> i%2!=0)
		.forEach(number -> System.out.println(number));
		
		//Collect Data in list format
		System.out.println("Filtered and Collect data in list format");
		List<Integer> even =  numbers.stream().filter(i -> i%2==0)
		.collect(Collectors.toList());
		System.out.println(even);
		
		//Collect Data in Set format without duplicates
				System.out.println("Filtered and Collect data in Set format");
				Set<Integer> evenSet =  numbers.stream().filter(i -> i%2==0)
				.collect(Collectors.toSet());
				System.out.println(evenSet);
		
				
				//Filtered data and counting number
				System.out.println("Filtered and Count data");
				long count = numbers.stream()
						.filter(i -> i%2==0)
						.count();
				System.out.println(count);
				
				//Filtered data and get First element
				System.out.println("Filterd and get First Element");
				int index = numbers.stream()
						.filter(i -> i%2==0)
						.findFirst().get();
				System.out.println(index);
				
				//Filtered data and get specific element
				System.out.println("Filterd and get specific Element");
				int specific = numbers.stream()
						.filter(i -> i%2==0).skip(4)
						.findFirst().get();
				System.out.println(specific);
				
				
		
	}

}
