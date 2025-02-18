package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintOvelsFromString {
	public static void main(String[] args) {
		
		String sentence = "Purna is a Java Developer";
//		
//		List<Character> chars = Arrays.asList('a','e','i','o','u');
//		
//		Map<Integer, Character> vol = IntStream.range(0, sentence.length())
//				.filter(i -> chars.contains(sentence.charAt(i)))
//				.boxed()
//				.collect(Collectors.toMap(index -> index, sentence::charAt));
//		
//		vol.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
////		System.out.println(vol);
		
		List<Character> chars = Arrays.asList('a','e','i','o','u');
		
		Map<Integer, Character> vol = IntStream.range(0, sentence.length())
				.filter(i -> chars.contains(sentence.charAt(i)))
				.boxed()
				.collect(Collectors.toMap(index -> index, sentence::charAt));
	}
}