package com.purna.lambda;
//Functional Interface and Lambda Expression
@FunctionalInterface
interface Greetings
{
	void greet();
}
public class LambdaExp1 {
	public static void main(String[] args) {
		
		Greetings g1 =() -> System.out.println("hello eidiko");
		g1.greet();
		
	}

}
// when we take multiple statements take the statements inside the {} braces