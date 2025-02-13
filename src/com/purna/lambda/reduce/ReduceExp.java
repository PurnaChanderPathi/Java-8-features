package com.purna.lambda.reduce;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//note:-
//forEach(Consumer) :: accept(T)
//forEach(biConsumer) :: accept(T1,T2)
//Filter(Predicate) :: Test(T)
//Map(function) :: apply(T)
//reduce(BinaryOperator) :: apply(T1,T2)
// reduce() method
//this method perform the operations with all elements and return one value
public class ReduceExp {

	public static void main(String[] args) {
		List<Integer> price = List.of(1,2,3,4,5,6,7,8,9);
		 int totalPrice=price.stream()
		.reduce((i,j) -> i+j)
		.get();
		 System.out.println(totalPrice);
		 
		 //filter "r" "p" == 4 : add every name with +"it" :: combined all elements
		 
		 List<String> names = List.of("purna","raju","rani","poem","path");
		  String totalName =names.stream()
				 .filter((name -> name.startsWith("p") && name.length()==4 || name.startsWith("r")  && name.length()==4))
				 .map(name -> name+"it").reduce((i,j)->i+j).get();
		  System.out.println(totalName);
		  
//number : filter<10 :: every element multiply with 10 and do addition of all numbers
			
		   List<Integer> ranks = List.of(1,2,3,4,5,6,7,8,9);
		   int totalRanks =ranks.stream()
		   .filter(rank -> rank<10)
		   .map(rank -> rank*10)
		   .reduce((rank1,rank2)-> rank1+rank2)
		   .get();
		   
		   System.out.println(totalRanks);
		   
		   int totalR = ranks.stream().filter(i -> i<5).map(rank -> rank*5).reduce((rank1,rank2) -> rank1+rank2).get();
		   System.out.println(totalR);
		   
		   List<String> listNames = List.of("Purna","Chander","Swathi","Raghu","Krishna");
		   
		   String strTotal = listNames.stream().filter(name -> name.startsWith("K") && name.length() >=4)
				   .map(name -> "Pathi ".concat(name)).reduce((x,y) -> x+y).get();
		   System.out.println(strTotal);
						 
		   List<String> addSurname = listNames.stream().map(name -> "Pathi ".concat(name)).collect(Collectors.toList());
		   System.out.println(addSurname);
						 
		

	}

}
