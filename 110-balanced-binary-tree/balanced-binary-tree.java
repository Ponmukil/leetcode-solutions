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

    int checkHeight(TreeNode root){

        if(root == null) return -1;

        int h1 = checkHeight(root.left);
        if(h1 == -2) return -2;
        int h2 = checkHeight(root.right);
        if(h2 == -2) return -2;

        if(Math.abs(h1-h2) > 1) return -2; 

        return Integer.max(h1, h2) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(checkHeight(root) == -2) return false;
        return true;
    }
}