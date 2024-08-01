class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> leaf = new ArrayList<>();
        inorder(root,inorder,leaf);
        if(inorder.size() == 1) return false;
        for(int i = 0;i<leaf.size();i++){
            if(leaf.get(i)  == 1) return true;
            int target= leaf.get(i);
            for(int j = 0;j<inorder.size();j++){
                if(inorder.get(j) == target){
                    if(j == 0 || j == inorder.size()-1)continue;
                    else{
                        if(inorder.get(j-1) == target-1 && inorder.get(j+1) == target+1) return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static void inorder(Node root,ArrayList<Integer> ans, ArrayList<Integer> leaf){
        if(root == null) return ;
        if(root.left == null && root.right == null) leaf.add(root.data);
        inorder(root.left,ans,leaf);
        ans.add(root.data);
        inorder(root.right,ans,leaf);
    }
} 
