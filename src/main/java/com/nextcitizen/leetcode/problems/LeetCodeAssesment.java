package com.nextcitizen.leetcode.problems;

import java.util.Stack;

public class LeetCodeAssesment {
	
	
 /**Say you have an array for which the nth element is the price of a stock on day i. 
    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit. 
    Note need to buy before you sell

    Example 1: 
    Input: [7,1,5,3,6,4]  Output: 5 
      Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.  Not 7-1 = 6, as selling price needs to be larger than buying price. 

	Example 2: 
	Input: [7,6,4,3,1]  Output: 0 
	  Explanation: In this case, no transaction is done, i.e. max profit = 0. 
*/

	
	public int maxProfitByBruteForce(int[] stockPrice) {

		int maxprofit = 0;
		int buyPrice = 0;
		int sellPrice = 0;

		for (int firstNumbr = 0; firstNumbr < stockPrice.length - 1; firstNumbr++) {
			for (int secondNumbr = firstNumbr + 1; secondNumbr < stockPrice.length; secondNumbr++) {
				int profit = stockPrice[secondNumbr] - stockPrice[firstNumbr];
				System.out.println("firstNumbr:"+ stockPrice[firstNumbr]);
				System.out.println("secondNumbr:"+ stockPrice[secondNumbr]);
				System.out.println("profit:"+ profit);
				if (profit > maxprofit) {
					maxprofit = profit;
					buyPrice = stockPrice[firstNumbr];
					sellPrice= stockPrice[secondNumbr];
				}
					
			}
		}
		System.out.println("maxProfit : "+ maxprofit +" BuyPrice :"+buyPrice + " SellPrice: "+ sellPrice);
		return maxprofit;
	}

	public int maxProfitBySimpleSolution(int[] prices) {
		
		int l = prices.length;

		int maxProfit = 0;
		
		int minPrice = prices[0];
		
		for (int i = 1; i < l; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}

		return maxProfit;
	}
	
		/**
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
			An input string is valid if:
				Open brackets must be closed by the same type of brackets.
				Open brackets must be closed in the correct order.
		 * Example:
		 * Input: s = "()" Output: true
		 * Example:
		 * Input: s = "{[]}" Output: true
		 * Example:
		 * Input: s = "([)]" Output: false
		 * 
		 */
	
		public boolean isParenthsValid(String s) {

			System.out.println("Input: " + s);
			
			String acceptableTypes = "(){}[]";

			if (acceptableTypes.length() < 2) {
				return false;
			}

			Stack<Character> stack = new Stack<Character>();
			
			for (int i = 0; i < s.length(); i++) { 
				System.out.println(s.charAt(i));
				System.out.println(stack);
				
				if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) ==  ('[' )){
					stack.push(s.charAt(i));
				}
				else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
					stack.pop();
				}
				else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
					stack.pop();
				}
				else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
					stack.pop();
				}
				else {
					return false;
				}
			}

			return stack.isEmpty();

		}
		
}
	

