class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean[] isPresent = new boolean[1000001];
        for(int i = 0;i<size;i++){
            if(arr[i] > 0){
                isPresent[arr[i]] = true;
            }
        }
        for(int i = 1;i<1000001;i++){
            if(!isPresent[i])
            return i;
        }
        return -1;
    }
