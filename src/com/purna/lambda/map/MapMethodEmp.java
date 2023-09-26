package com.purna.lambda.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapMethodEmp {

	public static void main(String[] args) {

		List<Emp> emps = List.of(new Emp(1, "Virat", 18),
								new Emp(2, "Rohit", 45),
								new Emp(3, "Dhoni", 7),
								new Emp(4, "Sachin", 10));
		
		emps.stream()
		.map(emp -> emp.getEname()+" "+"Cricketer")
		.forEach(emp -> System.out.println(emp));

		//Filter people who get salary more then 18 add 1 then print the data
		emps.stream()
		.filter(emp -> emp.getEsal()>=18)
		.map(emp ->{ emp.setEsal(emp.getEsal()+1);return emp;})
		.forEach(emp -> System.out.println(emp));
		
		//adding extra name for specific selected enames and saving in list format
		List<Emp> employee = emps.stream()
		.filter(emp -> emp.getEsal()>=18)
		.map(emp -> {emp.setEname(emp.getEname()+" "+"Cricketer"); return emp;})
		.collect(Collectors.toList());
		employee.forEach(emp -> System.out.println(emp));
		
		
		
		 
		
	}

}
