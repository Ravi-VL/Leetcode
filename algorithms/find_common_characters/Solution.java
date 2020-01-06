/*
Find Common Characters

Problem Statement:

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]


Note:

    1 <= A.length <= 100
    1 <= A[i].length <= 100
    A[i][j] is a lowercase letter

*/

// Difficulty Level -- Easy

class Solution {
    public List<String> commonChars(String[] A) {
        
        if(A.length == 0) {
            return new ArrayList<String>();
        }
        
        int min_frequencies[] = new int[26];
        Arrays.fill(min_frequencies, Integer.MAX_VALUE);
        
        for(String str : A) {
            
            int chars[] = new int[26];
            
            for(char c : str.toCharArray()) {
                chars[c-'a']++;
            }
            
            for(int i=0;i<26;i++) {
                min_frequencies[i] = Math.min(chars[i], min_frequencies[i]);
            }
            
        }
        
        List<String> output = new ArrayList<String>();
        
        for(int i=0;i<26;i++) {
            while(min_frequencies[i] > 0) {
                output.add("" + (char) (i + 'a'));
                min_frequencies[i]--;
            }
        }
        
        return output;
    }

}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

