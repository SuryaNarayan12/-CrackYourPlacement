class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans = Long.MAX_VALUE;
        Collections.sort(a);
        int i = 0;
        while(i<n){
            if(i+m-1>= n) break;
            if(a.get(i+m-1) - a.get(i) < ans) ans = a.get(i+m-1)-a.get(i);
            i++;
        }
        return (ans == Long.MAX_VALUE) ? 0:ans;
    }
}
