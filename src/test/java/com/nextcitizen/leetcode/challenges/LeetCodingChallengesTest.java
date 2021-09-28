package com.nextcitizen.leetcode.challenges;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nextcitizen.leetcode.problems.LeetCodeAssesment;

@SpringBootTest(classes = LeetCodeAssesment.class)
public class LeetCodingChallengesTest {

	private LeetCodeAssesment leetCodeAssesment ;

	@Before
	public void setUp() {
		this.leetCodeAssesment = new LeetCodeAssesment();
	}
	
	
	@Test
	public void test_isPalindrome() {
		
		assertThat(leetCodeAssesment.isPalindrome(0)).isTrue();
		
		assertThat(leetCodeAssesment.isPalindrome(121)).isTrue();
		
		assertThat(leetCodeAssesment.isPalindrome(-121)).isFalse();
		
		assertThat(leetCodeAssesment.isPalindrome(10)).isFalse();
		
		
		
	}
	
	
	@Test
	public void test_doesArrayContainsDuplicate() {
		int num1[] = { 7, 1, 9, 8, 3, 7 };
		assertThat(leetCodeAssesment.doesArrayContainsDuplicate(num1)).isTrue();
		
		int num2[] = { 4, 3, 2, 9, 0, 1, 13 };
		assertThat(leetCodeAssesment.doesArrayContainsDuplicate(num2)).isFalse();
		
	}
	
	@Test
	public void test_findMaximumWealth() {
		
		int[][] num1 = {{1,2,3},{0,2,1 }};
		assertThat(leetCodeAssesment.findMaximumWealth(num1)).isEqualTo(6);
	}
	
	
	
	@Test
	public void test_findNumberThatAppearTwice() {
		
		int num1[] = { 4,3,2,7,8,2,3,1 };
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(2);
		aList.add(3);
		assertEquals(leetCodeAssesment.findAllDuplicatesInArray(num1), aList);
		
	}
	
	
	@Test
	public void test_findNumberThatIsNotRepititive() {
		int num1[] = { 7, 1, 7, 2, 3, 3, 1 };
		assertThat(leetCodeAssesment.findNumberThatIsNotRepititive(num1)).isEqualTo(2);
		
		int num2[] = { 0, 9, 8, 9, 8, 1, 0 };
		assertThat(leetCodeAssesment.findNumberThatIsNotRepititive(num2)).isEqualTo(1);
		
		int num3[] = { 4, 3, 2, 4, 0, 2, 3 };
		assertThat(leetCodeAssesment.findNumberThatIsNotRepititive(num3)).isEqualTo(0);
		
	}
	

	@Test
	public void test_isHappyNumber() {
		assertThat(leetCodeAssesment.isHappyNumber(19)).isFalse();
	}
	
	
	@Test
	public void test_MaxProfit() {
		int price1[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit1 = leetCodeAssesment.maxProfitByBruteForce(price1);
		assertThat(maxProfit1).isEqualTo(5);
		
		int price2[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit2 = leetCodeAssesment.maxProfitBySimpleSolution(price2);
		assertThat(maxProfit2).isEqualTo(5);
	}
	
	@Test
	public void test__isValidParentheses() {
		
		String validParentheses = "[(){}]";
		assertThat(leetCodeAssesment.isParenthsValid(validParentheses)).isTrue();
		
		String inValidParentheses = "({)[}]";
		assertThat(leetCodeAssesment.isParenthsValid(inValidParentheses)).isFalse();
		
	}
	
	@Test
	public void test__twoSum() {
		int nums [] = {1,4,3,2};
		int expectedPosition [] = {0,3};
		assertThat(leetCodeAssesment.twoSum(nums, 3)).isEqualTo(expectedPosition);
		
		int nums1 [] = {-1,-2,-3,-4,-5};
		int expectedPosition1 [] = {2,4};
		assertThat(leetCodeAssesment.twoSum(nums1, -8)).isEqualTo(expectedPosition1);
	}
	
	@Test
	public void test_getLengthOfLastWord() {
		String str= "  The   Sky    is    Blue    ";
		assertThat(leetCodeAssesment.getLengthOfLastWord(str)).isEqualTo(4);

		
	}
	
}
