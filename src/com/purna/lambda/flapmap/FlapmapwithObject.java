package com.purna.lambda.flapmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlapmapwithObject {

	public static void main(String[] args) {
		List<Emp> emps = List.of(new Emp("purna", List.of(8801234567L,8805690342L)),
								new Emp("Shiva", List.of(8808124455L,7765893472L)));
		
		emps.forEach(emp-> System.out.println(emp.getPhones()));
		
		
		// all phone numbers
		List<List<Long>> employee = emps.stream()
				.map(emp -> emp.getPhones())
				.collect(Collectors.toList());
		System.out.println("all phone numbers");
		System.out.println(employee); 
		
		// single list formate
		System.out.println("single list formate");
		List<String> singlelist = emps.stream()
		.map(Emp::getPhones) // getting all phone numbers
		.flatMap(Collection::stream) //adding into single list 
		.map(num->"+91-"+num) // adding +91- before all phone numbers
		.collect(Collectors.toList()); // collecting the data in list format
		
		System.out.println(singlelist);
		
	
	}

}
