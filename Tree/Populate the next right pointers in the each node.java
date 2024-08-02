/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){
            Node curNode = pendingNodes.poll();
            if(curNode == null){
                if(!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }else{
                if(curNode.left != null){
                    pendingNodes.add(curNode.left);
                }
                if(curNode.right != null){
                    pendingNodes.add(curNode.right);
                }
                curNode.next = pendingNodes.peek(); 
            }
        }
        return root;
    }
}
