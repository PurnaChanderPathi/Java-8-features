package com.purna.codeDecode;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		IntSummaryStatistics result = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(result.getMax());
		
		
	}
}
