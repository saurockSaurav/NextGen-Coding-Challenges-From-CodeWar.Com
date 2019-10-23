package com.nextcitizen.codewars.challenges;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CodingChallengesLEVEL2 {

	/**
	 * Given two numbers and an arithmetic operator (the name of it, as a string),
	 * return the result of the two numbers The four operators are "add",
	 * "subtract", "divide", "multiply". example: arithmetic(5, 2, "add") => returns
	 * 7
	 */

	public int findArithemticOpearationByOperator(int input1, int input2, String operator) {
		int output = 0;

		if (operator.equalsIgnoreCase("ADD")) {
			output = input1 + input2;
		} else if (operator.equalsIgnoreCase("SUBTRACT")) {
			output = input1 - input2;
		} else if (operator.equalsIgnoreCase("DIVIDE")) {
			output = input1 / input2;
		} else if (operator.equalsIgnoreCase("MULTIPLY")) {
			output = input1 * input2;

		} else {
			throw new IllegalArgumentException("Method has been passed an illegal or inappropriate argument");
		}
		return output;
	}

	/**
	 * Your task is to convert strings to how they would be written by Jaden Smith.
	 * The strings are actual quotes from Jaden Smith, but they are not capitalized
	 * in the same way he originally typed them.
	 * 
	 * Example: Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
	 * 
	 * Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real
	 * 
	 */

	public String convertStringToJadenSmithFormat(String input) {
		return null;
	}

	/**
	 *
	 * Check to see if a string has the same amount of 'x's and 'o's. The method
	 * must return a boolean and be case insensitive. The string can contain any
	 * char.
	 * 
	 * Examples input/output: XO("ooxx") => true XO("xooxx") => false XO("ooxXm") =>
	 * true XO("zpzpzpp") => true // when no 'x' and 'o' is present should return
	 * true XO("zzoo") => false
	 * 
	 */
	public boolean hasEquaslAmountOfXandO(String str) {
		final String formattedInput = str.toLowerCase();
		int countOfX = 0;
		int countOfO = 0;

		if (formattedInput.contains("x") && formattedInput.contains("o")) {

			for (int i = 0; i < formattedInput.length(); i++) {
				if (formattedInput.charAt(i) == 'x') {
					countOfX++;
				}

				if (formattedInput.charAt(i) == 'o') {
					countOfO++;
				}
			}

			if (countOfX == countOfO) {
				return true;
			}
		}

		else if (!formattedInput.contains("x") && !formattedInput.contains("o")) {
			return true;
		}

		return false;
	}
	
	/**
	 *function receives an array of integers as input. Your task is to determine whether the numbers are in ascending order. 
	 *An array is said to be in ascending order if there are no two adjacent integers where the left integer exceeds the right integer in value. 
	 * 
	 * Example:
	 * 		isAscOrder(new int[]{1,2,4,7,19}) == true
			isAscOrder(new int[]{1,2,3,4,5}) == true
			isAscOrder(new int[]{1,6,10,18,2,4,20}) == false
			isAscOrder(new int[]{9,8,7,6,5,4,3,2,1}) == false
	 * 
	 */
	
	
	public boolean isNumberInAscendingOrder(int [] arr) {
		
		//copy the input array into a new arrays
		int [] copyOfArr = Arrays.copyOf(arr, arr.length);
		
		//now sort the input array
		Arrays.sort(arr);
		
		//after sorting, if sorted array and Original array that we copied have same element in same order, then input received was in Ascending order. 
		return (Arrays.equals(arr, copyOfArr));
		
	}

}
