class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        if(n<needle.length()){
            return -1;
        }
        int m = needle.length();
        for(int i = 0;i<n;i++){
            if(i+m>n){
                return -1;
            }
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = i+1;
                boolean flag = true;
                for(int j = 1;j<needle.length() && k<n;j++,k++){
                    if(haystack.charAt(k) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return i;
                }
            }
        }
        return -1;
    }
}
