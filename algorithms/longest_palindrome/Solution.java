/*
Longest Palindrome

Problem Statement:

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

*/

//Difficulty Level -- Easy

class Solution {
    public int longestPalindrome(String s) {
        int maxLength = 0;
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++) {
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(char c: frequency.keySet()) {
            maxLength += frequency.get(c) - frequency.get(c)%2;
            frequency.put(c, frequency.get(c)%2);
        }
        
        for(char c: frequency.keySet()) {
            if(frequency.get(c) > 0) {
                return maxLength+1;
            }
        }
        
        return maxLength;
    } 
    
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/
