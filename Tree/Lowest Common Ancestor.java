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
    TreeNode curCommon;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        curCommon = root;
        if((p.val < root.val && q.val > root.val) || p.val == root.val || q.val == root.val || (p.val > root.val && q.val < root.val)) return curCommon;
        if(p.val< root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
        return lowestCommonAncestor(root.right,p,q);
    }
}
