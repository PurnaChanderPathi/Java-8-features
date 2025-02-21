package com.purna.codeDecode;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		Function<Integer, Integer> squareMe = i -> i*2;
		System.out.println("Square of given no  "+squareMe.apply(5));
		
		Function<Integer, Integer> cubeMe = i -> i*i*i;
		System.out.println("Cude of given no  "+cubeMe.apply(5));
		
		System.out.println("First doubling using andThen " + squareMe.andThen(cubeMe).apply(2));
		
		System.out.println("First cubing using compose " + squareMe.compose(cubeMe).apply(2));
	}
}
