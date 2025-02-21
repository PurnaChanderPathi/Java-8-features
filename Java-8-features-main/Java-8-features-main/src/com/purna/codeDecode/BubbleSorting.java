package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;

public class BubbleSorting {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,6,8,4,3,5,64,77,34,3,6,64);
		
		for(int i=0; i<numbers.size();i++) {
			for(int j=1; j<numbers.size();j++) {
				if(numbers.get(j) < numbers.get(j-1)) {
					int temp = numbers.get(j);
					numbers.set(j, numbers.get(j-1));
					numbers.set(j-1, temp);
				}
			}
		}
		System.out.println(numbers);
	}
}
