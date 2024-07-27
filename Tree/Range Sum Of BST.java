class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.val >= low && root.val <= high){
            sum = root.val;
        }
        int left = rangeSumBST(root.left,low,high);
        int right  = rangeSumBST(root.right,low,high);
        return sum+left+right;
    }
}
