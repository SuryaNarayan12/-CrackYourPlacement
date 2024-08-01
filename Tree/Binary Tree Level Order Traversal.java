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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curLevel = new ArrayList<>();
        curLevel.add(root.val);
        ans.add(curLevel);
        curLevel = new ArrayList<>();
        Queue<TreeNode> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){
            TreeNode curNode = pendingNodes.poll();
            if(curNode == null){
                if(!pendingNodes.isEmpty()){
                    ans.add(curLevel);
                    pendingNodes.add(null);
                    curLevel = new ArrayList<>();
                }
            }else{
                if(curNode.left != null){
                    pendingNodes.add(curNode.left);
                    curLevel.add(curNode.left.val);
                }
                if(curNode.right != null){
                    pendingNodes.add(curNode.right);
                    curLevel.add(curNode.right.val);
                }
            }
        }
        return ans;
    }
}
