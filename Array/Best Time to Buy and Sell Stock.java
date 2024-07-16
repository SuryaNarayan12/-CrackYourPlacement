class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int curMin = prices[0];
        int maxDiff = 0;
        for(int i = 1;i<n;i++){
            if(curMin > prices[i]) curMin = prices[i];
            else{
                int diff = prices[i] - curMin;
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }
}
