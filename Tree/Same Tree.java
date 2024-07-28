class Solution {
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
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right,q.right);
        return isEqual && left && right;
    }
}
