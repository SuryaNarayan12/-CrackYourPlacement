class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(isValid(s)){
            return true;
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            int i = 0;
            int j = n-1;
            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    char cI = s.charAt(i);
                    char cJ = s.charAt(j);
                    if(isValid(sb.deleteCharAt(i).toString())) return true;
                    sb.insert(i,cI);
                    if(isValid(sb.deleteCharAt(j).toString())) return true;
                    return false;
                }
                i++;
                j--;
            }
            return false;
        }
    }

    public boolean isValid(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
