/*
First Unique Character in a String

Problem Statement:

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.

Note: You may assume the string contain only lowercase letters.

*/

// Difficulty Level -- Easy

class Solution {
    public int firstUniqChar(String s) {
        int frequency[] = new int[26];
        
        for(char c : s.toCharArray()) {
            frequency[c-'a']++;
        }
        
        for(int i=0;i<s.length();i++) {
            if(frequency[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- Essentially O(1)

*/
