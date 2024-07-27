class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null){
            return false;
        }
        if(p != null && q == null){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        boolean isEqual = p.val == q.val;
        boolean left = isSameTree(p.left, q.right);
        boolean right = isSameTree(p.right,q.left);
        return isEqual && left && right;
    }
}
