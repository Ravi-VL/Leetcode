/*
Intersection of Two Arrays

Problem Statement:

Given two arrays, write a function to compute their intersection.

Example 1:

	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]

Example 2:

	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]

Note:

    Each element in the result must be unique.
    The result can be in any order.

*/


// Difficulty Level -- Easy

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        
        if(nums1.length > nums2.length) {
            for(int num : nums1) {
                set.add(num);
            }
            findIntersection(set, nums2);
        }else {
            for(int num : nums2) {
                set.add(num);
            }
            findIntersection(set, nums1);
        }
        
        int output[] = new int[set.size()];
        int i = 0;
        for(int num : set) {
            output[i++] = num;
        }
        
        return output;
    }
    
    private static void findIntersection(Set<Integer> set, int nums[]) {
        Set<Integer> tempSet = new HashSet<Integer>();
        for(int num : nums) {
            if(set.contains(num)) {
                tempSet.add(num);
            }
        }
        set.removeAll(set);
        set.addAll(tempSet);
    }
}


/*

	Time complexity -- O(n)
	
	Space complexity -- O(n)

*/
