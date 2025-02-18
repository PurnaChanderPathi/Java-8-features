package com.purna.lambda;
//Functional Interface and Lambda Expression

@FunctionalInterface
interface Services
{
	String userDetails(Integer userage,String username, String location);
}

public class LambdaExp4 {
	public static void main(String[] args) {
		
		Services s1 =( userage, username,location) -> username!="" && location.equals("Hyderabad") && 
				userage>=18?"You are Eligible":"You are not Eligible";
				
				Object result= s1.userDetails(18, "purna", "Hyderabad");
				System.out.println("Vote Status :"+result); 
	}

}
