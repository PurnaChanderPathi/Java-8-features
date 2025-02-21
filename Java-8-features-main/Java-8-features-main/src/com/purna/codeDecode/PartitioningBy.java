package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		
		Map<Boolean,List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(num -> num%2 ==0));
		System.out.println(result);
	}
}
