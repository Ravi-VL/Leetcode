/*
Reverse Vowels of a String

Problem Statement:

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

	Input: "hello"
	Output: "holle"

Example 2:

	Input: "leetcode"
	Output: "leotcede"

Note:
The vowels does not include the letter "y".

*/

//Difficulty Level -- Easy

class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<Character>();
        int length = s.length();
        int len = 0;
        for(char c: s.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
              || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                stack.add(c);
            }
            len++;
        }
        
        StringBuilder str = new StringBuilder();
        
        for(char c: s.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
              || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                str.append(stack.pop());
            }else {
                str.append(c);
            }
            len++;
        }
        
        return str.toString();
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

