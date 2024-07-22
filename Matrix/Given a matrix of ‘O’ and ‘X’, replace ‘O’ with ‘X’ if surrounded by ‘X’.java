//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int N ,M;
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        N = m;
        M = n;
        replaceSurrounded(a);
        return a;
        
    }
     static void floodFillUtil(char mat[][], int x, 
                              int y, char prevV, 
                              char newV)
    {
        if (x < 0 || x >= M ||
            y < 0 || y >= N)
            return;
             
        if (mat[x][y] != prevV)
            return;
        mat[x][y] = newV;
        floodFillUtil(mat, x + 1, y, 
                      prevV, newV);
        floodFillUtil(mat, x - 1, y, 
                      prevV, newV);
        floodFillUtil(mat, x, y + 1, 
                      prevV, newV);
        floodFillUtil(mat, x, y - 1, 
                      prevV, newV);
    }
    
    static void replaceSurrounded(char mat[][])
    {
    for (int i = 0; i < M; i++)
        for (int j = 0; j < N; j++)
            if (mat[i][j] == 'O')
                mat[i][j] = '-';
    for (int i = 0; i < M; i++) 
        if (mat[i][0] == '-')
            floodFillUtil(mat, i, 0, 
                          '-', 'O');
    for (int i = 0; i < M; i++) 
        if (mat[i][N - 1] == '-')
            floodFillUtil(mat, i, N - 1,
                          '-', 'O');
    for (int i = 0; i < N; i++) 
        if (mat[0][i] == '-')
            floodFillUtil(mat, 0, i,
                          '-', 'O');
    for (int i = 0; i < N; i++)
        if (mat[M - 1][i] == '-')
            floodFillUtil(mat, M - 1, 
                          i, '-', 'O');
    for (int i = 0; i < M; i++)
        for (int j = 0; j < N; j++)
            if (mat[i][j] == '-')
                mat[i][j] = 'X';
    }
}
