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
    void merge(TreeNode root1, TreeNode root2){

        if(root1 == null || root2 == null) return;
        int val1 = (root1 == null) ? 0 : root1.val;
        int val2 = (root2 == null) ? 0 : root2.val;

        root1.val = val1 + val2;
        if(root1.left == null && root2.left != null){
            root1.left = root2.left;
        }
        else merge(root1.left, root2.left);
        if(root1.right == null && root2.right != null){
            root1.right = root2.right;
        }
        else merge(root1.right, root2.right);
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 != null) return root2;
        
        merge(root1, root2);
        return root1;
    }
}