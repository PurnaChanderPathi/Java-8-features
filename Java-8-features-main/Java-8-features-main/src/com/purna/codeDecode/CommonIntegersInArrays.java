package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonIntegersInArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,56,8,9,1};
		int[] arr2 = {4,8,1,22,66,1};
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,56,8,9,1);
		List<Integer> list2 = Arrays.asList(4,8,1,22,66,1);
		
		findCommenElements(arr1,arr2);
		findCommoninList(list1,list2);
	}

	private static void findCommoninList(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = list1.stream().filter(list2::contains).distinct().collect(Collectors.toList());
		System.out.println("Integer List");
		System.out.println(result);
		
	}

	private static void findCommenElements(int[] arr1, int[] arr2) {
		
		
		// Filtering common elements in 2 arrays
		List<Integer> result = Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(number -> number==num)).distinct().boxed().collect(Collectors.toList());
		System.out.println(result);
		
	}
}
