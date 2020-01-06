/*
Minimum Absolute Difference

Problem Statement:

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

    a, b are from arr
    a < b
    b - a equals to the minimum absolute difference of any two elements in arr

Example 1:

	Input: arr = [4,2,1,3]
	Output: [[1,2],[2,3],[3,4]]
	Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:

	Input: arr = [1,3,6,10,15]
	Output: [[1,3]]

Example 3:

	Input: arr = [3,8,-10,23,19,-4,-14,27]
	Output: [[-14,-10],[19,23],[23,27]]

Constraints:

    2 <= arr.length <= 10^5
    -10^6 <= arr[i] <= 10^6

*/

// Difficulty Level -- Easy

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minAbsDiff = Integer.MAX_VALUE;
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++) {
            int j = i+1;
            if( Math.abs(arr[j] - arr[i]) < minAbsDiff ) {
                minAbsDiff = Math.abs(arr[j] - arr[i]);
            }
        }
        
        for(int i=0;i<arr.length-1;i++) {
            int j = i+1;
            List<Integer> outputSubList = new ArrayList<Integer>();
            if( Math.abs(arr[j] - arr[i]) == minAbsDiff ) {
                    outputSubList.add(arr[i]);
                    outputSubList.add(arr[j]);
                }
            if(!outputSubList.isEmpty()) {
                outputList.add(outputSubList);
            }
        }
        
        return outputList;
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

