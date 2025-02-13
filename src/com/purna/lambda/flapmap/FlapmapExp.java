package com.purna.lambda.flapmap;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlapmapExp {

	public static void main(String[] args) {
		//sublist
//		System.out.println("sublist");
//		List<List<Integer>> sublist = List.of(List.of(1,2,3,4),List.of(5,6,7,8));
//		System.out.println(sublist);
//		
//		List<Integer> list = sublist.stream().flatMap(Collection::stream).collect(Collectors.toList());
//		System.out.println("flapmap list");
//		System.out.println(list);
//		System.out.println("flapmap list");
//		
//		List<Integer> list = sublist.stream()
//		.flatMap(Collection::stream)
//		.collect(Collectors.toList());
//		System.out.println("sublist into single list");
//		System.out.println(list);
//		
//		//subset
//		System.out.println("subset");
//		Set<Set<Integer>> subset = Set.of(Set.of(1,2,3,4),Set.of(5,6,7,8),Set.of(2,4,6,8));
//		System.out.println(subset);
//		
//		Set<Integer> set = subset.stream()
//		.flatMap(Collection::stream)
//		.collect(Collectors.toSet());
//		System.out.println("subset into single set");
//		System.out.println(set);
//		
		//listmap
//		System.out.println("listmaps");
//		List<Map<Integer, String>> listmaps = List.of(Map.of(1,"a",2,"b",3,"c"),
//														Map.of(11,"aa",22,"bb",33,"cc"),
//														Map.of(111,"aaa",222,"bbb",333,"ccc"));
//		System.out.println(listmaps);
//		
//		System.out.println("Listmaps in single list");
//		List<java.util.Map.Entry<Integer, String>> result = listmaps.stream()
//		.flatMap(data->data.entrySet().stream())
//				.collect(Collectors.toList());
//		System.out.println(result);
		
		
//		List<Map.Entry<Integer, String>> resultMap = listmaps.stream()
//				.flatMap(data -> data.entrySet().stream()).collect(Collectors.toList());
//		System.out.println(resultMap);
		
		List<List<Integer>> listoflist = List.of(List.of(1,2,3,4),List.of(5,6,7,8),List.of(2,4,6,8)); 
		
		List<Integer> listoflistResult = listoflist.stream()
				.flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(listoflistResult);
		
		Set<Integer> listOfSetResult = listoflist.stream()
				.flatMap(Collection::stream).collect(Collectors.toSet());
		
		System.out.println(listOfSetResult);
		
		List<Map<Integer, String>> listOfMap = List.of(Map.of(1,"a",2,"b",3,"c"),
				Map.of(11,"aa",22,"bb",33,"cc"),
				Map.of(111,"aaa",222,"bbb",333,"ccc"));
		
		List<Map.Entry<Integer, String>> listOfMapResult = listOfMap.stream()
				.flatMap(data -> data.entrySet().stream()).collect(Collectors.toList());
		System.out.println(listOfMapResult);
		
		
		
		

	}

}
