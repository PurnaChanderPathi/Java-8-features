package com.purna.lambda;
//Functional Interface and Lambda Expression
@FunctionalInterface
interface Service
{
	String login(String username, String password);
}

public class LambdaExp3 {
	public static void main(String[] args) {
		
		Service s1 = ( username,  password) -> {
			return username.equalsIgnoreCase("purna")&& password.equals("purna123")?"Login Success":"Login Failed";
		};
		String Result= s1.login("purna", "purna123");
		System.out.println("Your Login Status 1: "+Result);
		
		Service s2 = ( username,  password) -> 
			 username.equalsIgnoreCase("purna")&& password.equals("purna")?"Login Success":"Login Failed";
	
		String Results= s2.login("purna", "purna123");
		System.out.println("Your Login Status 2: "+Results);
	}

}
