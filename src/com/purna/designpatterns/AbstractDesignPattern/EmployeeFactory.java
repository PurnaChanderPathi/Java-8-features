package com.purna.designpatterns.AbstractDesignPattern;

public class EmployeeFactory {
	

	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
		}

}
