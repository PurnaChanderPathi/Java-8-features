package com.purna.lambda.sequentailAndParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exp {

	public static void main(String[] args) {
		List<Integer> numbers =List.of(1,2,3,4,5,6,7,8,9);
		
		//sequential 
		System.out.println("Sequential");
		numbers.stream()
		.forEach(System.out::print);
		System.out.println();
		
		//parallel
				System.out.println("parallel");
				numbers.parallelStream()
				.forEach(System.out::print);
				System.out.println();
				
		//sequential even 
				System.out.println("sequential even");
				long start = System.currentTimeMillis();
				List<Integer> even = numbers.stream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
				long end = System.currentTimeMillis();
				System.out.println("sequence stream time "+(end-start));
				
				//parallel even 
				System.out.println("parallel even");
				long sstart = System.currentTimeMillis();
				List<Integer> eeven = numbers.parallelStream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
				long eend = System.currentTimeMillis();
				System.out.println("sequence stream time "+(eend-sstart));

	}

}
