/*
Max Consecutive Ones

Problem Statement:

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

	Input: [1,1,0,1,1,1]
	Output: 3
	Explanation: The first two digits or the last three digits are consecutive 1s.
	    The maximum number of consecutive 1s is 3.

Note:

    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000

*/

//Difficulty Level -- Easy

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index = 0;
        int consecutiveOnes[] = new int[nums.length];
        for(int num : nums) {
            
            if(num == 1) {
                consecutiveOnes[index]++;
            }else {
                index++;
            }
            
        }
        
        return Arrays.stream(consecutiveOnes).max().getAsInt();
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

