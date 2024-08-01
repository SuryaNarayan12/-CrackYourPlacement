class Solution {
    List<Integer> ans;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ans = new ArrayList<>();
        find(root, target, k);
        return ans;
    }

    void printKDistance(TreeNode root, TreeNode block, int k) {
        if(root == null || block == root || k < 0) return;
        if(k == 0) {
            ans.add(root.val);
            return;
        }
        printKDistance(root.left, block, k-1);
        printKDistance(root.right, block, k-1);

    }
    int find(TreeNode root, TreeNode target, int k) {

        if(root == null) return -1;
        if(root == target) {
            printKDistance(root, null, k);
            return 1;
        }
        int lSide = find(root.left, target, k);
        if(lSide != -1) {
            printKDistance(root, root.left, k-lSide);
            return lSide +1;
        }
        int rSide = find(root.right, target, k);
        if(rSide != -1) {
            printKDistance(root, root.right, k-rSide);
            return rSide +1;
        }
        return -1;
    }    
}
