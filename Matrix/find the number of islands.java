class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] hasVisited = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!hasVisited[i][j] && grid[i][j] == '1'){
                    negate(hasVisited,grid,i,j);
                    count++;
                }
            }
        }
        return count++;
    }
    
    public void negate(boolean[][] hasVisited,char[][] grid,int i,int j){
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] == '0' || hasVisited[i][j]){
            return;
        }
        hasVisited[i][j] = true;
        negate(hasVisited,grid,i-1,j);
        negate(hasVisited,grid,i,j-1);
        negate(hasVisited,grid,i+1,j);
        negate(hasVisited,grid,i,j+1);
        negate(hasVisited,grid,i+1,j-1);
        negate(hasVisited,grid,i+1,j+1);
        negate(hasVisited,grid,i-1,j-1);
        negate(hasVisited,grid,i-1,j+1);
    }
}
