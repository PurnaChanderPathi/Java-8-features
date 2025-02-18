package com.purna.designpatterns.AbstractDesignPattern;

public class Manager implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 80000;
	}

	@Override
	public String name() {
		System.out.println("I am Manager");
		return "Manager";
	}

}
