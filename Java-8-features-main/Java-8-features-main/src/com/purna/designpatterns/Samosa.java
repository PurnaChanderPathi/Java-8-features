package com.purna.designpatterns;

public class Samosa {
	
	
	//eager way of creating singleton object
	private static Samosa samosa = new Samosa();
	
	public static Samosa getSamosa() {
		return samosa;
	}

}
