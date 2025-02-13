package com.purna.lambda.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AssignmentOnSorting {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product(1, "pen", 0100.45),
											new Product(2, "car", 30000),
										 new Product(4, "fan", 900),
										 new Product(3, "chair", 400),
										 new Product(3, "laptop", 40000),
										 new Product(3, "laptop", 400),
										 new Product(3, "laptop", 30000),
										 new Product(2, "mobile", 10000),
										 new Product(2, "charger", 300));
		
		//stream.sorted using pid
//		System.out.println("stream.sorted using pid");
//		products.stream()
//		.sorted(Comparator.comparingInt(Product::getPid))
//		//.sorted(Comparator.comparingInt(Product::getPid).reversed()) reverse
//		.forEach(System.out::println);
		
		//reverse
//		products.stream().sorted(Comparator.comparingInt(Product::getPid).reversed())
//		.forEach(System.out::println);
		
		//stream.sorted using pname
//		System.out.println("stream.sorted using pname");
//		products.stream()
//		.sorted(Comparator.comparing(Product::getPname))
//		.forEach(System.out::println);
		
		//stream.sorted using pcost
//				System.out.println("stream.sorted using pcost");
//				products.stream()
//				.sorted(Comparator.comparingDouble(Product::getPcost))
//				.forEach(System.out::println);
	}

}
