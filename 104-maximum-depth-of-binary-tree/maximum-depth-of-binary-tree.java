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

    
    public static int findHeight(TreeNode root){
       if(root == null) return 0;

       int lh = findHeight(root.left);
       int rh = findHeight(root.right);

       return 1 + Integer.max(lh, rh);
    }

    public int maxDepth(TreeNode root) {
        return findHeight(root);
    }
}