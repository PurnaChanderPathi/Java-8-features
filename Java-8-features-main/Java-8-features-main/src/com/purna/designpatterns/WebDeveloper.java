package com.purna.designpatterns;

public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Web Developer salary");
		return 40000;
	}

}
