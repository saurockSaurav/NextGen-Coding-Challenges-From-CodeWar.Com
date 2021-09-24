package com.nextcitizen.leetcode.challenges;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nextcitizen.leetcode.problems.LeetCodeAssesment;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeetCodeAssesment.class)
public class LeetCodingChallengesTest {

	private LeetCodeAssesment leetCodeAssesment ;

	@Before
	public void setUp() {
		this.leetCodeAssesment = new LeetCodeAssesment();
	}
	
	@Test
	public void testFindNonedups() {
		int num[] = { 7, 1, 7, 2, 3, 3, 1 };
		assertThat(leetCodeAssesment.findNonedups(num)).isEqualTo(2);
	}
	

	@Test
	public void testisHappyNumber() {
		assertThat(leetCodeAssesment.isHappyNumber(19)).isTrue();
	}
	
	
	@Test
	public void testMaxProfit() {
		int price1[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit1 = leetCodeAssesment.maxProfitByBruteForce(price1);
		assertThat(maxProfit1).isEqualTo(5);
		
		int price2[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit2 = leetCodeAssesment.maxProfitBySimpleSolution(price2);
		assertThat(maxProfit2).isEqualTo(5);
	}
	
	@Test
	public void Test_isValidParentheses() {
		
		String validParentheses = "[(){}]";
		assertThat(leetCodeAssesment.isParenthsValid(validParentheses)).isTrue();
		
		String inValidParentheses = "({)[}]";
		assertThat(leetCodeAssesment.isParenthsValid(inValidParentheses)).isFalse();
		
	}
	
	@Test
	public void Test_twoSum() {
		int nums [] = {1,4,3,2};
		int expectedPosition [] = {0,3};
		assertThat(leetCodeAssesment.twoSum(nums, 3)).isEqualTo(expectedPosition);
		
		int nums1 [] = {-1,-2,-3,-4,-5};
		int expectedPosition1 [] = {2,4};
		assertThat(leetCodeAssesment.twoSum(nums1, -8)).isEqualTo(expectedPosition1);
	}
	
	@Test
	public void Test_getLengthOfLastWord() {
		
		String str= "  The   Sky    is    Blue    ";
		assertThat(leetCodeAssesment.getLengthOfLastWord(str)).isEqualTo(4);

		
	}
	
}
