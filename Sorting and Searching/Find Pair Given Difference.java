class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int l = 0;
        int r = 1;
        x = Math.abs(x);
        while (l <= r && r < n) {
            int diff = arr[r] - arr[l];
            if (diff == x && l != r) 
            {
                return 1;
            }
            else if (diff > x)
                l++;
            else 
                r++;
        }
        return -1;

    }
}
