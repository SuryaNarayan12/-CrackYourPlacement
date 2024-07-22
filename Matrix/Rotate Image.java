class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        transpose(matrix);
        for(int i = 0;i<n;i++){
            reverse(matrix[i]);
        }       
    }

    public void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }

     public void transpose(int[][] A) {
        int r = A.length, c = A[0].length;
        for(int i = 0;i<r;i++){
            for(int j = i+1;j<c;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }
}
