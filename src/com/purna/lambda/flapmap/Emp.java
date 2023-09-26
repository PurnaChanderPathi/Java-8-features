package com.purna.lambda.flapmap;

import java.util.List;

public class Emp {
	String name;
	List<Long> phones;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getPhones() {
		return phones;
	}
	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}
	public Emp(String name, List<Long> phones) {
		super();
		this.name = name;
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + "]";
	}
	
	
}
