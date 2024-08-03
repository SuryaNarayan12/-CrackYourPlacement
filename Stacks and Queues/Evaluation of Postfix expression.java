class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        // Your code here
        Stack<Integer> stk = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') stk.push(c-'0');
            else{
                if(c == '+'){
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(a+b);
                }else if(c == '-'){
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(b-a);
                }else if(c == '*'){
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(a*b);
                }
                else{
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(b/a);
                }
            }
        }
        return stk.pop();
    }
}
