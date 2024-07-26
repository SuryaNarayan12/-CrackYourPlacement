class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!stk.isEmpty())
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        String newS = "";
        while(!stk.isEmpty()){
            newS = stk.pop() + newS;
        }
        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!stk.isEmpty())
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        String newT = "";
        while(!stk.isEmpty()){
            newT = stk.pop() + newT;
        }
        if(newT.equals(newS)) return true;
        return false;
    }
}
