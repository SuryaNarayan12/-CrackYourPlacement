class Solution {
    public int reversePairs(int[] nums) {
        count = 0;
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }
    public int[] mergeSort(int[] nums, int lo, int hi) {
        if (lo == hi) {
            int[] bres = new int[1];
            bres[0] = nums[lo];
            return bres;
        }
        int mid = (lo + hi) / 2;
        int[] left = mergeSort(nums, lo, mid);
        int[] right = mergeSort(nums, mid + 1, hi);
        return merge(left, right);
    }
    int count;
    public int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if ((long)left[i] > (long)right[j] * 2) {
                count += left.length - i;
                j++;
            } else {
                i++;
            }
        }
        
        i = 0;
        j = 0;
        int k = 0;
        int[] mergedArr = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArr[k] = left[i];
                i++;
                k++;
            } else {
                mergedArr[k] = right[j];
                j++;
                k++;
            }
        }
        
        while (i < left.length) {
            mergedArr[k] = left[i];
            i++;
            k++;
        }
        
        while (j < right.length) {
            mergedArr[k] = right[j];
            j++;
            k++;
        }
        return mergedArr;
    }
}
