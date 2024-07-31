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
    int prev = -1; boolean first = true, out = false;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return out;
    }
    public void inorder(TreeNode root){
        if(root ==null) return;
        inorder(root.left);
        if(first || (prev < root.val && out)){prev = root.val;first=false;out=true;}
        else out = false;
        
        inorder(root.right);
    }
}
