package com.nextcitizen.codewars.challenges;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nextcitizen.codewars.problems.CodingChallengesLEVEL1;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodingChallengesLEVEL1.class)
public class CodingChallengesLEVEL1Test {
	
	@Autowired
	private CodingChallengesLEVEL1 codingChallengesLEVEL1;
	
	/*
	 * Write a Java program to print 'Hello' on screen and then print your name on a separate line
	 * 
	 */
	
	@Test
	public void test_PrintHelloInFirstLineAndNameInSecond() {
		assertEquals("Hello\nSaurav", codingChallengesLEVEL1.printHelloInFirstLineAndNameInSecond("Hello", "Saurav"));
	}
	
	
	/*
	 *  Write a Java program that takes a number as input and prints its multiplication table up to 10
	 * 
	 */
	@Test
	public void test_PrintMultiplicationUpto10s() {
		List<Integer> aList = new ArrayList<Integer>( Arrays.asList(8, 16, 24, 32, 40, 48, 56, 64, 72, 80) );
		assertEquals(aList, codingChallengesLEVEL1.printMultiplicationUpto10(8));
	}
	
	/*
	 *Write a java program  that takes a String as input and reverse it using recursive method 
	 * 
	 */
	
	@Test
	public void test_ReverseStringUsingRecursiveMethods() {
		assertEquals("987654321", codingChallengesLEVEL1.reverseStringUsingRecursiveMethod("123456789"));
	}
	
	/*
	 * write a Java program to find the  smallest number from array
	 * 
	 */
	@Test
	public void test__GetSmallestNumber() {
		int[] arry = {10,20,5,80,99};
		assertEquals(5, codingChallengesLEVEL1.getSmallestNumber(arry));
		
	}

	/*
	 * write a Java program to find the  largest number from array
	 * 
	 */
	@Test
	public void test_GetlargestNumber() {
		int[] arry = {10,20,5,80,99};
		assertEquals(99, codingChallengesLEVEL1.getlargestNumber(arry));
	}
	
	/*
	 * write a Java program to find the  largest and smallest  number from array
	 * 
	 */
	@Test
	public void test_FindSmallestAndLargestNumber() {
		List<Integer> lst = new ArrayList<>(Arrays.asList(1,10,0,20));
		List<Integer> smallestAndLargest = new ArrayList<>(Arrays.asList(0,20));
		assertEquals(smallestAndLargest, codingChallengesLEVEL1.findSmallestAndLargestNumber(lst));
	}
	
	/*
	 * 
	 * 
	 */
	@Test
	 public void test_GetSumOfNaturalNumber() {
	      assertEquals(23, codingChallengesLEVEL1.getSumOfNaturalNumber(10));
	    }
	
	/*
	 * write a java program that check the pin number, pin number must be numeric 
	 * and minimum 4 and maximum 6 digit. 
	 */
	
	@Test
	public void test_IsValidPin() {
		assertFalse(codingChallengesLEVEL1.isValidPin("aaa"));
		assertFalse(codingChallengesLEVEL1.isValidPin("1234567"));
		assertTrue(codingChallengesLEVEL1.isValidPin("1234"));
		assertFalse(codingChallengesLEVEL1.isValidPin("1a2b3c"));
		assertFalse(codingChallengesLEVEL1.isValidPin("123"));
		assertFalse(codingChallengesLEVEL1.isValidPin("       "));
		assertFalse(codingChallengesLEVEL1.isValidPin(null));
	}
	
