class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            if(ans < min*(j-i)) ans = min*(j-i);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return ans;
    }
}
