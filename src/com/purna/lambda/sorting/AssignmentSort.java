package com.purna.lambda.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentSort {

	public static void main(String[] args) {
		//Collection sort
		System.out.println("Collections sort");
		List<Integer> numbers = Arrays.asList(5,4,3,7,8,23,34,45,67);
		//Accending order
		System.out.println("assending order");
		Collections.sort(numbers);
		System.out.println(numbers);
		//decending order
		System.out.println("Decending oder");
		Collections.sort(numbers,Comparator.reverseOrder());
		System.out.println(numbers);
		
		//List.sort
		System.out.println("List sort");
		//Accending order
		System.out.println("Accending Order");
		numbers.sort((number1,number2)-> number1.compareTo(number2));
		System.out.println(numbers);
		//decending order
		System.out.println("Decending order");
		numbers.sort((number1,number2)-> -number1.compareTo(number2));
		System.out.println(numbers);
		
		//stream.sort
		System.out.println("Stream sort");
		// filter <10 :: multiply with 10 peint in decending order
		System.out.println("Filter<10 :: multiply with 10 :: print in decending oder");
		 List<Integer> newNumbers = numbers.stream()
		.filter(number -> number<10)
		.map(number -> number*10)
		.sorted((number1,number2)-> -number1.compareTo(number2))
		.collect(Collectors.toList());
		
		 System.out.println(newNumbers);
		

	}

}
