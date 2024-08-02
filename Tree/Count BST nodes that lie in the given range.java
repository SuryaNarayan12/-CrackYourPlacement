class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root == null) return 0;
        int cur = 0;
        if(root.data >= l && root.data <= h){
            cur = 1;
        }
        int left = getCount(root.left,l,h);
        int right = getCount(root.right,l,h);
        return cur+left+right;
    }
}
