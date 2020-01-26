/*
Power of Four

Problem Statement:

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

	Input: 16
	Output: true

Example 2:

	Input: 5
	Output: false

*/

//Difficulty Level -- Easy

class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1) {
            return true;
        }
        
        while(num != 0) {
            if(num%4 != 0) {
                return false;
            }
            num /= 4;
            if(num == 1) {
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
