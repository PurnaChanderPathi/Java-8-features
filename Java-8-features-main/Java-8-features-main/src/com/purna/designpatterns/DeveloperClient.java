package com.purna.designpatterns;

public class DeveloperClient {

	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(employee.getSalary());
		
		Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println(employee1.getSalary());
	}
}
