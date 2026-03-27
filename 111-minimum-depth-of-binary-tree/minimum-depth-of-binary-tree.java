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
    public int depth(TreeNode root, int d, int mindepth){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null){
            mindepth = Integer.min(mindepth, d);
            return mindepth;
        }
        return Integer.min(depth(root.left, d+1, mindepth), depth(root.right, d+1, mindepth));
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root, 1, Integer.MAX_VALUE);
    }
}