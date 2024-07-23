class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while(columnNumber > 0){
            int rem = columnNumber%26;
            char c = (char) (rem + '@');
            if(rem == 0){
                c = 'Z';
                ans = c + ans;
                columnNumber = columnNumber/26-1;
                continue;
            }
            ans = c + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
}
