/*
Valid Anagram

Problem Statement:

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

	Input: s = "anagram", t = "nagaram"
	Output: true

Example 2:

	Input: s = "rat", t = "car"
	Output: false

Note:
You may assume the string contains only lowercase alphabets.

*/

// Difficulty Level -- Easy

class Solution {
    public boolean isAnagram(String s, String t) {
        int frequency[] = new int[26];
        
        for(char c : s.toCharArray()) {
            frequency[c-'a']++;
        }
        
        for(char c : t.toCharArray()) {
            frequency[c-'a']--;
        }
        
        for(int num : frequency) {
            if(num != 0) {
                return false;   
            }
        }
        
        return true;
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/


