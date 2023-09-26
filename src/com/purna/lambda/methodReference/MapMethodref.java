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
		List<Integer> intNumbers = MapMethodref.stringNumToIntNum(stringNumbers);
		System.out.println(intNumbers);
		
		List<String> names = Arrays.asList("purna","chandu","raghu","krishna","pathi");
		List<Integer> intNames = MapMethodref.stringLength(names);
		System.out.println(intNames);
		
		List<String> lowerCase = Arrays.asList("purna","chandu","raghu","krishna","pathi");
		List<String> upperCase = MapMethodref.upperCase(lowerCase);
		System.out.println(upperCase);
		
		List<Person> persons = Arrays.asList(new Person(18, "Virat"),
											new Person(45, "Rohit"));
		persons.stream()
		.map(Person :: newAge)
		.forEach(age -> System.out.println(age));
	}
	


}
