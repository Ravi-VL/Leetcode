/*
Reverse Linked List

Problem Statement:

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        
        ListNode temp = head;
        
        while(temp != null) {
            stack.add(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(stack.size() > 0) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        
        return head;
    }
}

/*
	
	Time complexity -- O(n)

	Space complexity -- O(n)

*/



