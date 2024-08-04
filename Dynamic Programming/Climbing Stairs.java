class Solution {
    public int climbStairs(int n) {
        int[] fib = new int[n+1];
        if(n<=3){
            return n;
        }
        fib[1] = 1;
        fib[2] = 2;
        fib[3] = 3;
        for(int i = 4;i<n+1;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
