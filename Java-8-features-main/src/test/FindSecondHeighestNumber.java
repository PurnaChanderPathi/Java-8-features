package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHeighestNumber {
	public static void main(String[] args) {
		
		List list = Arrays.asList(1,2,3,4,5,6,6);
//		list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().ifPresent(System.out::println);
		
	}
}
