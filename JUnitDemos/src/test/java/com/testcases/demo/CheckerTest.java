package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Student;

class CheckerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	private Student student;
	@BeforeEach
	void setUp() throws Exception {
		student =new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Tag("prod")
	@Test
	void testCheckName() {
		assertTrue(student.checkName("remya"));
		assertTrue(student.checkName("Varun"));
		assertTrue(student.checkName("Devur"));
		assertTrue(student.checkName("Thathri"));
	}

}
