package com.purna.designpatterns;

import java.lang.reflect.Constructor;

public class CallSingleton {
public static void main(String[] args) throws Exception {
	
	SingletonDisgnPattern pattern = SingletonDisgnPattern.getPattern();
	
	System.out.println(pattern.hashCode());
//	
//	SingletonDisgnPattern pattern1 = SingletonDisgnPattern.getPattern();
//	
//	System.out.println(pattern1.hashCode());
//	
//	System.out.println(Samosa.getSamosa().hashCode());
//	
//	System.out.println(Samosa.getSamosa().hashCode());
	
	
	/**
	 * 1. reflection API to break singleton pattern
	 * solution :- if object is there ==> throw exception from inside constructor
	 * 2 -. use Enum
	 * 
	 * 
	 */
	
	Constructor<SingletonDisgnPattern> constructor = SingletonDisgnPattern.class.getDeclaredConstructor();
	constructor.setAccessible(true);
	SingletonDisgnPattern disgnPattern = constructor.newInstance();
	System.out.println(disgnPattern.hashCode());
}
}
