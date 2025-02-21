package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExp {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Purna","Swathi","Raghu","Krishna");
		
		String result = words.stream().collect(Collectors.joining(",  "));
		System.out.println(result);
	}
}
