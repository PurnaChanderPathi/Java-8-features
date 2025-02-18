package com.purna.designpatterns;

public class SingletonDisgnPattern {
	
	private static SingletonDisgnPattern disgnPattern;
	
	private SingletonDisgnPattern() {	
		if(disgnPattern != null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
	}
	
	
	// lazy way of creating singleton object
	public static SingletonDisgnPattern getPattern() {
		
		if(disgnPattern == null) {
			synchronized (SingletonDisgnPattern.class) {
				if(disgnPattern == null) { 
					disgnPattern = new SingletonDisgnPattern();
				}
			}
		}
		return disgnPattern;
	}
	
	
	// make constructor private
	
	// object create with the help of method
	
	//create field to store object is private

}
