package com.nextcitizen.codewars.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.springframework.stereotype.Component;

@Component
public class CodingChallengesLEVEL2 {
	
	
	
	/**
	 * Reverse linked List 
	 * 
	 */

	public List<?> reverseTheLinkedList(){
		
		
		
		
		return null;
	}
	
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

	
	/**
	 * Given Two array, merged them into one single array and sort them from lowest to highest order.
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int[] sortAndMergeTwoArray(int[] arr1, int[] arr2) {
		int[] mergedAndSortedArry = new int[arr1.length + arr2.length];
		int lenOfArr1 = arr1.length;
		int i;

		// step 1: merge arr1 and arr2 into single array i.e mergedAndSortedArry
		for (i = 0; i < mergedAndSortedArry.length; i++) {
			if (i == arr1.length) {
				for (i = 0; i < arr2.length; i++) {
					mergedAndSortedArry[lenOfArr1] = arr2[i];
					lenOfArr1++;
				}
				break;
			} else {
				mergedAndSortedArry[i] = arr1[i];
			}
		}

		// step 2: sort the merged array in lowest to highest order and return the sorted Array.
		Arrays.sort(mergedAndSortedArry);
		
		return mergedAndSortedArry;
	}
	
	/**Complete the solution so that it splits the string into pairs of two characters. 
		If the string contains an odd number of characters then it should replace the missing second character 
		of the final pair with an underscore ('_').
		example: 
		StringSplit.solution("abc") // should return {"ab", "c_"}
		StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
	**/
	
	public String[] splitStringsIntoPairs(final String input) {
		
		char[]  inputArray = input.toCharArray();
		
	    String inputAsStringNow = String.valueOf(inputArray);
		
		String[] outputArray = null;

		double sizeOfOutputArray = input.length();

		System.out.println(sizeOfOutputArray);

		if (sizeOfOutputArray % 2 != 0) {

			double arrSize = sizeOfOutputArray / 2;
			
			int sizeOfOddArray = (int) Math.round(arrSize);
			
			outputArray = new String[sizeOfOddArray];
			
			for (int i = 0; i < sizeOfOddArray; i++) {
				
				if (String.valueOf(outputArray).equalsIgnoreCase(input)) {
					
				}
				
				outputArray[i] =  String.valueOf(inputAsStringNow.charAt(i)) + String.valueOf(inputAsStringNow.charAt(i+1));
				
			    System.out.println(outputArray);
			}

		}
		return outputArray;

	}
	
	//Given an input string, reverse the string word by word. For example Given s = "the sky is blue", return "blue is sky the".

	public String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");
		String result = "";
		for (int i = words.length - 1; i > 0; i--) {
			result += words[i] + " ";
		}

		return result + words[0];
	}
	
	// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

	public boolean isValidParentheses(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}
}

