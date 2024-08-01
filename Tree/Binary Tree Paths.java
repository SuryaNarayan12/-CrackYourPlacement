class Solution {
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        helper(root.left,Integer.toString(root.val));
        helper(root.right,Integer.toString(root.val));
        if(root.left == null && root.right == null) {
            ans.add(Integer.toString(root.val));
        } 
        return ans;
    }

    public void helper(TreeNode root,String curPath){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            String append = "->"+Integer.toString(root.val);
            ans.add(curPath + append);
            return;
        }
        String append = "->"+Integer.toString(root.val);
        helper(root.left,curPath+append);
        helper(root.right,curPath + append);
    }
}
