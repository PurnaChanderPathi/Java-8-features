package com.purna.codeDecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysEmp {

	public static void main(String[] args) {
		
		List<Integer> ids = Arrays.asList(1,1,4,6,7,9,44,78);
		
		Integer secondSmallNumber = ids.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondSmallNumber);
		
		int[] seq = {1,3,65,7,9,5,43};
		
//		fetchSecondSmallest(seq);
		int secondSmall = Arrays.stream(seq).sorted().skip(2).findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesnot have second small number"));
		System.out.println(secondSmall);
		
	}



	private static void fetchSecondSmallest(int[] seq) {
		
		int secondSmallnum = Arrays.stream(seq).sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesnot have small"));
		
	}
}
