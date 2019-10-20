package com.nextcitizen.CodingPuzzles;

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


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodingPuzzles.class)
public class CodingPuzzlesTest {
	
	@Autowired
	private CodingPuzzles codingPuzzles;
	
	/*
	 * Write a Java program to print 'Hello' on screen and then print your name on a separate line
	 * 
	 */
	
	@Test
	public void test_PrintHelloInFirstLineAndNameInSecond() {
		assertEquals("Hello\nSaurav", codingPuzzles.printHelloInFirstLineAndNameInSecond("Hello", "Saurav"));
	}
	
	
	/*
	 *  Write a Java program that takes a number as input and prints its multiplication table up to 10
	 * 
	 */
	@Test
	public void test_PrintMultiplicationUpto10s() {
		List<Integer> aList = new ArrayList<Integer>( Arrays.asList(8, 16, 24, 32, 40, 48, 56, 64, 72, 80) );
		assertEquals(aList, codingPuzzles.printMultiplicationUpto10(8));
	}
	
	/*
	 *Write a java program  that takes a String as input and reverse it using recursive method 
	 * 
	 */
	
	@Test
	public void test_ReverseStringUsingRecursiveMethods() {
		assertEquals("987654321", codingPuzzles.reverseStringUsingRecursiveMethod("123456789"));
	}
	
	/*
	 * write a Java program to find the  smallest number from array
	 * 
	 */
	@Test
	public void test__GetSmallestNumber() {
		int[] arry = {10,20,5,80,99};
		assertEquals(5, codingPuzzles.getSmallestNumber(arry));
		
	}

	/*
	 * write a Java program to find the  largest number from array
	 * 
	 */
	@Test
	public void test_GetlargestNumber() {
		int[] arry = {10,20,5,80,99};
		assertEquals(99, codingPuzzles.getlargestNumber(arry));
	}
	
	/*
	 * write a Java program to find the  largest and smallest  number from array
	 * 
	 */
	@Test
	public void test_FindSmallestAndLargestNumber() {
		List<Integer> lst = new ArrayList<>(Arrays.asList(1,10,0,20));
		List<Integer> smallestAndLargest = new ArrayList<>(Arrays.asList(0,20));
		assertEquals(smallestAndLargest, codingPuzzles.findSmallestAndLargestNumber(lst));
	}
	
	/*
	 * 
	 * 
	 */
	@Test
	 public void test_GetSumOfNaturalNumber() {
	      assertEquals(23, codingPuzzles.getSumOfNaturalNumber(10));
	    }
	
	/*
	 * write a java program that check the pin number, pin number must be numeric 
	 * and minimum 4 and maximum 6 digit. 
	 */
	
	@Test
	public void test_IsValidPin() {
		assertFalse(codingPuzzles.isValidPin("aaa"));
		assertFalse(codingPuzzles.isValidPin("1234567"));
		assertTrue(codingPuzzles.isValidPin("1234"));
		assertFalse(codingPuzzles.isValidPin("1a2b3c"));
		assertFalse(codingPuzzles.isValidPin("123"));
		assertFalse(codingPuzzles.isValidPin("       "));
		assertFalse(codingPuzzles.isValidPin(null));
	}
	
