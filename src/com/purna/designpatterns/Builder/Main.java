package com.purna.designpatterns.Builder;

import com.purna.designpatterns.Builder.User.UserBuilder;

public class Main {

	public static void main(String[] args) {
		User user = new User.UserBuilder().setUserId("1").setUsername("Purna").setEmail("PurnaChanderPathi@gmail.com").build();
		System.out.println(user);
		
		User user2 = UserBuilder.builder().setUserId("2").setUsername("Swathi").setEmail("PathiSwathi@gmail.com").build();
		System.out.println(user2);
	}
}
