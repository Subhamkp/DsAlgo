/*
 * @lc app=leetcode id=1008 lang=java
 *
 * [1008] Construct Binary Search Tree from Preorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {    
        return solve(preorder,0,preorder.length - 1);
    }
    public TreeNode solve(int[] preorder, int start, int end) {
        if(start > end) return null;

        TreeNode t = new TreeNode(preorder[start]);

        int k = start + 1;
        while( k <= end && preorder[k] < preorder[start]) k++;

        t.left = solve(preorder,start + 1,k - 1);
        t.right = solve(preorder,k,end);

        return t;
    } 
}
// @lc code=end

