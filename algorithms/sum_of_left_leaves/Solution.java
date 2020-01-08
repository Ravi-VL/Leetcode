/*
Sum of Left Leaves

Problem Statement:

Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

*/

// Difficulty Level -- Easy

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        
        if (root.left != null && root.left.left == null && root.left.right == null){
            sum = sum + root.left.val;
        }
        
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        
        return sum;
    }
}

/*

	Time complexity -- O(n)

	Space complexity -- O(1)

*/
