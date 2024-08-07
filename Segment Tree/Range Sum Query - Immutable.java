class NumArray {
    int[] arr;
    int[] sumArr;
    int length;
    public NumArray(int[] nums) {
        this.arr = nums;
        this.sumArr = sumArray(arr);
        this.length = nums.length;
    }

    public int[] sumArray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            sum += arr[i];
            ans[i] = sum;
        }
        return ans;
    }
    
    public int sumRange(int left, int right) { 
        if(left == right) return arr[left];
        if(left == 0) return sumArr[right];
        if(right == length-1) return sumArr[right]-sumArr[left-1];
        int leftSum = sumRange(0,left-1);
        int rightSum = sumRange(right+1,length-1);
        return sumArr[length-1]-leftSum-rightSum;
    }
}
