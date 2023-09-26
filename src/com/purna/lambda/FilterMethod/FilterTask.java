package com.purna.lambda.FilterMethod;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterTask {
	public static void main(String[] args) {
		
		//filtered the data starts with "r" and print the data
		System.out.println("filtered the data starts with \"r\" and print the data");
		List<String> names = List.of("devi","raju","rani","ravi","krishna",
				"raju","rani","king","deyam","ratan");
		names.stream().filter(i -> i.startsWith("k"))
		.forEach(name -> System.out.println(name));
		
		//filter the data starts with r & length == 4 take as list format
		System.out.println("Filter the data start with \"r\" with length 4 take in list format");
		List<String> namewithlength4 =  names.stream()
				.filter(i -> i.startsWith("r") && i.length()==4)
				.collect(Collectors.toList());
		System.out.println(namewithlength4);
		
		//filter the data starts with r & length == 4 take as set format
				System.out.println("Filter the data start with \"r\" with length 4 take in Set format");
				Set<String> namewithlength4Set =  names.stream()
						.filter(i -> i.startsWith("r") && i.length()==4)
						.collect(Collectors.toSet());
				System.out.println(namewithlength4Set);
		
				//filtered the data starts with "r" and count the data
				System.out.println("filtered the data starts with \"r\" and count the data");
				long count = names.stream()
						.filter(i -> i.startsWith("r")).count();
				System.out.println(count);
				
				//filtered the data starts with "d" and find the first element
				System.out.println("filtered the data starts with \"d\" and find the first element");
				String firstElement = names.stream()
						.filter(i -> i.startsWith("d"))
						.findFirst().get();
				System.out.println(firstElement);
				
				//filtered the data starts with "d" and find the second element
				System.out.println("filtered the data starts with \"d\" and find the second element");
				String secondElement = names.stream()
						.filter(i -> i.startsWith("d"))
						.skip(1).findFirst().get();
				System.out.println(secondElement);
	}
	
	}
