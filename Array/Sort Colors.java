class Solution {
    public void sortColors(int[] nums) {
        int countOne = 0;
        int countZero = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                countZero++;
            }
            if(nums[i] == 1){
                countOne++;
            }
        } 
        for(int i = 0;i<n;i++){
            if(countZero>0){
                nums[i] = 0;
                countZero--;
            }
            else if(countOne>0){
                nums[i] = 1;
                countOne--;
            }else nums[i] = 2;
        }
    }
}
