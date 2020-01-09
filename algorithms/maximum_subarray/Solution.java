/*
Maximum Subarray

Problem Statement:

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.

*/

//Difficulty Level -- Easy

class Solution {
    public int maxSubArray(int[] nums) {
        int start=0, end=0, currentSum=0;
        int sum = Integer.MIN_VALUE;
        
        while(start < nums.length && end < nums.length) {
            
            currentSum += nums[end];
            sum = Math.max(sum , currentSum);
            if(currentSum < 0) {
                start = end +1;
                end = start;
                currentSum=0;
            }else {
                end++;
            }
            
        }
        return sum;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(1)

*/
