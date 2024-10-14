package com.testcases.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.exception.InvalidMarksException;
import com.shristi.training.Student;

public class StudentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private Student student;
	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing total marks")
	void testTotalMarks() {
		int actual=student.totalMarks(90,90,80);
		assertEquals(260,actual,"no match");
	}
	@Tag("prod")
	@Test
	@DisplayName("Testing negative marks")
	void testNegTotalMarks() {
		//int actual=student.totalMarks(-90, -90, 80);
		//assertEquals(260,actual,"no match");
		assertThrows(InvalidMarksException.class,()->student.totalMarks(-90, -90, 80));
	}
	
	@Test
	@DisplayName("Testing greater total marks")
	void testGreaterTotalMarks() {
		assertThrows(InvalidMarksException.class,()->student.totalMarks(90, 290, 180));
	}

}
