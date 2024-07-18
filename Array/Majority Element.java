class Solution {
    public int majorityElement(int[] nums) {
        quickSort(nums,0,nums.length-1);
        int maxCount = 0;
        int maxCountElem = nums[0];
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums.length-i+count<maxCount){
                break;
            }
            if(nums[i] != nums[i-1]){
                count = 1;
                if(maxCount<=count){
                    maxCount = count;
                    maxCountElem = nums[i];
                }
            }
            else{
                count++;
                if(maxCount<=count){
                    maxCount = count;
                    maxCountElem = nums[i];
                }
            }
        }
        return maxCountElem;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
