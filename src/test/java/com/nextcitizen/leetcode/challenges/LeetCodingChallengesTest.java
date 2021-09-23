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
	public void testMaxProfit() {
		int price1[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit1 = leetCodeAssesment.maxProfitByBruteForce(price1);
		assertThat(maxProfit1).isEqualTo(5);
		
		int price2[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit2 = leetCodeAssesment.maxProfitBySimpleSolution(price2);
		assertThat(maxProfit2).isEqualTo(5);
	}
	
	@Test
	public void isValidParentheses() {
		
		String validParentheses = "[(){}]";
		assertThat(leetCodeAssesment.isParenthsValid(validParentheses)).isTrue();
		
		String inValidParentheses = "({)[}]";
		assertThat(leetCodeAssesment.isParenthsValid(inValidParentheses)).isFalse();
		
		
	}
	
}
