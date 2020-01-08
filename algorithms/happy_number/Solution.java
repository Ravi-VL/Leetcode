/*
Happy Number

Problem Statement:

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

	Input: 19
	Output: true
	Explanation: 
	1^2 + 9^2 = 82
	8^2 + 2^2 = 68
	6^2 + 8^2 = 100
	1^2 + 0^2 + 0^2 = 1

*/

//Difficulty Level -- Easy

class Solution {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        if(n == 1) {
            return true;
        }
        
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumOfSquares(n);
        }
        
        if(n == 1) {
            return true;
        }
        
        return false;
    }
    
    public static int sumOfSquares(int num) {
        int sum = 0;
        
        while(num != 0) {
            sum += (num%10)*(num%10);
            num /= 10;
        }
        
        return sum;
    }
    
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

