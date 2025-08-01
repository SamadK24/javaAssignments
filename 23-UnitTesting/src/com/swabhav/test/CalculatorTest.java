package com.swabhav.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.swabhav.model.Calculator;
@DisplayName("Testing of Calculator Class")
public class CalculatorTest {
 
	
	Calculator cal=new Calculator();
	
	@BeforeAll
	public static void start() {
		System.out.println("Before running any test");
	}
	
	@AfterAll
	public static void endTest() {
		System.out.println("After running all the test");
	} 
	
	@Test
	@DisplayName("Testing of two numbers")
	public void additionTest() {
		int sum= cal.addition(2, 5);
		assertEquals(7, sum);
	}
	
	@BeforeEach
	public void beforeTest() {
		System.out.println("Before new test");
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("After completing a test");
	}
	
	@Test
	public void subtractionTest() {
		assertEquals(5, cal.subtraction(10, 5));
	}
	
	@Test
	@Disabled("Under Development")
	public void testTrue() {
		int age=20;
		assertTrue(age>18);
	}
	
	@Tag("slow")
	@Test
	public void testFalse() {
		int age=20;
		assertFalse(age<15);			
	}
	
	@Test
	public void divisionTest() {
		//assertThrows(ArithmeticException.class,()->cal.division(10, 0));
		assertDoesNotThrow(()->cal.division(10, 10));
	}
	
	@RepeatedTest(name= "Test {currentRepetition} of {totalRepetitions}",value=5)
	public void randomNumberTest() {
		Random random=new Random();
		int count=random.nextInt(100);
		assertTrue(count>=0 && count<100);
	}
	
	
	
	
}
