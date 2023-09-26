package com.purna.lambda;
//Functional Interface and Lambda Expression
interface operations
{
	void add(int num1,int num2);
}

public class LambdaExp2 {

	public static void main(String[] args) {
		operations op1 = (int num1,int num2) -> System.out.println("Adding two number:"+(num1+num2));
		op1.add(10, 20);
		
		operations op2 = ( num1, num2) -> System.out.println("Adding two number:"+(num1+num2));
		op2.add(100, 200);

	}

}
// When we take the Lambda arguments the type of arguments is optional
