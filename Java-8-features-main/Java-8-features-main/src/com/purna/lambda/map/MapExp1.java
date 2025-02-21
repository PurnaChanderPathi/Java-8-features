package com.purna.lambda.map;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


// Syntax
//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
public class MapExp1 {

	public static void main(String[] args) {
		// by using map adding +2 for all data
//		System.out.println("By using map adding +2 for all data");
//		List<Integer> marks = List.of(23,57,84,69,37);
//		marks.stream()
//		.map(mark -> mark+2)
//		.forEach(mark -> System.out.println(mark));
		
//		// adding "soft" in sequence path
//		System.out.println("adding \"soft\" for all ");
//		List<String> names = List.of("purna","pathi","chandu","raghu","krishna");
//		names.stream()
//		.map(name -> name+"soft")
//		.forEach(name -> System.out.println(name));
//		
//		//using filter to find even number and multiply with 10 
//		System.out.println("filtered to find even number and multiply with 10 ");
//		List<Integer> evens = List.of(1,2,2,3,4,5,6,7,8,8,9,10);
//		List<Integer> mapFilter= evens.stream().filter(i -> i%2==0).map(even -> even*10)
//		.collect(Collectors.toList());
//		System.out.println(mapFilter);
//		
//		// to print without list
//		evens.stream().filter(i -> i%2 ==0).map(even -> even*10).collect(Collectors.toList()).forEach(even -> System.out.println(even));
//		
//		//By using set duplicates will be cleared
//		System.out.println("By using set duplicates will be cleared");
//		Set<Integer> setFilter= evens.stream().filter(i -> i%2==0).map(even -> even*10)
//				.collect(Collectors.toSet());
//				System.out.println(setFilter);
//		System.out.println("Adding +5 for every list variable");
//		marks.stream()
//		.map(mark -> mark+5)
//		.forEach(mark -> System.out.println(mark));
		
//		System.out.println("Adding soft in sequence path for all");
//		List<String> names = List.of("Purna","Pavan","Anurag","Mahesh");
//		names.stream()
//		.map(name -> name+"Soft")
//		.forEach(name -> System.out.println(name));
		
//		List<Integer> evens = List.of(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> result = evens.stream()
//		.filter(i -> i%2==0).map(even -> even*10).
//		collect(Collectors.toList());
//		System.out.println(result);
		
//		List<Integer> evens = List.of(1,2,2,3,4,4,5,5,6,7,7,8,9,9,10,10);
//		
//		Set<Integer> result = evens.stream().filter(i -> i%2==0).map(even -> even*10).collect(Collectors.toSet());
//		System.out.println(result);
//		
//		List<String> str = List.of("Purna","Swathi","Raghu","Krishna","Purna","Raghu");
		
//		List<String> duplicates = str.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.entrySet()
//				.stream()
//				.filter(entry -> entry.getValue() > 1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
		
		
//		Set<String> seen = new HashSet<>();
//		List<String> duplicates = str.stream()
//				.filter(s -> !seen.add(s)).distinct().collect(Collectors.toList());
//		
//		System.out.println(duplicates);
//		
//		Set<Integer> IntResult = new HashSet<>();
//		List<Integer> IntRes = evens.stream().filter(s -> !IntResult.add(s)).distinct()
//.collect(Collectors.toList());	
		
		
//		System.out.println(IntRes);
		
//		evens.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(entry -> entry.getValue() > 1)
//		.map(Map.Entry::getKey).forEach(System.out::println);
//		
//		List<Integer> IntResult = evens.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(entry -> entry.getValue() > 1)
//		.map(Map.Entry::getKey).collect(Collectors.toList());
//		
//		System.out.println(IntResult);
		
//		Set<Integer> setResult = new HashSet<>();
//		List<Integer> listResult = evens.stream().filter(e -> !setResult.add(e)).distinct().collect(Collectors.toList());
//		System.out.println(listResult);
		
//		// by using map adding +2 for all data
//		System.out.println("By using map adding +2 for all data");
//		List<Integer> marks = List.of(23,57,84,69,37,23);
//		marks.stream().map(mark -> mark+2).collect(Collectors.toList()).forEach(updatedMarks -> System.out.println(updatedMarks));
//		
////		//By using set duplicates will be cleared
//		System.out.println("By using set duplicates will be cleared");
//		Set<Integer> setMarks = marks.stream().map(mark -> mark + 2).collect(Collectors.toSet());
//		System.out.println(setMarks);
//		
//		System.out.println("Adding soft in sequence path for all");
//		List<String> names = List.of("Purna","Pavan","Anurag","Mahesh");
//		names.stream().map(name -> name.concat("soft")).collect(Collectors.toList()).forEach(System.out::println);
		
//		List<Integer> evens = List.of(1,2,3,4,5,6,7,8,9,10);
//		evens.stream().filter(i -> i%2 == 0).map(even -> even*10).collect(Collectors.toList()).forEach(System.out::println);
		
//		List<String> str = List.of("Purna","Swathi","Raghu","Krishna","Purna","Raghu");
//		Set<String> resultSet = new HashSet<>();
//		List<String> resultList = str.stream().filter(s -> resultSet.add(s)).distinct().collect(Collectors.toList());
//		System.out.println(resultList);
		
		
//		Set<String> setResult = new HashSet<>();
//		List<String> listResult = str.stream().filter(s -> !setResult.add(s)).collect(Collectors.toList());
//		System.out.println(listResult);
//		
//		List<String> resultSet = str.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
//				.entrySet()
//				.stream()
//				.filter(entry -> entry.getValue() > 1)
//				.map(Map.Entry::getKey).collect(Collectors.toList());
//		System.out.println(resultSet);
		
		
	}
	


}
