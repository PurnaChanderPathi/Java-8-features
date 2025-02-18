package com.purna.lambda.sequentailAndParallelStream;

import java.util.Comparator;
import java.util.List;

public class ExpWithObject {
	public static void main(String[] args) {
		List<Emp> emps = List.of(new Emp(1, "purna", 25000, 25),
								new Emp(2, "chandu", 30000, 30));
		
		long start = System.currentTimeMillis();
		emps.stream()
		.sorted(Comparator.comparing(Emp::getEname))
		.forEach(System.out::println);
		long end = System.currentTimeMillis();
		System.out.println("sequence stream time "+(end-start));
		
		long sstart = System.currentTimeMillis();
		emps.parallelStream()
		.sorted(Comparator.comparing(Emp::getEname))
		.forEach(System.out::println);
		long eend = System.currentTimeMillis();
		System.out.println("parallel stream time "+(eend-sstart));
		
		//avg age
		double avg = emps.parallelStream()
		.mapToInt(Emp::getAge)
		.average()
		.getAsDouble();
		System.out.println("avg age : "+avg);
	}

}
