package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Calculator;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("Run before all test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Run after all test cases");
	}
	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Run before each test cases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("Run after each test cases");
	}

	@Tag("Sum")
	@Test
	@DisplayName("Testing Sum")
	void testSum() {
		int actual =calculator.sum(10,20);
		assertEquals(30,actual,()->errorMessage());
	}
	public String errorMessage()
	{
		System.out.println("error");
		return "Expected one value but got different value";
	}
	@Test
	@DisplayName("Testing Multiply")
	void testMultiply() {
		int actual =calculator.multiply(5,6);
		assertEquals(30,actual,()->errorMessage());
		assertEquals(25,calculator.multiply(5, 5),()->errorMessage());
	}
}
