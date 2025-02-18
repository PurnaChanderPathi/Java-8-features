package com.purna.lambda.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodref {

	public static List<Integer> stringNumToIntNum(List<String> stringnumbers)
	{
		return stringnumbers.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
	}
	
	//returns length of the string 
	public static List<Integer> stringLength(List<String> names)
	{
		return names.stream()
				.map(String::length)
				.collect(Collectors.toList());
	}
	
	public static List<String> upperCase(List<String> lowerCase)
	{
		return lowerCase.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {

		List<String> stringNumbers = Arrays.asList("1","2","3","4","5","6","7","8","9");
		List<Integer> internumber = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> intNumbers = MapMethodref.stringNumToIntNum(stringNumbers);
		System.out.println(intNumbers);
		
		System.out.println("************************");
		List<Integer> result = stringNumbers.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(result);
		List<String> resultToString = internumber.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(resultToString.toString());
		System.out.println("************************");
		
		List<String> names = Arrays.asList("purna","chandu","raghu","krishna","pathi");
		List<Integer> intNames = MapMethodref.stringLength(names);
		System.out.println(intNames);
		System.out.println("************************");
		List<Integer> lengthOfNames = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(lengthOfNames);
		System.out.println("************************");
		
		
		List<String> lowerCase = Arrays.asList("purna","chandu","raghu","krishna","pathi");
		List<String> upperCase = MapMethodref.upperCase(lowerCase);
		System.out.println(upperCase);
		System.out.println("************************");
		List<String> intoUpperCase = lowerCase.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(intoUpperCase);
		System.out.println("************************");
		
		List<Person> persons = Arrays.asList(new Person(18, "Virat"),
											new Person(45, "Rohit"));
		persons.stream()
		.map(Person :: newAge)
		.forEach(age -> System.out.println(age));
		
		List<Integer> ages = persons.stream().map(Person :: newAge).collect(Collectors.toList());
		System.out.println(ages);
	}
	


}
