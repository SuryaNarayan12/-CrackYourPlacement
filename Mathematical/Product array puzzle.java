class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        if(n == 2){
            return new long[]{nums[1],nums[0]};
        }
        long[] ans = new long[n];
        int countZeros = 0;
        long product = 1;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                product = product * nums[i];
            }else{
                countZeros++;
            }
        }
        if(countZeros > 1){
            return ans;
        }
        if(countZeros == 1){
            for(int i = 0;i<n;i++){
                if(nums[i] == 0){
                    ans[i] = product;
                }else{
                    ans[i] = 0;
                }
            }
            return ans;
        }
        for(int i = 0;i<n;i++){
            ans[i] = product/nums[i];
        }
        return ans;
	} 
} 
