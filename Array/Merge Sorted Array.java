class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int temp[] = mergeH(nums1,m,nums2,n);
       if(temp == null){
           return;
       }
       for(int i = 0;i<temp.length;i++){
           nums1[i] = temp[i];
       }
    }
    public int[] mergeH(int[] nums1, int m,int[] nums2, int n){
         if(n == 0){
            return null;
        }if(m == 0){
            nums1 = new int[n];
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }return nums1;
        }
        int i = 0;int j = 0;
        int k = 0;
        int temp[] = new int[n+m];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[k++] = nums1[i++];
            }
            else{
                temp[k++] = nums2[j++];                
            }
        }
        while(i<m){
            temp[k++] = nums1[i++];
        }
        while(j<n){        
            temp[k++] = nums2[j++];                         
        }
        return temp;
    }
}
