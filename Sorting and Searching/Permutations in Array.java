class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<n;i++){
            if(arr1[n-i-1] + arr2[i] < k) return false;
        }
        return true;
    }
}
