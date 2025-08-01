package com.swabhav.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.swabhav.model.MathUtils;

public class MathUtilTest {
    
	
	MathUtils demo=new MathUtils();
	
	
	@BeforeEach
	public void logSetup() {
		System.out.println("Start");
	}
	
	@AfterEach
	public void logTearDown() {
		System.out.println("Stop");
	}
	
	
	@DisplayName("Testing add method")
	@Test
	public void testAdd() {
	   assertEquals(10, demo.add(5, 5));
	}
	
	@DisplayName("Testing multiply method")
	@Test
	public void testMultiply() {
		assertEquals(10, demo.multiply(5, 2));
	}
	
	@DisplayName("Testing isEven method")
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,5})
	void testIsEven(int number) {
		
		assertTrue(demo.isEven(number));
	}
	
	
	
	
	
	
	
}
