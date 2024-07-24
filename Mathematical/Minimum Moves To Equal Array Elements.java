class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int median = nums[nums.length/2];
        for(int i=0; i<nums.length; i++){
            count += Math.abs(median - nums[i]);
        }
        return count;
    }
}