	/*
	 * write a java program that can take up to  4 digits at end of Alphabetic letter.
	 * Example: text---not match, text1---match , text12---match, text1234---match
	 */
	@Test
	public void test_IsTextAMatch() {
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text12345123"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("1234t"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("12345"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("t123ext"));
		assertTrue(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("t1"));
		assertTrue(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text1"));
		assertTrue(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text12"));
		assertTrue(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text1234"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text12345"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("text12345123"));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic(null));
		assertFalse(codingChallengesLEVEL1.takesUpto4DigitAfterAlphabetic("   "));
	}
	
	
	
	/*
	 * write a java program that takes only 3 digits int, numbers cannot be same, like CVV value in credit card
	 * Example: 000-- not valid, 100-- valid, 001-- valid, 111- not valid
	 */
	@Test
	public void test_IsValidCVV() {
		assertFalse(codingChallengesLEVEL1.isValidCVV(null));
		assertFalse(codingChallengesLEVEL1.isValidCVV("  "));
		assertFalse(codingChallengesLEVEL1.isValidCVV("a1c"));
		assertFalse(codingChallengesLEVEL1.isValidCVV("abc"));
		assertFalse(codingChallengesLEVEL1.isValidCVV("1ab"));
		assertFalse(codingChallengesLEVEL1.isValidCVV("ab1"));
		assertTrue(codingChallengesLEVEL1.isValidCVV("123"));
		assertFalse(codingChallengesLEVEL1.isValidCVV("1234"));
		
	}
	
	
	/** write a function that returns both the minimum and maximum number of the given list/array.
	 * Example: (new int[]{1,2,3,4,5}) == {1,5} **/
	@Test
    public void test_MinAndMAxArray() {
      assertArrayEquals(new int[]{1,5}, codingChallengesLEVEL1.miniumMaximum(new int[]{1,5,4}));
      assertArrayEquals(new int[]{5,2334454}, codingChallengesLEVEL1.miniumMaximum(new int[]{2334454,5}));
      assertArrayEquals(new int[]{1,1}, codingChallengesLEVEL1.miniumMaximum(new int[]{1}));
      assertArrayEquals(new int[]{-1,1}, codingChallengesLEVEL1.miniumMaximum(new int[]{0,-1,1}));
      assertArrayEquals(new int[]{-1,1}, codingChallengesLEVEL1.miniumMaximum(new int[]{0,-1,1,0,-1,1,0,-1,1}));
    }
	
	/**Second test cases by using random number **/
	@Test
	public void test_MinMaxRandomTest() {
		Random  rand = new Random();
		for (int i = 0; i < 20; i++) {
			int r = rand.nextInt();
			assertArrayEquals(new int[] { r, r }, codingChallengesLEVEL1.miniumMaximum(new int[] { r }));
		}
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
	public void test_FindEvenIndex() {
		assertEquals(3, codingChallengesLEVEL1.findEvenIndex(new int[] { 1, 2, 3, 4, 3, 2, 1 }));
		assertEquals(1, codingChallengesLEVEL1.findEvenIndex(new int[] { 1, 100, 50, -51, 1, 1 }));
		assertEquals(-1, codingChallengesLEVEL1.findEvenIndex(new int[] { 1, 2, 3, 4, 5, 6 }));
		assertEquals(3, codingChallengesLEVEL1.findEvenIndex(new int[] { 20, 10, 30, 10, 10, 15, 35 }));
		assertEquals(-1, codingChallengesLEVEL1.findEvenIndex(new int[] { -8505, -5130, 1926, -9026 }));
		assertEquals(1, codingChallengesLEVEL1.findEvenIndex(new int[] { 2824, 1774, -1490, -9084, -9696, 23094 }));
		assertEquals(6, codingChallengesLEVEL1.findEvenIndex(new int[] { 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4 }));
	}
	
	/**
	 * Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even. 
	 * Give your answer in string format as 'odd' or 'even'.
	 * oddOrEven([2, 5, 34, 6]) returns "odd".
	 * 
	 */
	@Test
    public void test_SumIsOddOrEven() {
        assertEquals("odd", codingChallengesLEVEL1.sumIsOddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", codingChallengesLEVEL1.sumIsOddOrEven(new int[] {2, 2, 2, 2}));
    }
	
	
	 @Test
	    public void test_SquareDigits() {
	      assertEquals(811181, codingChallengesLEVEL1.squareDigits(9119));
	      assertEquals(44991616, codingChallengesLEVEL1.squareDigits(223344));
	      assertEquals(149, codingChallengesLEVEL1.squareDigits(123));
	      assertEquals(0, codingChallengesLEVEL1.squareDigits(0));
	    }
	 
	/**
	 * Given the email address, check if it has valid content
	 * 
	 */

	@Test
	public void test_isValidEmail() {
		assertFalse(codingChallengesLEVEL1.isValidEmail(null));
		assertFalse(codingChallengesLEVEL1.isValidEmail("   "));
		assertFalse(codingChallengesLEVEL1.isValidEmail("JunitTest.com"));
		assertFalse(codingChallengesLEVEL1.isValidEmail("@JunitTest.com"));
		assertFalse(codingChallengesLEVEL1.isValidEmail("j@JunitTest,com"));
		assertTrue(codingChallengesLEVEL1.isValidEmail(".@JunitTest.com"));
		assertTrue(codingChallengesLEVEL1.isValidEmail("j@JunitTest.com"));
		assertTrue(codingChallengesLEVEL1.isValidEmail("JunitTest@JunitTest.com"));
	}
	
	/**
	 * Write a java program that checks if Array Contains Multiple Values
	 */
	@Test
	public void test_doesArrayListContainsKeyWords() {
		String[] keyword1 = { "E", "U" };
		assertTrue(codingChallengesLEVEL1.doesArrayListContainsKeyWords(keyword1));
	
		String[] keyword2 = {"E"};
		assertTrue(codingChallengesLEVEL1.doesArrayListContainsKeyWords(keyword2));
		
		String[] keyword3 = {"T"};
		assertFalse(codingChallengesLEVEL1.doesArrayListContainsKeyWords(keyword3));
		
		String[] keyword4 = {null};
		assertFalse(codingChallengesLEVEL1.doesArrayListContainsKeyWords(keyword4));
		
		String[] keyword5 = {" "};
		assertFalse(codingChallengesLEVEL1.doesArrayListContainsKeyWords(keyword5));
	}
	
	
	/**
	 * write a java program that checks if user input password form contains list of
	 * special characters
	 */
	@Ignore
	public void test_doesPasswordMeetsStandards() {
		assertFalse(codingChallengesLEVEL1.doesPasswordMeetsStandards("123"));
		assertTrue(codingChallengesLEVEL1.doesPasswordMeetsStandards("a1b2c3"));
	}
	
	/**If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.Finish the solution so that it returns the sum of all the multiples of 3 or 5 
	 * below the number passed in.
     * Note: If the number is a multiple of both 3 and 5, only count it once.
	 **/
	
	@Test
	 public void getSumOfNaturalNumber_Test() {
	      assertEquals(23, codingChallengesLEVEL1.getSumOfNaturalNumber(10,3,5));
	      assertEquals(27, codingChallengesLEVEL1.getSumOfNaturalNumber(10,2,7));
	    }
	
	/**
	 * Create a method that removes the first and last characters of a string.You're given one parameter, the original string.
	 * 
	 */
	@Test
	public void removeFirstAndLastCharacter_Test() {
		assertEquals("WhyisItRainin", codingChallengesLEVEL1.removeFirstAndLastCharacter(",WhyisItRaining"));
		assertEquals("hisIsJUnitTes", codingChallengesLEVEL1.removeFirstAndLastCharacter("ThisIsJUnitTest"));
	}
	/**
	 * test the above methods, where all the input string will throw RunTime exception. 
	 * 
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void removeFirstAndLastCharacterException_Test() {
		assertEquals(null, codingChallengesLEVEL1.removeFirstAndLastCharacter(null));
		assertEquals(null, codingChallengesLEVEL1.removeFirstAndLastCharacter("   "));
		assertEquals(null, codingChallengesLEVEL1.removeFirstAndLastCharacter("T"));
	}
	
}
