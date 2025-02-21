package com.purna.lambda.methodReference;

public class Person {
	int age;
	String name;
	
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public int newAge()
	{
		return this.age+2;
	}

}
