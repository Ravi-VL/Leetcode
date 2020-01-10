/*
Plus One

Problem Statement:

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

	Input: [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.

Example 2:

	Input: [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.

*/


//Difficulty Level -- Easy

class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1]==9) {
            
            if(digits.length == 1) {
                int newArr[] = {1, 0};
                return newArr;
            }
            
            int count=0;
            for(int i=digits.length-1;i>=0;i--) {
                if(digits[i] == 9) {
                    count++;
                }else {
                    break;
                }
            }
            
            if(count == digits.length) {
                int newArr[] = new int[digits.length+1];
                newArr[0] = 1;
                return newArr;
            }else {
                int newArr[] = new int[digits.length];
                for(int i=0; i<newArr.length; i++) {
                if(i<=newArr.length-count-2) {
                    newArr[i] = digits[i];
                }
                if(i==newArr.length-count-1) {
                    newArr[i] = digits[i]+1;
                }
              }
                
                return newArr;
            }
            
        }else {
            digits[digits.length-1]++;
            return digits;
        }
    }
}

/*
	
	Time complexity -- O(n)

	Space complexity -- O(n)

*/

