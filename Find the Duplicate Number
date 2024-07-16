class Solution {
    public int findDuplicate(int[] nums) {
        int[] isDuplicate = new int[100001];
        for(int i = 0;i<nums.length;i++){
            isDuplicate[nums[i]]++;
            if(isDuplicate[nums[i]]> 1) return nums[i];
        }
       
        return 100001;
    }
}
