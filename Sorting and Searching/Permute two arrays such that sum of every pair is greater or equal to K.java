class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0;i<n;i++){
            if(a[n-i-1] + b[i] < k) return false;
        }
        return true;
    }
}
