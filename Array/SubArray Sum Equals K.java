class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum = nums[i];
            if(sum == k){
                    count++;
                }
            for(int j = i+1;j<n;j++){
                sum = sum + nums[j];
                if(sum == k) count ++;
            }
        }
        return count;
    }
}
