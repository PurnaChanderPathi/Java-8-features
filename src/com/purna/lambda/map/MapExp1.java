package com.purna.lambda.map;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


// Syntax
//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
public class MapExp1 {

	public static void main(String[] args) {
		// by using map adding +2 for all data
		System.out.println("By using map adding +2 for all data");
		List<Integer> marks = List.of(23,57,84,69,37);
		marks.stream()
		.map(mark -> mark+2)
		.forEach(mark -> System.out.println(mark));
		
		// adding "soft" in sequence path
		System.out.println("adding \"soft\" for all ");
		List<String> names = List.of("purna","pathi","chandu","raghu","krishna");
		names.stream()
		.map(name -> name+"soft")
		.forEach(name -> System.out.println(name));
		
		//using filter to find even number and multiply with 10 
		System.out.println("filtered to find even number and multiply with 10 ");
		List<Integer> evens = List.of(1,2,2,3,4,5,6,7,8,8,9,10);
		List<Integer> mapFilter= evens.stream().filter(i -> i%2==0).map(even -> even*10)
		.collect(Collectors.toList());
		System.out.println(mapFilter);
		
		//By using set duplicates will be cleared
		System.out.println("By using set duplicates will be cleared");
		Set<Integer> setFilter= evens.stream().filter(i -> i%2==0).map(even -> even*10)
				.collect(Collectors.toSet());
				System.out.println(setFilter);

	}

}
