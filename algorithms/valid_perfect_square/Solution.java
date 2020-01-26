/*
Valid Perfect Square

Problem Statement:

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

	Input: 16
	Output: true

Example 2:

	Input: 14
	Output: false

*/

//Difficulty Level -- Easy

class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num == 0 || num == 1) {
            return true;
        }
        
        for(int i=1;i<=num/2;i++) {
            if(i*i == num) {
                return true;
            }
        }
        
        return false;
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(1)

*/

