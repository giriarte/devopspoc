package com.giriarte.hellodevops.hellodevops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingBuilderTest {

	@Test
	public void greetingBuilderTest() {
		String name = "YourName";
		String expectedMessage = "Hello! " + name;
		assertEquals(expectedMessage, GreetingBuilder.buildGreeting(name));
	}

}
