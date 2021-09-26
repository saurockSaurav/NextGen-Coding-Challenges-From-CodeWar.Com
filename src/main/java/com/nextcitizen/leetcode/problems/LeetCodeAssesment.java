package com.nextcitizen.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LeetCodeAssesment {
	
	/**
	 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
		A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
	 * Input: accounts = [[1,5],[7,3],[3,5]] Output: 10
			Explanation: 
			1st customer has wealth = 6
			2nd customer has wealth = 10 
			3rd customer has wealth = 8
			The 2nd customer is the richest with a wealth of 10.
	 * 
	 */
	
	public int findMaximumWealth(int[][] accounts) {
		int wealth = 0;

		for (int i = 0; i < accounts.length; i++) {
			int iwealth = 0;

			for (int j = 0; j < accounts[i].length; j++) {
				iwealth += accounts[i][j];
			}

			if (iwealth > wealth) {
				wealth = iwealth;
			}

		}
		return wealth;
	}

	/**
	 * 
	 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] 
	 * and each integer appears once or twice, return an array of all the integers that appears twice.
	 * 	 * Example 1: Input: nums = [4,3,2,7,8,2,3,1]  Output: [2,3]
		   Example 2: Input: nums = [1,1,2]  Output: [1]
	 */
	
	 public List<Integer> findAllDuplicatesInArray(int[] nums) {
	        
		 List<Integer> lst = new ArrayList<>();
		 Arrays.sort(nums);
		 int count = 1;
		 int twiceCount = 2;
		 
		 Map<Integer, Integer> mp = new HashMap<>();
		 
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Current Num:" + nums[i]);
				if (mp.containsKey(nums[i])) {
					mp.put(nums[i], mp.get(nums[i]) + 1);
				}
				else {
					mp.put(nums[i], count);	
				}
				System.out.println(mp);
			}
			
			for (Map.Entry<Integer, Integer> mapEntries : mp.entrySet()) {
			 if( mapEntries.getValue() == twiceCount) {
				 lst.add(mapEntries.getKey());
			 }
				
			}
		 return lst;
	 }

	/**
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one. Example 1: Input: nums = [2,2,1] Output: 1
	 * 
	 */
	public int findNumberThatIsNotRepititive(int[] nums) {
		int count = 1;
		int repitiveNumber = 0;
		Arrays.sort(nums);

		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Current Num:" + nums[i]);
			if (mp.containsKey(nums[i])) {
				mp.put(nums[i], count + 1);
			} else {
				mp.put(nums[i], count);
			}
			System.out.println(mp);
		}

		for (Map.Entry<Integer, Integer> mapEntries : mp.entrySet()) {
			if (mapEntries.getValue() == count) {
				repitiveNumber = mapEntries.getKey();
			}

		}
		return repitiveNumber;
	}

	/***
	 * Write an algorithm to determine if a number n is happy.A happy number is a
	 * number defined by the following process: Starting with any positive integer,
	 * replace the number by the sum of the squares of its digits. Repeat the
	 * process until the number equals 1 (where it will stay), or it loops endlessly
	 * in a cycle which does not include 1. Those numbers for which this process
	 * ends in 1 are happy. Example 1: Input: n = 19 Output: true Explanation: 1^2 +
	 * 9^2 = 82 8^2 + 2^2 = 68 6^2 + 8^2 = 100 1^2 + 0^2 + 0^2 = 1 Example 2: Input:
	 * n = 2 Output: false
	 */
	public boolean isHappyNumber(int input) {

		boolean isHappyNumber = false;
		char firstNum, secondNum;

		if (input == 1) {
			return true;
		} else if (input > 1 && input <= 9) {
			return false;
		} else {
			String str = String.valueOf(input);
			int len = str.length();
			for (int i = 0; i < len; i++) {
				System.out.println("firstNumber:" + str.charAt(i));
				System.out.println("secondNumber:" + str.charAt(i + 1));
				firstNum = str.charAt(i);
				secondNum = str.charAt(i + 1);
				int squr1 = Math.multiplyExact(firstNum, firstNum);
				int squr2 = Math.multiplyExact(secondNum, secondNum);
				System.out.println("squareRoot" + squr1 + squr2);
				int squareRoot = squr1 + squr2;
				if (squareRoot != 1) {
					str = String.valueOf(squareRoot);
				} else if (squareRoot == 1) {
					isHappyNumber = true;
				}
			}

		}
		return isHappyNumber;

	}

	/**
	 * Write an SQL query to report all the duplicate emails.
	 */
	public String sqlQueryToFindDupsEmails() {

		String sql = "select distinct p1.Email as Email from Person p1 where p1.Email is not null and (select count(*) from Person p2 where p1.Email = p2.Email) > 1 ";

		return sql;

	}

	/**
	 * Write an SQL query to find the employees who earn more than their managers. .
	 */
	public String sqlQueryToFindEmployeeEarnings() {

		String sql = "select e1.Name as Employee from Employee e1 where e1.Salary > (select e2.Salary from Employee e2 where e2.id = e1.ManagerId )";

		return sql;

	}

	/**
	 * Say you have an array for which the nth element is the price of a stock on
	 * day i. If you were only permitted to complete at most one transaction (i.e.,
	 * buy one and sell one share of the stock), design an algorithm to find the
	 * maximum profit. Note need to buy before you sell
	 * 
	 * Example 1: Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price =
	 * 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6, as selling
	 * price needs to be larger than buying price.
	 * 
	 * Example 2: Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no
	 * transaction is done, i.e. max profit = 0.
	 */

	public int maxProfitByBruteForce(int[] stockPrice) {

		int maxprofit = 0;
		int buyPrice = 0;
		int sellPrice = 0;

		for (int firstNumbr = 0; firstNumbr < stockPrice.length - 1; firstNumbr++) {
			for (int secondNumbr = firstNumbr + 1; secondNumbr < stockPrice.length; secondNumbr++) {
				int profit = stockPrice[secondNumbr] - stockPrice[firstNumbr];
				System.out.println("firstNumbr:" + stockPrice[firstNumbr]);
				System.out.println("secondNumbr:" + stockPrice[secondNumbr]);
				System.out.println("profit:" + profit);
				if (profit > maxprofit) {
					maxprofit = profit;
					buyPrice = stockPrice[firstNumbr];
					sellPrice = stockPrice[secondNumbr];
				}

			}
		}
		System.out.println("maxProfit : " + maxprofit + " BuyPrice :" + buyPrice + " SellPrice: " + sellPrice);
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
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid. An input string is valid if:
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Example: Input: s = "()" Output: true
	 * Example: Input: s = "{[]}" Output: true Example: Input: s = "([)]" Output:
	 * false
	 * 
	 */

	public boolean isParenthsValid(String s) {

		System.out.println("Input: " + s);

		if (s.length() < 2) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			System.out.println(stack);

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == ('[')) {
				stack.push(s.charAt(i));
			} else if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
				stack.pop();
			} else if (!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();

	}

	/**
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target. you may assume that each input
	 * would have exactly one solution, and you may not use the same element twice.
	 * you can return the answer in any order. Example: Input: nums = [2,7,11,15],
	 * target = 9 Output: [0,1] Output: Because nums[0] + nums[1] == 9, we return
	 * [0, 1]. Input: nums = [3,2,4], target = 6 Output: [1,2] ///{-1,-2,-3,-4,-5};
	 */
	public int[] twoSum(int[] nums, int target) {

		int newarr[] = new int[2];
		System.out.println(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("Number: " + nums[i]);
			System.out.println("Target: " + target);
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("Next Number : " + nums[j]);
				if (nums[i] + nums[j] == target) {
					newarr[0] = i;
					System.out.println("Position1: " + newarr[0]);
					newarr[1] = j;
					System.out.println("Position2: " + newarr[1]);
				}
			}
		}

		return newarr;
	}

	/**
	 * Given a string s consisting of some words separated by some number of spaces,
	 * return the length of the last word in the string. A word is a maximal
	 * substring consisting of non-space characters only. Input: s = " fly me to the
	 * moon " Output: 4 Explanation: The last word is "moon" with length 4.
	 * 
	 */

	public int getLengthOfLastWord(String str) {

		String[] splitdString = str.trim().split("\\s+");
		int len = splitdString.length - 1;
		String lastword = splitdString[len];
		int lengthOfLastWord = lastword.length();
		return lengthOfLastWord;

	}
}
