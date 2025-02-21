package com.purna.lambda.sorting;

import java.util.Arrays;
import java.util.List;

public class EmpSort {

	public static void main(String[] args) {
		
		List<Emp> emps = Arrays.asList(new Emp(18, "Virat", 18),
									new Emp(45, "Rohit", 45),
									new Emp(7, "Dhoni", 7),
									null,
									new Emp(10, "Sachin", 10),
									new Emp(12, "Yuvraj", 12));
		
//		//sort based on list.sort
//		emps.sort((e1,e2)-> e1.eid.compareTo(e2.eid));
//		emps.forEach(emp -> System.out.println(emp));
//		
//		//decending oder of employee name
//		System.out.println("decending oder of employee name ");
//		emps.sort((e1,e2)-> -e1.ename.compareTo(e2.ename));
//		emps.forEach(emp -> System.out.println(emp));
		
		//sort based on stream.sort
		System.out.println("stream sort");
		emps.stream()
		.filter(emp -> emp!=null)
		.filter(emp -> emp.esal<18)
		.sorted((e1,e2)->e1.esal.compareTo(e2.esal))
		.forEach(emp -> System.out.println(emp));

	}

}
