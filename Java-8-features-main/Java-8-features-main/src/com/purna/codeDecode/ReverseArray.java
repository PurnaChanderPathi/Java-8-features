package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		reverseArray(arr1);
		
		List<Integer> arr2 = Arrays.asList(1,2,3,4,5);
		reverseList(arr2);
		maxValue(arr2);
	}

	private static void maxValue(List<Integer> arr2) {
		Optional<Integer> maxValue = arr2.stream().max(Integer::compareTo);
		System.out.println(maxValue);
		
	}

	private static void reverseList(List<Integer> arr2) {
		IntStream.range(0, arr2.size()/2).forEach(i -> {
			Integer temp = arr2.get(i);
			arr2.set(i, arr2.get(arr2.size()-i-1));
			arr2.set(arr2.size()-i-1, temp);
		});
		System.out.println(arr2);
		
	}

	private static void reverseArray(int[] arr1) {
		
		IntStream.range(0, arr1.length/2).forEach(i -> {
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		});
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
