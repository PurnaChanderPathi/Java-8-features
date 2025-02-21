package com.purna.codeDecode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "Purna";
//		String reverse = "";
		
//		for(int i=name.length()-1; i>=0; i--) {
//			reverse+=name.charAt(i);
//		}
//		System.out.println(reverse);
		
		String reverse = IntStream.range(0, name.length()).mapToObj(i -> name.charAt(name.length()-1-i))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println(reverse);

	}
	

}
