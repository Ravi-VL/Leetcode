/*
Power of Three

Probelm Statement:

Given an integer, write a function to determine if it is a power of three.

Example 1:

	Input: 27
	Output: true

Example 2:

	Input: 0
	Output: false

Example 3:

	Input: 9
	Output: true

Example 4:

	Input: 45
	Output: false

*/

//Difficulty Level -- Easy

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1) {
            return true;
        }
        
        while(n != 0) {
            if(n%3 != 0) {
                return false;
            }
            n /= 3;
            if(n == 1) {
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
