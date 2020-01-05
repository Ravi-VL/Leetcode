/*

To Lower Case

Problem Statement :

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:

	Input: "Hello"
	Output: "hello"

Example 2:

	Input: "here"
	Output: "here"

Example 3:

	Input: "LOVELY"
	Output: "lovely"

*/

// Difficulty Level -- Easy


class Solution {
    public String toLowerCase(String str) {
        char strArr[] = str.toCharArray();
        
        int asciiValue = 0;
        StringBuilder output = new StringBuilder();
        for(int i=0;i<strArr.length;i++) {
            
            asciiValue = strArr[i];
            if(asciiValue>=65 && asciiValue<=90) {
                asciiValue +=32;
            }
            strArr[i] = (char)asciiValue;
            
            output.append(strArr[i]);
            
        }
        
        return output.toString();
    }
}

/*

	Time complexity --  O(n)

	Space complexity -- O(n)

	where n is the length of the input string.

*/



