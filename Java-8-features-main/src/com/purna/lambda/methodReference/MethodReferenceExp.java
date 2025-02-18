package com.purna.lambda.methodReference;

import java.util.Arrays;
import java.util.List;


//method reference
// method reference is the short from of lambda or special type of lambda expression
//method reference uses :: symbol

public class MethodReferenceExp {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("purna","chandu","","krishna","","raghu");
		long count = names.stream()
		//.filter(name -> name!="")
		.filter(name -> !name.isEmpty())
		.count();
		//.forEach(name -> System.out.println(name));
		System.out.println(count);
		
		long c = names.stream()
		.filter(String::isEmpty )
		.count();
		System.out.println(c);
		
		//employee
		List<Emp> emps = Arrays.asList(
				new Emp(18, "virat", 18),
				new Emp(45, "Rohit", 45),
				new Emp(7, "Dhoni", 7),
				new Emp(12, "UV", 12));
		System.out.println("Employee Details");
		emps.stream()
		.filter(emp -> emp.esal>12)
		.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		
		//method Reference
		emps.stream()
		.filter(Emp::salaryCheck)
		.forEach(System.out::println);
		
		//name starts with 
		System.out.println("name starts with");
		emps.stream()
		.filter(Emp::nameCheck)
		.forEach(System.out::println);
		
		
	}

}
