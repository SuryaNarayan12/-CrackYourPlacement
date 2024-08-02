class Solution {
    int maxW = 1;

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        List<Integer> minMaxAtDepth = new ArrayList<>();
        calculateNodeNumber(root, 0, 1, minMaxAtDepth);
        return maxW;
    }

    private void calculateNodeNumber(TreeNode root, int depth, int num, List<Integer> minMaxAtDepth) {
        if (root == null) return;
        if (minMaxAtDepth.size() == depth) {
            minMaxAtDepth.add(num); 
        }
        else {
            maxW = Math.max(maxW, num - minMaxAtDepth.get(depth) + 1);
        }

        calculateNodeNumber(root.left, depth + 1, num * 2, minMaxAtDepth);
        calculateNodeNumber(root.right, depth + 1, num * 2 + 1, minMaxAtDepth);
    }
}
