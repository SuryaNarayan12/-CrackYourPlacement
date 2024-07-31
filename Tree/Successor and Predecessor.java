class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        ArrayList<Node> ans = new ArrayList<>();
        pre[0] = null;
        suc[0] = null;
        inorder(root,ans);
        boolean flag = false;
        int n = ans.size();
        for(int i = 0;i<n;i++){
            if(ans.get(i).data == key){
                flag = true;
                if(i-1 >= 0) pre[0] = ans.get(i-1);
                if(i+1 < n) suc[0] = ans.get(i+1);
            }
        }
        if(!flag){
            if(ans.get(0).data > key){
                suc[0] = ans.get(0);
                return;
            } 
            for(int i = n-1;i>=0;i--){
                if(ans.get(i).data < key){
                    pre[0] = ans.get(i);
                    if(i+1 < n)
                    suc[0] = ans.get(i+1);
                    break;
                }
            }
        }
    }
    
    public static void inorder(Node root,ArrayList<Node> ans){
        if(root == null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
}
