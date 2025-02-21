 package com.purna.lambda.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//collection.sort(list)  ....       //accending order
 //collection.sort(list,comparator) // decending order
 
 //list.sort(Comparator) both // accending and decending order
 
 //stream.sorted() //accending order
 //stream.sorted(Comparator) //decending order
public class sorting {

	public static void main(String[] args) {
		System.out.println("names in accending oder");
		List<String> names = Arrays.asList("purna","chandu","pathi","raghu","krishna");
		//Collections.sort(names);
//		names.sort((name1,name2) -> name1.compareTo(name2)); // using lambda
//		names.sort(String::compareTo);
		Collections.sort(names,Comparator.reverseOrder()); //reverse
		System.out.println("*************");
		System.out.println(names);
		System.out.println("*************");
		
		System.out.println("numbers in accending oder");
		List<Integer> numbers = Arrays.asList(5,8,3,6,12,78,45,22);
//		numbers.sort(Integer::compareTo);
		Collections.sort(numbers,Comparator.reverseOrder());
		System.out.println(numbers);
		
		//product
		List<Product> products = Arrays.asList(new Product(1, "phone", 15000),
											new Product(2, "smartwatch", 10000),
											new Product(3, "tab", 8000),
											new Product(4, "earbuds", 3000));
		//collections.sort
		System.out.println("Collection sort for pid");
		Collections.sort(products,Comparator.comparingInt(Product::getPid));
		//Collections.sort(products,Comparator.comparingInt(Product::getPid).reversed()); //reverse
		products.forEach(System.out::println);

		//list sort 
		System.out.println("List sort for pname");
		products.sort(Comparator.comparing(Product::getPname));
		//products.sort(Comparator.comparing(Product::getPname).reversed()); // reverse
		products.forEach(System.out::println);
		
		// list sort
		System.out.println("List sort for pcost");
//		products.sort(Comparator.comparingDouble(Product::getPcost));
		Collections.sort(products,Comparator.comparing(Product::getPcost));
		//products.sort(Comparator.comparingDouble(Product::getPcost).reversed()); //reverse
		products.forEach(System.out::println);
		
		//Stream sort
		System.out.println("Stream sorted for pcost");
		products.stream()
		.sorted(Comparator.comparingDouble(Product::getPcost))
		//.sorted(Comparator.comparingDouble(Product::getPcost).reversed())
		.forEach(System.out::println);
	}

}
