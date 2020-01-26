/*
Valid Parentheses

Problem Statement:

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

	Input: "()"
	Output: true

Example 2:

	Input: "()[]{}"
	Output: true

Example 3:

	Input: "(]"
	Output: false

Example 4:

	Input: "([)]"
	Output: false

Example 5:

	Input: "{[]}"
	Output: true

*/

//Difficulty Level -- Easy

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char charArray[] = s.toCharArray();
        if(s.equals("")) {
            return true;
        }
        if(charArray.length < 2) {
            return false;
        }

        for(Character character: charArray) {

            if(character == '(' || character == '[' || character == '{' )  {
                stack.push(character);
            }
            
            if(character != null && stack.isEmpty()) {
                return false;
            }

            if(character == ')' && !stack.isEmpty() && stack.peek() != '(') {
                return false;
            }

            if(character == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }

            if(character == ']' && !stack.isEmpty() && stack.peek() != '[') {
                return false;
            }

            if(character == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }

            if(character == '}' && !stack.isEmpty() && stack.peek() != '{') {
                return false;
            }

            if(character == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }

        }

        if(stack.isEmpty()) {
            return true;
        }


        return false;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/
