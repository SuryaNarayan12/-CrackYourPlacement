class BSTIterator {
    TreeNode root;
    ArrayList<Integer> ans;
    int pointer;
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public BSTIterator(TreeNode root) {
        this.root = root;
        ans = new ArrayList<>();
        pointer = 0;
        inorder(root,ans);
    }
    
    public int next() {
        return ans.get(pointer++);
    }
    
    public boolean hasNext() {
        return pointer != ans.size();
    }
}
