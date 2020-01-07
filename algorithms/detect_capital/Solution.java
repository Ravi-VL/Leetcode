/*
Detect Capital

Problem Statement:

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:

	Input: "USA"
	Output: True

Example 2:

	Input: "FlaG"
	Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

*/

// Difficulty Level -- Easy


class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length() == 0 || word.length() == 1) {
            return true;
        }
        
        char wordArr[] = word.toCharArray();
        int firstLetterAscii = wordArr[0];
        
        if(firstLetterAscii >= 65 && firstLetterAscii <= 90) {
            return checkOtherChars(wordArr, 'c');
        }else if(firstLetterAscii >= 97 && firstLetterAscii <= 122) {
            return checkOtherChars(wordArr, 's');
        }
        
        return false;
    }
    
    public static boolean checkOtherChars(char wordArr[], char c) {
        
        for(int i=1;i<wordArr.length;i++) {
            if(c == 's' && wordArr[i] >= 65 && wordArr[i] <= 90) {
                return false;
            }
        }
            
        if(c == 'c') {
            
            int secondLetterAscii = wordArr[1];
            
            if(secondLetterAscii >= 65 && secondLetterAscii <= 90) {
                for(int i=2;i<wordArr.length;i++) {
                    if(wordArr[i] >= 97 && wordArr[i] <= 122) {
                        return false;
                    }
                }
            }else if(secondLetterAscii >= 97 && secondLetterAscii <= 122) {
                for(int i=2;i<wordArr.length;i++) {
                    if(wordArr[i] >= 65 && wordArr[i] <= 90) {
                        return false;
                    }
                }
            }
            
        }
        
        return true;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)	

*/




