class Solution {
    public int maxProfit(int[] prices) {
        int first = 0;
        int n = prices.length;
        for(int i = 0;i<n-1;i++){
            if(prices[i] < prices[i+1]){
                int diff = prices[i+1]-prices[i];
                first = first + diff;
            }
        }
        int ans = maxProfit1(prices);
        if(ans > first) return ans;
        return first;
    }

    public int maxProfit1(int[] prices) {
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
