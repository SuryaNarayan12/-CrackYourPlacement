class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length()-1;
        while(s.charAt(left) == ' '){
            left++;
        }
        while(s.charAt(right) == ' '){
            right--;
        }
        if(left != 0 || right != s.length()-1){
            return reverseWords(s.substring(left,right+1));
        }
        String word = "";
        boolean isContinue = false;
        String ans = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' ' && isContinue){
                if(ans == ""){
                    ans = word+ans;
                    word = "";
                    isContinue = false;
                    continue;
                }
                ans = word +" " + ans;
                word = "";
                isContinue = false;
            }else{
                if(s.charAt(i) == ' '){
                    continue;
                }
                isContinue = true;
                word = word + s.charAt(i);
            }
        }
        if(ans ==""){
            return word;
        }
        ans = word+" "+ ans;
        return ans;
    }
}
