class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length;
        int m = strs[0].length();
        for(int i = 0;i<m;i++){
            char ch = strs[0].charAt(i);
            boolean flag = true;
            for(int j = 1;j<n;j++){
                if(strs[j].length() <= i){
                    return ans;
                }
                if(ch !=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans += ch;
            }else{
                break;
            }
        }
        return ans;
    }
}
