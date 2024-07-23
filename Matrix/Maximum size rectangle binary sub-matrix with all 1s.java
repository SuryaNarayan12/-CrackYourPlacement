//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int matrix[][], int row, int col) {
        // add code here.
        if (row == 0)
            return 0;
        int max = 0;
        int [][] dp = new int [row][col];
        // calculate the height
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (i == 0) {
                    dp[i][j] = matrix[i][j] ;
                }
                else {
                    if (matrix[i][j] == 1)
                        dp[i][j] = dp[i - 1][j] + matrix[i][j];
                }
            }
        }
        for (int [] eachRow : dp) {
            max = Math.max(max, largestRectangleHistogram(eachRow));
        }
        return max;
    }
    
    public int largestRectangleHistogram(int [] h) {
        if (h == null || h.length == 0)
            return 0;
        int length = h.length;
        int [] left = new int [length];
        int [] right = new int [length];
        int max = 0;
        left[0] = -1;
        right[length - 1] = length;
        for (int i=1; i<length; i++) {
            int currentIndex = i - 1;
            while (currentIndex >= 0 && h[currentIndex] >= h[i]) {
                currentIndex = left[currentIndex];
            }
            left[i] = currentIndex;
        }
        for (int i=length - 2; i>=0; i--) {
            int currentIndex = i + 1;
            while (currentIndex < length && h[currentIndex] >= h[i]) {
                currentIndex = right[currentIndex];
            }
            right[i] = currentIndex;
        }
        for (int i=0; i<length; i++) {
            max = Math.max(max, h[i] * (right[i] - left[i] - 1));
        }
        return max;
    }
}
