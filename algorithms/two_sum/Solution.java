/*
Two Sum

Problem Statement:

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

*/

//Difficulty Level -- Easy

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            
            int complement = target - nums[i];
            if(tempMap.containsKey(complement)) {
                return new int[] {tempMap.get(complement), i};
            }
            tempMap.put(nums[i], i);
            
        }
        return new int[] {0,0};
    }  
    
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/
