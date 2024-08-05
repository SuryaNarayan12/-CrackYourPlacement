class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        Node result = null;
        while(root != null){
            result = mergeSorted(result,root);
            root = root.next;
        }
        return result;
    }
    
    Node mergeSorted(Node a,Node b){
        if(a == null)return b;
        if(b == null) return a;
        Node result = null;
        if(a.data < b.data){
            result = a;
            result.bottom = mergeSorted(a.bottom,b);
        }else{
            result = b;
            result.bottom = mergeSorted(a,b.bottom);
        }
        return result;
    }
}
