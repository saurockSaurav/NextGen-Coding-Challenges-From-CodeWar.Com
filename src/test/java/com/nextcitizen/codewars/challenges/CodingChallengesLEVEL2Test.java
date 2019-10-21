package com.nextcitizen.codewars.challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodingChallengesLEVEL2.class)
public class CodingChallengesLEVEL2Test {
	
	@Autowired
	private CodingChallengesLEVEL2 codingChallengesLEVEL2;
	
	
	/**
	 * Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers
	 *The four operators are "add", "subtract", "divide", "multiply".
	 * example: arithmetic(5, 2, "add")   => returns 7
	 */
	@Test
	public void test_findArithemticOpearationByOperator() {
		assertEquals(4, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "aDD"));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "subTracT"));
		assertEquals(1, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "DIVIDE"));
		assertEquals(6, codingChallengesLEVEL2.findArithemticOpearationByOperator(3, 2, "mulTIPLY"));
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void test_findArithemticOpearationByOperatorException() {
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "   "));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "DE"));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(3, 2, "PLY"));
	}
	
}
