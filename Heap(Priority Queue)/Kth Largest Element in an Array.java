class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] hashtable = new int[200001];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            hashtable[nums[i]+100000]++;
        }
        int count = 0;
        for(int i = 200000;i>=0;i--){
            if(hashtable[i]>0){
                count = count+hashtable[i];
            }
            if(count >= k){
                return i-100000;
            }
        }
        return -1;
    }
}
