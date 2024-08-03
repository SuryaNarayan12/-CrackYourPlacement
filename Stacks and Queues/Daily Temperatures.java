class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> ans = new Stack<Integer>();
        int[] res = new int[n];
        for(int i = n-1;i>= 0;i--){
            if(ans.isEmpty()){
                ans.push(i);
                res[i] = 0;
            }
            if(temperatures[ans.peek()] > temperatures[i]){
                res[i] = ans.peek()-i;
                ans.push(i);
            }
            else{
                while(!ans.isEmpty() && temperatures[ans.peek()] <= temperatures[i]){
                    ans.pop();
                }
                if(ans.isEmpty()){
                    res[i] = 0;
                    ans.push(i);
                }else {
                    res[i] = ans.peek()-i;
                    ans.push(i);
                }
            }
        }
        return res;
    }
}
