/*
Remove Duplicates from Sorted List

Problem Statement:

Given a sorted linked list, delete all duplicates such that each element appear only once.

	Example 1:

	Input: 1->1->2
	Output: 1->2

	Example 2:

	Input: 1->1->2->3->3
	Output: 1->2->3

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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode temp = head;
        
        while(temp != null) {
            set.add(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        ListNode prev = null;
        
        while(temp != null) {
            if(set.contains(temp.val)) {
                set.remove(temp.val);
                prev = temp;
            }else {
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        
        return head;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/




