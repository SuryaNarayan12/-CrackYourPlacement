class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] neighborsCount = new int[n][m];
        getNeighborCount(board,neighborsCount);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == 0){
                    if(neighborsCount[i][j] == 3) board[i][j]++;
                }else{
                    if(neighborsCount[i][j] < 2 || neighborsCount[i][j] > 3) board[i][j]--;
                }
            }
        }
    }

    public void getNeighborCount(int[][] board,int[][] neighborsCount){
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                neighborsCount[i][j] = getCount(board,i,j);
            }
        }
    }

    public int getCount(int[][] board,int i ,int j){
        int count = 0;
        count += traverse(board,i-1,j);
        count += traverse(board,i+1,j);
        count += traverse(board,i,j-1);
        count += traverse(board,i,j+1);
        count += traverse(board,i+1,j-1);
        count += traverse(board,i+1,j+1);
        count += traverse(board,i-1,j-1);
        count += traverse(board,i-1,j+1);
        return count;
    }

    public int traverse(int[][] board,int i,int j){
        int n = board.length;
        int m = board[0].length;
        if(i < 0 || j < 0 || i>=n || j >= m || board[i][j] == 0) return 0;
        return 1;
    }
}
