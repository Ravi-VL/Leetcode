/*
Relative Ranks

Problem Statement:

Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:

    N is a positive integer and won't exceed 10,000.
    All the scores of athletes are guaranteed to be unique.

*/

//Difficulty Level -- Easy

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        Map<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        String[] output = new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            treeMap.put(nums[i], i);
        }
        int valueTracker = 1;
        for(Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            
            if(valueTracker == 1) {
                output[entry.getValue()]  = "Gold Medal";
            }else if(valueTracker == 2) {
                output[entry.getValue()]  = "Silver Medal";
            }else if(valueTracker == 3) {
                output[entry.getValue()]  = "Bronze Medal";
            }else {
                output[entry.getValue()]  = String.valueOf(valueTracker);
            }
            
            valueTracker++;
        }
         
        return output;
    }
}

/*
	
	Time complexity -- O(nlogn)

	Space complexity -- O(n)

*/