	/*
	 * write a java program that can take up to  4 digits at end of Alphabetic letter.
	 * Example: text---not match, text1---match , text12---match, text1234---match
	 */
	@Test
	public void test_IsTextAMatch() {
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("text12345123"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("text"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("1234t"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("12345"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("t123ext"));
		assertTrue(codingPuzzles.takesUpto4DigitAfterAlphabetic("t1"));
		assertTrue(codingPuzzles.takesUpto4DigitAfterAlphabetic("text1"));
		assertTrue(codingPuzzles.takesUpto4DigitAfterAlphabetic("text12"));
		assertTrue(codingPuzzles.takesUpto4DigitAfterAlphabetic("text1234"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("text12345"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("text12345123"));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic(null));
		assertFalse(codingPuzzles.takesUpto4DigitAfterAlphabetic("   "));
	}
	
	
	
	/*
	 * write a java program that takes only 3 digits int, numbers cannot be same, like CVV value in credit card
	 * Example: 000-- not valid, 100-- valid, 001-- valid, 111- not valid
	 */
	@Test
	public void test_IsValidCVV() {
		assertFalse(codingPuzzles.isValidCVV(null));
		assertFalse(codingPuzzles.isValidCVV("  "));
		assertFalse(codingPuzzles.isValidCVV("a1c"));
		assertFalse(codingPuzzles.isValidCVV("abc"));
		assertFalse(codingPuzzles.isValidCVV("1ab"));
		assertFalse(codingPuzzles.isValidCVV("ab1"));
		assertTrue(codingPuzzles.isValidCVV("123"));
		assertFalse(codingPuzzles.isValidCVV("1234"));
		
	}
	
	
	/** write a function that returns both the minimum and maximum number of the given list/array.
	 * Example: (new int[]{1,2,3,4,5}) == {1,5} **/
	@Test
    public void test_MinAndMAxArray() {
      assertArrayEquals(new int[]{1,5}, codingPuzzles.miniumMaximum(new int[]{1,5,4}));
      assertArrayEquals(new int[]{5,2334454}, codingPuzzles.miniumMaximum(new int[]{2334454,5}));
      assertArrayEquals(new int[]{1,1}, codingPuzzles.miniumMaximum(new int[]{1}));
      assertArrayEquals(new int[]{-1,1}, codingPuzzles.miniumMaximum(new int[]{0,-1,1}));
      assertArrayEquals(new int[]{-1,1}, codingPuzzles.miniumMaximum(new int[]{0,-1,1,0,-1,1,0,-1,1}));
    }
	
	/**Second test cases by using random number **/
	@Test
	public void test_MinMaxRandomTest() {
		Random  rand = new Random();
		for (int i = 0; i < 20; i++) {
			int r = rand.nextInt();
			assertArrayEquals(new int[] { r, r }, codingPuzzles.miniumMaximum(new int[] { r }));
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
		assertEquals(3, codingPuzzles.findEvenIndex(new int[] { 1, 2, 3, 4, 3, 2, 1 }));
		assertEquals(1, codingPuzzles.findEvenIndex(new int[] { 1, 100, 50, -51, 1, 1 }));
		assertEquals(-1, codingPuzzles.findEvenIndex(new int[] { 1, 2, 3, 4, 5, 6 }));
		assertEquals(3, codingPuzzles.findEvenIndex(new int[] { 20, 10, 30, 10, 10, 15, 35 }));
		assertEquals(-1, codingPuzzles.findEvenIndex(new int[] { -8505, -5130, 1926, -9026 }));
		assertEquals(1, codingPuzzles.findEvenIndex(new int[] { 2824, 1774, -1490, -9084, -9696, 23094 }));
		assertEquals(6, codingPuzzles.findEvenIndex(new int[] { 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4 }));
	}
	
	/**
	 * Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even. 
	 * Give your answer in string format as 'odd' or 'even'.
	 * oddOrEven([2, 5, 34, 6]) returns "odd".
	 * 
	 */
	@Test
    public void test_SumIsOddOrEven() {
        assertEquals("odd", codingPuzzles.sumIsOddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", codingPuzzles.sumIsOddOrEven(new int[] {2, 2, 2, 2}));
    }
	
	
	 @Test
	    public void test_SquareDigits() {
	      assertEquals(811181, codingPuzzles.squareDigits(9119));
	      assertEquals(44991616, codingPuzzles.squareDigits(223344));
	      assertEquals(149, codingPuzzles.squareDigits(123));
	      assertEquals(0, codingPuzzles.squareDigits(0));
	    }
	 
	/**
	 * Given the email address, check if it has valid content
	 * 
	 */

	@Test
	public void test_isValidEmail() {
		assertFalse(codingPuzzles.isValidEmail(null));
		assertFalse(codingPuzzles.isValidEmail("   "));
		assertFalse(codingPuzzles.isValidEmail("JunitTest.com"));
		assertFalse(codingPuzzles.isValidEmail("@JunitTest.com"));
		assertFalse(codingPuzzles.isValidEmail("j@JunitTest,com"));
		assertTrue(codingPuzzles.isValidEmail(".@JunitTest.com"));
		assertTrue(codingPuzzles.isValidEmail("j@JunitTest.com"));
		assertTrue(codingPuzzles.isValidEmail("JunitTest@JunitTest.com"));
	}
	
	/**
	 * Write a java program that checks if Array Contains Multiple Values
	 */
	@Test
	public void test_doesArrayListContainsKeyWords() {
		String[] keyword1 = { "E", "U" };
		assertTrue(codingPuzzles.doesArrayListContainsKeyWords(keyword1));
	
		String[] keyword2 = {"E"};
		assertTrue(codingPuzzles.doesArrayListContainsKeyWords(keyword2));
		
		String[] keyword3 = {"T"};
		assertFalse(codingPuzzles.doesArrayListContainsKeyWords(keyword3));
		
		String[] keyword4 = {null};
		assertFalse(codingPuzzles.doesArrayListContainsKeyWords(keyword4));
		
		String[] keyword5 = {" "};
		assertFalse(codingPuzzles.doesArrayListContainsKeyWords(keyword5));
	}
	
	
	/**
	 * write a java program that checks if user input password form contains list of
	 * special characters
	 */
	@Ignore
	public void test_doesPasswordMeetsStandards() {
		assertFalse(codingPuzzles.doesPasswordMeetsStandards("123"));
		assertTrue(codingPuzzles.doesPasswordMeetsStandards("a1b2c3"));
	}
	
	/**If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.Finish the solution so that it returns the sum of all the multiples of 3 or 5 
	 * below the number passed in.
     * Note: If the number is a multiple of both 3 and 5, only count it once.
	 **/
	
	@Test
	 public void getSumOfNaturalNumber_Test() {
	      assertEquals(23, codingPuzzles.getSumOfNaturalNumber(10,3,5));
	      assertEquals(27, codingPuzzles.getSumOfNaturalNumber(10,2,7));
	    }
	
}
