class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] isTraversed = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                    set(matrix,i,j,isTraversed);
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int  j = 0;j<m;j++){
                if(isTraversed[i][j]) matrix[i][j] = 0;
            }
        }
    }

    public void set(int[][] matrix,int i,int j,boolean[][] isTraversed){
        int tempI = i;
        int tempJ = j;
        while(tempI>=0){
            isTraversed[tempI--][j] = true;
        }
        tempI = i;
        while(tempI < matrix.length){
            isTraversed[tempI++][j] = true;
        }
        while(tempJ>=0){
            isTraversed[i][tempJ--] = true;
        }
        tempJ = j;
        while(tempJ<matrix[0].length){
            isTraversed[i][tempJ++] = true;
        }
    }
}
