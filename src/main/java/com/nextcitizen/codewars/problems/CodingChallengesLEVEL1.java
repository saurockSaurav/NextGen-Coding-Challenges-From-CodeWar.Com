package com.nextcitizen.codewars.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CodingChallengesLEVEL1 {

	String appendedString = "";

	/*
	 * Write a Java program to print 'Hello' on screen and then print your name on a
	 * separate line
	 * 
	 */
	/*public static void main(String[] args) {
		CodingPuzzles obj = new CodingPuzzles();
		obj.isValidPin("121121");
		obj.printHelloInFirstLineAndNameInSecond("Hello", "Saurav");
		obj.printMultiplicationUpto10(8);
		obj.reverseStringUsingRecursiveMethod("123456");
		obj.takesUpto4DigitAfterAlphabetic("abcd1234");
	}*/

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.Finish the solution so
	 * that it returns the sum of all the multiples of 3 or 5 below the number
	 * passed in. Note: If the number is a multiple of both 3 and 5, only count it
	 * once.
	 */

	public int getSumOfNaturalNumber(int number) {
		int output = 0;

		for (int i = 1; i < number; i++) {
			if (i % 3 == 0) {
				output += i;
			}
			if (i % 5 == 0) {
				output += i;
			}
		}
		return output;
	}

	public String printHelloInFirstLineAndNameInSecond(String str1, String str2) {
		return str1 + "\n" + str2;
	}

	/*
	 * Write a Java program that takes a number as input and prints its
	 * multiplication table upto 10
	 * 
	 */
	public List<Integer> printMultiplicationUpto10(Integer input) {
		List<Integer> aList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			aList.add(input * i);
		}
		return aList;
	}

	/*
	 * Write a Java Program that reverse the string using recursive method.
	 * 
	 */
	public String reverseStringUsingRecursiveMethod(String input) {

		if ((!StringUtils.isEmpty(input))) {
			Character outputString = input.charAt(input.length() - 1);
			appendedString += outputString;
			String remainingInput = input.substring(0, input.length() - 1);
			reverseStringUsingRecursiveMethod(remainingInput);
		}
		return appendedString;
	}

	/*
	 * Write a Java program to count the letters, spaces, numbers and other
	 * characters of an input string
	 */
	Map<String, Integer> mp = new HashMap<>();
	Integer letterCount;

	/*
	 * public Map<String, Integer> countLetterSpaceNumberAndCharacter(String input){
	 * 
	 * 
	 * if(!StringUtils.isEmpty(input)) { for(int i = 0; i < input.length(); i++) {
	 * Character.isLetter(input.charAt(i)); letterCount ++; }
	 * mp.put("LetterCount",letterCount ); }
	 * 
	 * return mp; }
	 */

	/*
	 * write a Java program to find the smallest number from array
	 * 
	 */

	public int getSmallestNumber(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	/*
	 * write a Java program to find the largest number from array
	 * 
	 */

	public int getlargestNumber(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	/*
	 * write a Java program to find the smalles and largest number from list
	 * 
	 */

	public List<Integer> findSmallestAndLargestNumber(List<Integer> inputList) {
		List<Integer> outputList = new ArrayList<>();
		Collections.sort(inputList);
		outputList.add(inputList.get(0));
		outputList.add(inputList.get(inputList.size() - 1));
		return outputList;
	}

	/*
	 * 
	 * write a program that iterate through the list and modify the list in the same
	 * time
	 * 
	 */

	public void iterateAndModifyList(List<String> lsts) {

		lsts.add("Janurary");
		lsts.add("Feburary");
		lsts.add("March");
		lsts.add("April");
		lsts.add("May");
		lsts.add("June");
		lsts.add("July");

		for (String lst : lsts) {
			System.out.println(lst);

		}
	}

	/*
	 * write a java program that check the pin number, pin number must be numeric
	 * and minimum 4 and maximum 6 digit.
	 */

	public boolean isValidPin(String pin) {
		boolean isValidPin = false;

		if (((StringUtils.hasLength(pin) && pin.matches("[0-9]+")) && (pin.length() >= 4 && pin.length() <= 6))) {
			isValidPin = true;
		} 
		return isValidPin;
	}

	/*
	 * write a java program that can take up to 4 digits at end of Alphabetic letter. 
	 * Example: text---not match, text1---match , text12---match,mtext1234---match
	 */
	public boolean takesUpto4DigitAfterAlphabetic(String input) {

		boolean validInput = false;
		int only4DigitsAllowed = 0;
		//starting must be a letter and ending must be digit
		if (StringUtils.hasLength(input) && input.matches("[a-zA-Z].*") && input.matches(".*[0-9]")) {
			for (int i = 0; i < input.length(); i++) {
				Character charFromFirst = input.charAt(i);
				boolean isInputDigit = Character.isDigit(charFromFirst);
				if (isInputDigit) {
					if (only4DigitsAllowed < 4) {
						only4DigitsAllowed++;
					} else {
						return validInput;
					}
				}
			}
			validInput = true;
		}
		return validInput;
	}

	/*
	 * write a java program that takes only 3 digits int, all 3 numbers cannot be same, like CVV value in credit card
	 * Example: 000-- not valid, 100-- valid, 001-- valid, 111- not valid
	 * 
	 */
	
	public boolean isValidCVV(String input) {
		boolean validCVV = false;
		
		if (StringUtils.hasLength(input) && (input.matches("[0-9]+")  && input.length() == 3)) {
			for(int i = 0; i < input.length(); i++) {
				@SuppressWarnings("unused")
				Character charFromBegining = input.charAt(i);
			}
			validCVV= true;
		}
		
		return validCVV;
	}
	
	/** write a function that returns both the minimum and maximum number of the given list/array.
	 *Example: (new int[]{1,2,3,4,5}) == {1,5} **/
	
	public int[] miniumMaximum(int[] input) {
		int[] minMaxArr = new int[2];
		Arrays.sort(input);
		minMaxArr[0]= input[0];
		minMaxArr[1]= input[input.length-1];
		return minMaxArr;
	}
	
	/**
	 * Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even. 
	 * Give your answer in string format as 'odd' or 'even'.
	 * oddOrEven([2, 5, 34, 6]) returns "odd".
	 * 
	 */
	public String sumIsOddOrEven(int[] array) {
		int sumOfArray = 0;
		for (int i : array) {
			sumOfArray += i;
		}
		return sumOfArray % 2 == 0 ? "even" : "odd";
	}
	
	/**
	 * write a java program that will square every digit of a number.
	 * Example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
	 */
	public int squareDigits(int n) {
		System.out.println(n);

		String appendedSquares = "";
		int length = String.valueOf(n).length();
		for (int i = 0; i < length; i++) {
			int digitFromBegining = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
			int squareOfEachDigits = digitFromBegining * digitFromBegining;
			String intValueOfSquareDigit = String.valueOf(squareOfEachDigits);
			appendedSquares = appendedSquares.concat(intValueOfSquareDigit);
		}
		return Integer.valueOf(appendedSquares);
	}

	/**
	 * write a java program that takes array and find an index N where the sum of the integers 
	 * to the left of N is equal to the sum of the integers to the right of N. 
	 * If there is no index that would make this happen, return -1.
	 * Example: Let's say you are given the array {1,2,3,4,3,2,1}:
	 * Your function will return the index 3, because at the 3rd position of the array,
	 *  the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.
	 * Let's look at another one.
	 * you are given the array {1,100,50,-51,1,1}:
	 * Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index
	 *  ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.
	 */
	
	@SuppressWarnings("null")
	public int findEvenIndex(int[] arr) {
		// impelementation under progress
		return (Integer) null;
	  }

	/**
	 * Write a java program that validates the email address provided from the user
	 */
	public final boolean isValidEmail(String input) {
		boolean isValidEmail = false;
		if (StringUtils.hasLength(StringUtils.trimAllWhitespace(input)) && input.indexOf('@') >= 1) {
			String subStringFromAtTheRateTillEnd = input.substring(input.indexOf('@'), input.length());
			if (subStringFromAtTheRateTillEnd.indexOf('.') >= 0) {
				isValidEmail = true;
			}
		}
		return isValidEmail;
	}
	
	/**
	 * Write a java program that checks if Array Contains Multiple Values
	 */
	
	public final boolean doesArrayListContainsKeyWords(final String[] subset) {
		String[] vowels = { "A", "I", "E", "O", "U" };
		return Arrays.asList(vowels).containsAll(Arrays.asList(subset));
	}
	
	/**
	 * write a java program that checks if user input password form contains list of
	 * special characters
	 */
	
	public final boolean doesPasswordMeetsStandards(final String input) {
		boolean meetsTheStandards = false;

		if (StringUtils.hasLength(input) ){
			Pattern ptr = Pattern.compile("(^[a-zA-Z][\\']?[a-zA-Z\\s]+$)");
			java.util.regex.Matcher m = ptr.matcher(input);
			System.out.println(m);
			
			//&& (input.matches("[a-z]+") || input.matches("[A-Z]+"))
				///&& input.matches("[0-9]+")	
				//&& input.matches("_./\\@$*&!#-/")) {
			meetsTheStandards = true;
		}
		return meetsTheStandards;
	}
	
	/**If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.Finish the solution so that it returns the sum of all the multiples of 3 or 5 
	 * below the number passed in.
     * Note: If the number is a multiple of both 3 and 5, only count it once.
	 **/
	
	 public int getSumOfNaturalNumber(int number, int multiple1, int multiple2) {
	      int output = 0;
	      
	    for( int i = 1; i < number; i++ ){
	    	if (i % multiple1 == 0 || i % multiple2 == 0) {
	    		output += i;
	    	}
	    }
	       return output;
	  }
	 
	 /**
	  * Create a method that removes the first and last characters of a string.You're given one parameter, the original string.
	  * 
	  */
	public String removeFirstAndLastCharacter(String input) {

		if (StringUtils.hasText(input) && input.length() >= 2) {
			return input.substring(1, input.length() - 1);
		} else {
			throw new IllegalArgumentException("Method has been passed an illegal or inappropriate argument, Input cannot be null and length must be greater than 1 !!");
		}

	}
	 
		
}
