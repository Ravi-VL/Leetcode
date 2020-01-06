/*
Maximum Number of Balloons

Problem Statement:

Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:

	Input: text = "nlaebolko"
	Output: 1

Example 2:

	Input: text = "loonbalxballpoon"
	Output: 2

Example 3:

	Input: text = "leetcode"
	Output: 0

Constraints:

    1 <= text.length <= 10^4
    text consists of lower case English letters only.

*/

// Difficulty Level -- Easy

class Solution {
    public int maxNumberOfBalloons(String text) {
        int frequency[] = new int[26];
        int maxBalloons = 0;
        
        for(char c : text.toCharArray()) {
            frequency[c-'a']++;
        }
        
        while(true) {
            if( (frequency['b'-'a'] >= 1) && (frequency['a'-'a'] >= 1) && (frequency['l'-'a'] >= 2) && (frequency['o'-'a'] >= 2) && (frequency['n'-'a'] >= 1) ) {
                
                maxBalloons++;
                frequency['b'-'a'] -= 1;
                frequency['a'-'a'] -= 1;
                frequency['l'-'a'] -= 2;
                frequency['o'-'a'] -= 2;
                frequency['n'-'a'] -= 1;
                
            }else {
                return maxBalloons;
            }
            
        }
        
    }
}


/*

	Time complexity -- O(n)
	
	Space complexity -- O(1)

*/


