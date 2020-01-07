/*
Contains Duplicate

Problem Statement:

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

	Input: [1,2,3,1]
	Output: true

Example 2:

	Input: [1,2,3,4]
	Output: false

Example 3:

	Input: [1,1,1,3,3,4,3,2,4,2]
	Output: true

*/


//Difficulty Level -- Easy

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums.length == 0 || nums.length == 1) {
            return false;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/




        
        
