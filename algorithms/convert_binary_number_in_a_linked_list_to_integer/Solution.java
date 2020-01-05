/*
Problem Statement

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Example 1:

	Input: head = [1,0,1]
	Output: 5
	Explanation: (101) in base 2 = (5) in base 10

Example 2:

	Input: head = [0]
	Output: 0

Example 3:

	Input: head = [1]
	Output: 1

Example 4:

	Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
	Output: 18880

Example 5:

	Input: head = [0,0]
	Output: 0

Constraints:

    The Linked List is not empty.
    Number of nodes will not exceed 30.
    Each node's value is either 0 or 1.

*/



// Difficulty Level -- Easy


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        ListNode temp = head;
        
        while(temp != null) {
            str.append(temp.val);
            temp = temp.next;
        }
        
        return convertBinaryToDecimal(str.toString());
    }
    
    public static int convertBinaryToDecimal(String num) {
        char numArr[] = num.toCharArray();
        int places = 1;
        int dec = 0;
        
        for(int i=numArr.length-1;i>=0;i--) {
            dec = dec + ( Character.getNumericValue(numArr[i]) ) * places;
            places = places * 2;
        }
        
        return dec;
    }
    
}


/* 
	
	Time complexity -- O(n)

	Space complexity -- O(n)

*/













