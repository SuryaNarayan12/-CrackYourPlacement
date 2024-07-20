
class Solution {
    String removeDuplicates(String str) {
        int n = str.length();
        int[] hashtable = new int[256];
        String ans = "";
        char[] chars = str.toCharArray();
        for(int i = 0;i<n;i++){
            char c = chars[i];
            hashtable[c]++;
            if(hashtable[c] == 1) ans = ans + c;
        }
        return ans;
    }
}

