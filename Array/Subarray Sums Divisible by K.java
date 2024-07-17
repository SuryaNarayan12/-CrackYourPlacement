class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum = nums[i];
            for(int j = i+1;j<n;j++){
                if(sum % k == 0) count++;
                sum += nums[j];
            }
            if(sum % k == 0) count++;
        }
        return count;
    }
}
