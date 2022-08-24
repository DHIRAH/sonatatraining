package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.test.Calculator;

@SpringBootTest
class SonatatrainingApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void divTest()
	{
		Calculator c3 = new Calculator();
		int x =c3.div(1,1);
		assertThrows(ArithmeticException.class,()->c3.div(1,0),"it is an array");
		
	}
	/*@Test
	public void divTest1()
	{
		Calculator c3 = new Calculator();
		int x =c3.div(1,1);
		assertThrows(ArithmeticException.class,()->c3.div(1,1),"it is an array");
		
	}
*/
}
