package com.purna.designpatterns.AbstractDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
