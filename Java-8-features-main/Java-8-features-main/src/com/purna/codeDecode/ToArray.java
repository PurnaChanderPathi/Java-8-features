package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Purna","Swathi","Raghu","Krishna");
		System.out.println(words);
		
		String[] result = words.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(result));
	}
}
