/*
Unique Number of Occurrences

Problem Statement:

Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:

Input: arr = [1,2]
Output: false

Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

Constraints:

    1 <= arr.length <= 1000
    -1000 <= arr[i] <= 1000

*/


// Difficulty Level -- Easy

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurenceCount = new HashMap<Integer, Integer>();
        List<Integer> valuesList = new ArrayList<Integer>();
        Set<Integer> valuesSet = new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++) {
            if(occurenceCount.containsKey(arr[i])) {
                occurenceCount.put(arr[i], occurenceCount.get(arr[i])+1);
            }else {
                occurenceCount.put(arr[i], 1);
            }
        }
        
        for (Integer key: occurenceCount.keySet()) {
            valuesList.add(occurenceCount.get(key));
            valuesSet.add(occurenceCount.get(key));
        }
        
        if(valuesList.size() == valuesSet.size()) {
            return true;
        }
        
        return false;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

