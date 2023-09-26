package com.purna.lambda.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorting
// to sorting we have two conditions
// 1) data must be homogenious
// 2)must implements Comparable interface
// in java String and all wrapper classes are implements Comparable interface
// note :- the sorting is done through compareTo() method
// there are  three ways 
// 1) Collection.sort()
// 2) list.sort()
// 3) stream.sort()

public class SortingExp {

	
	public static void main(String[] args) {
		//collection.sort
		List<String> namesSort = Arrays.asList("purna","chandu","ajeeth","shiva");
		System.out.println("Collection.sort");
		Collections.sort(namesSort);
		System.out.println(namesSort);
		//reverse
		System.out.println("reverse order");
		Collections.sort(namesSort,Comparator.reverseOrder());
		System.out.println(namesSort);
		
		//list.sort
		System.out.println("list.sort");
		//accending order
		System.out.println("accending order by list.sort");
		namesSort.sort((name1,name2)-> name1.compareTo(name2));
		System.out.println(namesSort);
		//decending order
		System.out.println("decending order by list.sort");
		namesSort.sort((name1,name2)-> name2.compareTo(name1));
		System.out.println(namesSort);
		
		//Stream.sort
		List<String> newnames = List.of("purna","chandu","ajeeth","shiva");
		System.out.println("Stream.sort");
		//accending oder
		System.out.println("Accending order");
		 newnames.stream().sorted()
		 .forEach(name -> System.out.println(name));
		 //decending order
		 System.out.println("decending order");
		 newnames.stream().sorted((name1,name2)-> -name1.compareTo(name2))
		 .forEach(name -> System.out.println(name));
		 
		 // accending order saved in list format
			System.out.println("Stream.sort in list format");
			 System.out.println("Accending order");
			 List<String> newStrings = newnames.stream()
					  .sorted().
					  collect(Collectors.toList());
			 
			 System.out.println(newStrings);
			 //decending oder in list format
				System.out.println("decending order");
				 List<String> reverseString = newnames.stream()
				 .sorted((name1,name2)-> -name1.compareTo(name2))
				 .collect(Collectors.toList());
				 System.out.println(reverseString);
				 
				 //filter the data and sort the data
				 System.out.println("filter the data and sort the data");
				 List<String> filterSort = List.of("ramesh","rani","raju","ramya","pathi","purna");
				 System.out.println("Accending order");
				 filterSort.stream()
				 .filter(filter-> filter.startsWith("r"))
				 .sorted()
				 .forEach(filter -> System.out.println(filter));
				 
				 System.out.println("Decending order");
				 filterSort.stream()
				 .filter(filter-> filter.startsWith("r"))
				 .sorted((filter1,filter2)-> -filter1.compareTo(filter2))
				 .forEach(filter -> System.out.println(filter));
		 
		
		
	
		
		
		
		
	}

}
