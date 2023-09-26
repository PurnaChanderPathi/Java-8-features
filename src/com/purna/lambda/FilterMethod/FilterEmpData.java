package com.purna.lambda.FilterMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEmpData {

	public static void main(String[] args) {
		
		List<Emp> emps = Arrays.asList(new Emp(1, "purna", 25000),
									new Emp(2, "Shiva", 50000),
									new Emp(3, "Ajeeth", 75000),
									new Emp(4, "Sreenath", 100000));
		//Filter the data and print the data
		System.out.println("Filter the data and print the data");
		 emps.stream()
				.filter(i -> i.ename.startsWith("S") )
				.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		 
		//Filter the data and print the data in list format who's salary greater then 50000
		 System.out.println("Filter the data and print the data in list format who's salary greater then 50000");
		 emps.stream().filter(emp -> emp.esal>=50000).
		 collect(Collectors.toList()).
		 forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		 
		//Filter the data and print the data in set format who's salary greater then 50000
		 System.out.println("Filter the data and print the data in set format who's salary greater then 50000");
		 Set<Emp> setEmp = emps.stream().filter(emp -> emp.esal>=50000).
		 collect(Collectors.toSet());
		 setEmp.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		 
		 //Filter the data and find first element
		 System.out.println("Filter the data and find first element");
		 Emp e = emps.stream().
		 filter(emp -> emp.esal>25000).
		 findFirst().get();
		 System.out.println(e.eid+" "+e.ename+" "+e.esal);
		 
		//Filter the data and find first element if not null
		 System.out.println("Filter the data and find first element if not null");
		 Emp firstElement = emps.stream().
		 filter(emp -> emp.esal>35000).
		 findFirst().orElse(null);
		 
		 if(firstElement==null)
		 {
		 System.out.println(firstElement);
		 }
		 else
		 {
			 System.out.println(firstElement.eid+" "+firstElement.ename+" "+firstElement.esal);
		 }
		 
		 //Filter the data and find Specific element
		 System.out.println("Filter the data and find Specific element if not null");
		 Emp SpecificElement = emps.stream().
		 filter(emp -> emp.esal>35000).skip(2).
		 findFirst().get();
		 System.out.println(SpecificElement.eid+" "+SpecificElement.ename+" "+SpecificElement.esal);
		 
		
	}

}
