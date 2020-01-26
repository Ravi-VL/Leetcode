/*
Repeated Substring Pattern

Problem Statement:

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:

	Input: "abab"
	Output: True
	Explanation: It's the substring "ab" twice.

Example 2:

	Input: "aba"
	Output: False

Example 3:

	Input: "abcabcabcabc"
	Output: True
	Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)


*/

// Difficulty Level -- Easy

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        for(int i=len/2;i>0;i--) {
            
            if(len%i == 0) {
                
                String subStr = s.substring(0,i);
                int noOfRepeats = len/i;
                StringBuilder str = new StringBuilder();
                for(int j=0;j<noOfRepeats;j++) {
                    str.append(subStr);
                }
                
                if(str.toString().equals(s)) {
                    return true;
                }
                
            }
            
        }
        
        return false;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(1)

*/

