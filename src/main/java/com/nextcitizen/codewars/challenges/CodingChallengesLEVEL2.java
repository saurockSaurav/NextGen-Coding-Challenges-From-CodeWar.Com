package com.nextcitizen.codewars.challenges;

import org.springframework.stereotype.Component;

@Component
public class CodingChallengesLEVEL2 {
	
	
	/**
	 * Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers
	 *The four operators are "add", "subtract", "divide", "multiply".
	 * example: arithmetic(5, 2, "add")   => returns 7
	 */
	
	public int findArithemticOpearationByOperator(int input1, int input2, String operator) {
		int output = 0;

			if (operator.equalsIgnoreCase("ADD")) {
				output = input1 + input2;
			}

			else if (operator.equalsIgnoreCase("SUBTRACT")) {
				output = input1 - input2;
			}

			else if (operator.equalsIgnoreCase("DIVIDE")) {
				output = input1 / input2;
			}

			else if (operator.equalsIgnoreCase("MULTIPLY")) {
				output = input1 * input2;

		}
		else {
			throw new IllegalArgumentException("Method has been passed an illegal or inappropriate argument");
		}

		return output;
	}
}
