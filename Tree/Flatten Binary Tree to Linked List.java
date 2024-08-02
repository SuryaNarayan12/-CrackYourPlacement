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
    public void flatten(TreeNode root) {
        if(root == null) return;
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        TreeNode temp = root;
        while(ans.size() != 1){
            temp.right = new TreeNode(ans.get(1));
            ans.remove(1);
            temp.left = null;
            temp = temp.right;
        }
        root = root.right;
    }
    public void preorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
}
