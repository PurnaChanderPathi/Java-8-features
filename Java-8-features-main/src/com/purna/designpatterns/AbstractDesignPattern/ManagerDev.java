	package com.purna.designpatterns.AbstractDesignPattern;

public class ManagerDev extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Manager();
	}

}
