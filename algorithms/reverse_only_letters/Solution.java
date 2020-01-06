/*
Reverse Only Letters

Problem Statement:

Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

Example 1:

	Input: "ab-cd"
	Output: "dc-ba"

Example 2:

	Input: "a-bC-dEf-ghIj"
	Output: "j-Ih-gfE-dCba"

Example 3:

	Input: "Test1ng-Leet=code-Q!"
	Output: "Qedo1ct-eeLg=ntse-T!"

Note:

    S.length <= 100
    33 <= S[i].ASCIIcode <= 122 
    S doesn't contain \ or "

*/

//Difficulty Level -- Easy

class Solution {
    public String reverseOnlyLetters(String S) {
        char arr[] = S.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: arr) {
            
            if( (Integer.valueOf(c) >= 65 && Integer.valueOf(c) <= 90)
              || (Integer.valueOf(c) >= 97 && Integer.valueOf(c) <= 122 ) ) {
                stack.add(c);
            }
            
        }
        int i=0;
        for(char c: arr) {
            
            if( (Integer.valueOf(c) >= 65 && Integer.valueOf(c) <= 90)
              || (Integer.valueOf(c) >= 97 && Integer.valueOf(c) <= 122 ) ) {
                arr[i] = stack.pop();
            }
            i++;
            
        }
        
        return String.valueOf(arr);
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/


