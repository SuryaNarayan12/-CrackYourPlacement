class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] index = new int[10000];
        for(int i=0; i<nums2.length; i++){
            index[nums2[i]] = i;
        }
        
        for(int i=0; i<nums1.length; i++){
            nums1[i] = findNextGreaterElement(nums2, index[nums1[i]]);
        }
        return nums1;
    }
    
    private int findNextGreaterElement(int[] nums2, int index){
        for(int j=index+1; j<nums2.length; j++){
            if(nums2[index] < nums2[j]){
                return nums2[j];
            }
        }
        return -1;
    }
}
