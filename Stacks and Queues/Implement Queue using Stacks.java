class MyQueue {
    Stack<Integer> ans;
    Stack<Integer> ans1;

    public MyQueue() {
        ans = new Stack<>();
        ans1 = new Stack<>();
    }
    
    public void push(int x) {
        ans.push(x);
    }
    
    public int pop() {
        if(ans.isEmpty())return -1;
        while(ans.size() > 1){
            ans1.add(ans.pop());
        }
        int a = ans.pop();
        while(!ans1.isEmpty()){
            ans.add(ans1.pop());
        }
        return a;
    }
    
    public int peek() {
        while(!ans.isEmpty()){
            ans1.add(ans.pop());
        }
        int a = ans1.peek();
        while(!ans1.isEmpty()){
            ans.add(ans1.pop());
        }
        return a;
    }
    
    public boolean empty() {
        return ans.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
