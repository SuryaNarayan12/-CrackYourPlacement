class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] isDuplicate = new boolean[nums.length+1];
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            if(!isDuplicate[i]){
                isDuplicate[i] = true;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}
