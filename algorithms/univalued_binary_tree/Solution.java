/*
Univalued Binary Tree

Problem Statement:

A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:

Input: [1,1,1,1,1,null,1]
Output: true

Example 2:

Input: [2,2,2,5,2]
Output: false 

Note:

    The number of nodes in the given tree will be in the range [1, 100].
    Each node's value will be an integer in the range [0, 99].

*/


//Difficulty Level -- Easy


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
    List<Integer> values;
    public boolean isUnivalTree(TreeNode root) {
        values = new ArrayList<Integer>();
        dfs(root);
        for(int val: values) {
            if(val != values.get(0)) {
                return false;
            }
        }
        
        return true;
    }
    
    public void dfs(TreeNode node) {
        if(node != null) {
            values.add(node.val);
            if(node.left != null) {
                dfs(node.left);
            }
            if(node.right != null) {
                dfs(node.right);
            }
        }
        
    } 
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/


