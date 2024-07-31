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
    public int getMinimumDifference(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(root.left != null) left = Math.abs(root.val - max(root.left));
        if(root.right != null) right = Math.abs(root.val-min(root.right));
        int cur = Math.min(left,right);
        return Math.min(Math.min(helper(root.left),helper(root.right)),cur);
    }
    public int max(TreeNode root){
        if(root == null)return Integer.MIN_VALUE;
        return Math.max(Math.max(root.val,max(root.left)),max(root.right));
    }
    public int min(TreeNode root){
        if(root == null)return Integer.MAX_VALUE;
        return Math.min(Math.min(root.val,min(root.left)),min(root.right));
    }
}
