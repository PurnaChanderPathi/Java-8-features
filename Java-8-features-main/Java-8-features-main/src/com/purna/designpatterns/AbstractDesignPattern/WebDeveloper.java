package com.purna.designpatterns.AbstractDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 40000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am Web Developer");
		return "Web Developer";
	}

}
