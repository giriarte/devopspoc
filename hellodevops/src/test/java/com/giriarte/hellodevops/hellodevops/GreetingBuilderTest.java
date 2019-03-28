package com.giriarte.hellodevops.hellodevops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingBuilderTest {

	@Test
	public void greetingBuilderTest() {
		String name = "YourName";
		String expectedMessage = "Hello! " + name;
		assertEquals(expectedMessage, GreetingBuilder.buildGreeting(name));
	}

}
