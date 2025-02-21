package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExpm {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(1, "Purna", 20),
				new Employee(2, "Raghu", 30),
				new Employee(3, "krishna", 28),
				new Employee(4, "Swathi", 25),
				new Employee(5, null, 21));
		String name = Optional.ofNullable(emp.get(4).getName()).orElse("Anonymous");
//		System.out.println(name);
		
		Optional<String> e = Optional.ofNullable(emp.get(4).getName());
		if(!e.isEmpty()) {
			Optional<String> nullCheck = Optional.ofNullable(e.get());
			if(nullCheck.isPresent()) {
				System.out.println(nullCheck.get());
			}else {
				System.out.println("name is null");
			}
			
		}else {
			System.out.println("name is null");
		}

		

	}

	private List<Employee> emp = Arrays.asList(
			new Employee(1, "Purna", 20),
			new Employee(2, "Raghu", 30),
			new Employee(3, "krishna", 28),
			new Employee(4, "Swathi", 25),
			new Employee(5, "Manohar", 21));
			
	

}
