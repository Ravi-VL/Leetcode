/*
Majority Element

Problem Statement:

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

	Input: [3,2,3]
	Output: 3

Example 2:

	Input: [2,2,1,1,1,2,2]
	Output: 2

*/

// Difficulty Level -- Easy

class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int majCount = 1;
        
        for(int i=1;i<nums.length;i++) {
            
            if(maj == nums[i]) {
                majCount++;
            }else {
                if( majCount > 0) {
                    majCount--;
                }else if(majCount == 0) {
                    maj = nums[i];
                    majCount++;
                }
            }
            
        }
        
        return maj;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(1)

*/


